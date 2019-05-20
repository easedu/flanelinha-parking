package br.com.flanelinhaparking.app.data.local.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import br.com.flanelinhaparking.app.cars.model.Car;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class CarDAO_Impl implements CarDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCar;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCar;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfCar;

  public CarDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCar = new EntityInsertionAdapter<Car>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Car`(`id`,`plate`,`model`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Car value) {
        stmt.bindLong(1, value.getId());
        if (value.getPlate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPlate());
        }
        if (value.getModel() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getModel());
        }
      }
    };
    this.__deletionAdapterOfCar = new EntityDeletionOrUpdateAdapter<Car>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Car` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Car value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfCar = new EntityDeletionOrUpdateAdapter<Car>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Car` SET `id` = ?,`plate` = ?,`model` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Car value) {
        stmt.bindLong(1, value.getId());
        if (value.getPlate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPlate());
        }
        if (value.getModel() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getModel());
        }
        stmt.bindLong(4, value.getId());
      }
    };
  }

  @Override
  public void insert(Car car) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCar.insert(car);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Car car) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfCar.handle(car);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(Car car) {
    __db.beginTransaction();
    try {
      __updateAdapterOfCar.handle(car);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Car> loadCars() {
    final String _sql = "SELECT * FROM car";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfPlate = _cursor.getColumnIndexOrThrow("plate");
      final int _cursorIndexOfModel = _cursor.getColumnIndexOrThrow("model");
      final List<Car> _result = new ArrayList<Car>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Car _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpPlate;
        _tmpPlate = _cursor.getString(_cursorIndexOfPlate);
        final String _tmpModel;
        _tmpModel = _cursor.getString(_cursorIndexOfModel);
        _item = new Car(_tmpId,_tmpPlate,_tmpModel);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
