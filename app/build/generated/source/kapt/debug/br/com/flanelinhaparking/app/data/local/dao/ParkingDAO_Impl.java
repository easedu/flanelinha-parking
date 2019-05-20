package br.com.flanelinhaparking.app.data.local.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import br.com.flanelinhaparking.app.parkings.model.Parking;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class ParkingDAO_Impl implements ParkingDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfParking;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfParking;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfParking;

  public ParkingDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfParking = new EntityInsertionAdapter<Parking>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Parking`(`id`,`name`,`address`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Parking value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAddress());
        }
      }
    };
    this.__deletionAdapterOfParking = new EntityDeletionOrUpdateAdapter<Parking>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Parking` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Parking value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfParking = new EntityDeletionOrUpdateAdapter<Parking>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Parking` SET `id` = ?,`name` = ?,`address` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Parking value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAddress());
        }
        stmt.bindLong(4, value.getId());
      }
    };
  }

  @Override
  public void insert(Parking parking) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfParking.insert(parking);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Parking parking) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfParking.handle(parking);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(Parking parking) {
    __db.beginTransaction();
    try {
      __updateAdapterOfParking.handle(parking);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Parking> loadParkings() {
    final String _sql = "SELECT * FROM parking";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfAddress = _cursor.getColumnIndexOrThrow("address");
      final List<Parking> _result = new ArrayList<Parking>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Parking _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpAddress;
        _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
        _item = new Parking(_tmpId,_tmpName,_tmpAddress);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
