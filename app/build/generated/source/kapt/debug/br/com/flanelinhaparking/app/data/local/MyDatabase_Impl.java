package br.com.flanelinhaparking.app.data.local;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import br.com.flanelinhaparking.app.data.local.dao.CarDAO;
import br.com.flanelinhaparking.app.data.local.dao.CarDAO_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class MyDatabase_Impl extends MyDatabase {
  private volatile CarDAO _carDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Car` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `plate` TEXT NOT NULL, `model` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"23116ff07e9bc9c55fb3cc1e8b9b08cc\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Car`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCar = new HashMap<String, TableInfo.Column>(3);
        _columnsCar.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsCar.put("plate", new TableInfo.Column("plate", "TEXT", true, 0));
        _columnsCar.put("model", new TableInfo.Column("model", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCar = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCar = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCar = new TableInfo("Car", _columnsCar, _foreignKeysCar, _indicesCar);
        final TableInfo _existingCar = TableInfo.read(_db, "Car");
        if (! _infoCar.equals(_existingCar)) {
          throw new IllegalStateException("Migration didn't properly handle Car(br.com.flanelinhaparking.app.cars.model.Car).\n"
                  + " Expected:\n" + _infoCar + "\n"
                  + " Found:\n" + _existingCar);
        }
      }
    }, "23116ff07e9bc9c55fb3cc1e8b9b08cc", "bd5c9ba53a0dbaf93e5842de51bba6d6");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "Car");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Car`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CarDAO carDao() {
    if (_carDAO != null) {
      return _carDAO;
    } else {
      synchronized(this) {
        if(_carDAO == null) {
          _carDAO = new CarDAO_Impl(this);
        }
        return _carDAO;
      }
    }
  }
}