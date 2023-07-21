package com.tofa.Villa_1412200037.Dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.tofa.Villa_1412200037.model.Villa;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class VillaDao_Impl implements VillaDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Villa> __insertionAdapterOfVilla;

  private final EntityDeletionOrUpdateAdapter<Villa> __deletionAdapterOfVilla;

  private final EntityDeletionOrUpdateAdapter<Villa> __updateAdapterOfVilla;

  public VillaDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfVilla = new EntityInsertionAdapter<Villa>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Villa_table` (`id`,`name`,`address`,`capacity`,`latitude`,`longitude`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Villa value) {
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
        if (value.getCapacity() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCapacity());
        }
        if (value.getLatitude() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindDouble(5, value.getLatitude());
        }
        if (value.getLongitude() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getLongitude());
        }
      }
    };
    this.__deletionAdapterOfVilla = new EntityDeletionOrUpdateAdapter<Villa>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Villa_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Villa value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfVilla = new EntityDeletionOrUpdateAdapter<Villa>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Villa_table` SET `id` = ?,`name` = ?,`address` = ?,`capacity` = ?,`latitude` = ?,`longitude` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Villa value) {
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
        if (value.getCapacity() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCapacity());
        }
        if (value.getLatitude() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindDouble(5, value.getLatitude());
        }
        if (value.getLongitude() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getLongitude());
        }
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public Object Insertvilla(final Villa villa, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfVilla.insert(villa);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object Deletevilla(final Villa villa, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfVilla.handle(villa);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object Updatevilla(final Villa villa, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfVilla.handle(villa);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<Villa>> getAllVilla() {
    final String _sql = "SELECT * FROM `villa_table` ORDER BY name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"villa_table"}, new Callable<List<Villa>>() {
      @Override
      public List<Villa> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfCapacity = CursorUtil.getColumnIndexOrThrow(_cursor, "capacity");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final List<Villa> _result = new ArrayList<Villa>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Villa _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final String _tmpCapacity;
            if (_cursor.isNull(_cursorIndexOfCapacity)) {
              _tmpCapacity = null;
            } else {
              _tmpCapacity = _cursor.getString(_cursorIndexOfCapacity);
            }
            final Double _tmpLatitude;
            if (_cursor.isNull(_cursorIndexOfLatitude)) {
              _tmpLatitude = null;
            } else {
              _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
            }
            final Double _tmpLongitude;
            if (_cursor.isNull(_cursorIndexOfLongitude)) {
              _tmpLongitude = null;
            } else {
              _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
            }
            _item = new Villa(_tmpId,_tmpName,_tmpAddress,_tmpCapacity,_tmpLatitude,_tmpLongitude);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
