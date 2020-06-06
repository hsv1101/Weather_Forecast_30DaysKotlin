package com.hs.weatherforecast.db.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.hs.weatherforecast.db.entity.CitiesForSearchEntity;
import com.hs.weatherforecast.db.entity.CoordEntity;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CitiesForSearchDao_Impl implements CitiesForSearchDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CitiesForSearchEntity> __insertionAdapterOfCitiesForSearchEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCities;

  public CitiesForSearchDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCitiesForSearchEntity = new EntityInsertionAdapter<CitiesForSearchEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CitiesForSearch` (`administrative`,`Country`,`fullName`,`county`,`importance`,`Id`,`lon`,`lat`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CitiesForSearchEntity value) {
        if (value.getAdministrative() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAdministrative());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCountry());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getCounty() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCounty());
        }
        if (value.getImportance() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getImportance());
        }
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getId());
        }
        final CoordEntity _tmpCoord = value.getCoord();
        if(_tmpCoord != null) {
          if (_tmpCoord.getLon() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindDouble(7, _tmpCoord.getLon());
          }
          if (_tmpCoord.getLat() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindDouble(8, _tmpCoord.getLat());
          }
        } else {
          stmt.bindNull(7);
          stmt.bindNull(8);
        }
      }
    };
    this.__preparedStmtOfDeleteCities = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM CitiesForSearch";
        return _query;
      }
    };
  }

  @Override
  public void insertCity(final CitiesForSearchEntity citiesForSearchEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCitiesForSearchEntity.insert(citiesForSearchEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCities(final List<CitiesForSearchEntity> cities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCitiesForSearchEntity.insert(cities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteCities() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCities.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteCities.release(_stmt);
    }
  }

  @Override
  public LiveData<List<CitiesForSearchEntity>> getCities() {
    final String _sql = "SELECT * FROM CitiesForSearch";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"CitiesForSearch"}, false, new Callable<List<CitiesForSearchEntity>>() {
      @Override
      public List<CitiesForSearchEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAdministrative = CursorUtil.getColumnIndexOrThrow(_cursor, "administrative");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "Country");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
          final int _cursorIndexOfCounty = CursorUtil.getColumnIndexOrThrow(_cursor, "county");
          final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "Id");
          final int _cursorIndexOfLon = CursorUtil.getColumnIndexOrThrow(_cursor, "lon");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final List<CitiesForSearchEntity> _result = new ArrayList<CitiesForSearchEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CitiesForSearchEntity _item;
            final String _tmpAdministrative;
            _tmpAdministrative = _cursor.getString(_cursorIndexOfAdministrative);
            final String _tmpCountry;
            _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpCounty;
            _tmpCounty = _cursor.getString(_cursorIndexOfCounty);
            final Integer _tmpImportance;
            if (_cursor.isNull(_cursorIndexOfImportance)) {
              _tmpImportance = null;
            } else {
              _tmpImportance = _cursor.getInt(_cursorIndexOfImportance);
            }
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final CoordEntity _tmpCoord;
            if (! (_cursor.isNull(_cursorIndexOfLon) && _cursor.isNull(_cursorIndexOfLat))) {
              final Double _tmpLon;
              if (_cursor.isNull(_cursorIndexOfLon)) {
                _tmpLon = null;
              } else {
                _tmpLon = _cursor.getDouble(_cursorIndexOfLon);
              }
              final Double _tmpLat;
              if (_cursor.isNull(_cursorIndexOfLat)) {
                _tmpLat = null;
              } else {
                _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
              }
              _tmpCoord = new CoordEntity(_tmpLon,_tmpLat);
            }  else  {
              _tmpCoord = null;
            }
            _item = new CitiesForSearchEntity(_tmpAdministrative,_tmpCountry,_tmpCoord,_tmpName,_tmpCounty,_tmpImportance,_tmpId);
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

  @Override
  public LiveData<List<CitiesForSearchEntity>> getCityByName(final String city) {
    final String _sql = "SELECT * FROM CitiesForSearch WHERE fullName like '%' || ? || '%'|| '%' ORDER BY fullName DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (city == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, city);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"CitiesForSearch"}, false, new Callable<List<CitiesForSearchEntity>>() {
      @Override
      public List<CitiesForSearchEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAdministrative = CursorUtil.getColumnIndexOrThrow(_cursor, "administrative");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "Country");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
          final int _cursorIndexOfCounty = CursorUtil.getColumnIndexOrThrow(_cursor, "county");
          final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "Id");
          final int _cursorIndexOfLon = CursorUtil.getColumnIndexOrThrow(_cursor, "lon");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final List<CitiesForSearchEntity> _result = new ArrayList<CitiesForSearchEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CitiesForSearchEntity _item;
            final String _tmpAdministrative;
            _tmpAdministrative = _cursor.getString(_cursorIndexOfAdministrative);
            final String _tmpCountry;
            _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpCounty;
            _tmpCounty = _cursor.getString(_cursorIndexOfCounty);
            final Integer _tmpImportance;
            if (_cursor.isNull(_cursorIndexOfImportance)) {
              _tmpImportance = null;
            } else {
              _tmpImportance = _cursor.getInt(_cursorIndexOfImportance);
            }
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final CoordEntity _tmpCoord;
            if (! (_cursor.isNull(_cursorIndexOfLon) && _cursor.isNull(_cursorIndexOfLat))) {
              final Double _tmpLon;
              if (_cursor.isNull(_cursorIndexOfLon)) {
                _tmpLon = null;
              } else {
                _tmpLon = _cursor.getDouble(_cursorIndexOfLon);
              }
              final Double _tmpLat;
              if (_cursor.isNull(_cursorIndexOfLat)) {
                _tmpLat = null;
              } else {
                _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
              }
              _tmpCoord = new CoordEntity(_tmpLon,_tmpLat);
            }  else  {
              _tmpCoord = null;
            }
            _item = new CitiesForSearchEntity(_tmpAdministrative,_tmpCountry,_tmpCoord,_tmpName,_tmpCounty,_tmpImportance,_tmpId);
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

  @Override
  public int getCount() {
    final String _sql = "Select count(*) from CitiesForSearch";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
