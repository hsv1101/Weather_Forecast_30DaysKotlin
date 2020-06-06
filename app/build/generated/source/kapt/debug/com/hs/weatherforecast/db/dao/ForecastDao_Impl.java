package com.hs.weatherforecast.db.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.hs.weatherforecast.db.entity.CityEntity;
import com.hs.weatherforecast.db.entity.CoordEntity;
import com.hs.weatherforecast.db.entity.ForecastEntity;
import com.hs.weatherforecast.domain.model.ListItem;
import com.hs.weatherforecast.utils.typeconverters.DataConverter;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ForecastDao_Impl implements ForecastDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ForecastEntity> __insertionAdapterOfForecastEntity;

  private final EntityDeletionOrUpdateAdapter<ForecastEntity> __deletionAdapterOfForecastEntity;

  private final EntityDeletionOrUpdateAdapter<ForecastEntity> __updateAdapterOfForecastEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ForecastDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfForecastEntity = new EntityInsertionAdapter<ForecastEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Forecast` (`id`,`list`,`cityCountry`,`cityName`,`cityId`,`lon`,`lat`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ForecastEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = DataConverter.listToString(value.getList());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        final CityEntity _tmpCity = value.getCity();
        if(_tmpCity != null) {
          if (_tmpCity.getCityCountry() == null) {
            stmt.bindNull(3);
          } else {
            stmt.bindString(3, _tmpCity.getCityCountry());
          }
          if (_tmpCity.getCityName() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpCity.getCityName());
          }
          if (_tmpCity.getCityId() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindLong(5, _tmpCity.getCityId());
          }
          final CoordEntity _tmpCityCoord = _tmpCity.getCityCoord();
          if(_tmpCityCoord != null) {
            if (_tmpCityCoord.getLon() == null) {
              stmt.bindNull(6);
            } else {
              stmt.bindDouble(6, _tmpCityCoord.getLon());
            }
            if (_tmpCityCoord.getLat() == null) {
              stmt.bindNull(7);
            } else {
              stmt.bindDouble(7, _tmpCityCoord.getLat());
            }
          } else {
            stmt.bindNull(6);
            stmt.bindNull(7);
          }
        } else {
          stmt.bindNull(3);
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
        }
      }
    };
    this.__deletionAdapterOfForecastEntity = new EntityDeletionOrUpdateAdapter<ForecastEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Forecast` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ForecastEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfForecastEntity = new EntityDeletionOrUpdateAdapter<ForecastEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Forecast` SET `id` = ?,`list` = ?,`cityCountry` = ?,`cityName` = ?,`cityId` = ?,`lon` = ?,`lat` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ForecastEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = DataConverter.listToString(value.getList());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        final CityEntity _tmpCity = value.getCity();
        if(_tmpCity != null) {
          if (_tmpCity.getCityCountry() == null) {
            stmt.bindNull(3);
          } else {
            stmt.bindString(3, _tmpCity.getCityCountry());
          }
          if (_tmpCity.getCityName() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpCity.getCityName());
          }
          if (_tmpCity.getCityId() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindLong(5, _tmpCity.getCityId());
          }
          final CoordEntity _tmpCityCoord = _tmpCity.getCityCoord();
          if(_tmpCityCoord != null) {
            if (_tmpCityCoord.getLon() == null) {
              stmt.bindNull(6);
            } else {
              stmt.bindDouble(6, _tmpCityCoord.getLon());
            }
            if (_tmpCityCoord.getLat() == null) {
              stmt.bindNull(7);
            } else {
              stmt.bindDouble(7, _tmpCityCoord.getLat());
            }
          } else {
            stmt.bindNull(6);
            stmt.bindNull(7);
          }
        } else {
          stmt.bindNull(3);
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
        }
        stmt.bindLong(8, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Forecast";
        return _query;
      }
    };
  }

  @Override
  public void insertForecast(final ForecastEntity forecast) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfForecastEntity.insert(forecast);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteForecast(final ForecastEntity forecast) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfForecastEntity.handle(forecast);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateForecast(final ForecastEntity forecast) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfForecastEntity.handle(forecast);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAndInsert(final ForecastEntity forecast) {
    __db.beginTransaction();
    try {
      ForecastDao.DefaultImpls.deleteAndInsert(ForecastDao_Impl.this, forecast);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<ForecastEntity> getForecast() {
    final String _sql = "SELECT * FROM Forecast";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Forecast"}, false, new Callable<ForecastEntity>() {
      @Override
      public ForecastEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfList = CursorUtil.getColumnIndexOrThrow(_cursor, "list");
          final int _cursorIndexOfCityCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "cityCountry");
          final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "cityName");
          final int _cursorIndexOfCityId = CursorUtil.getColumnIndexOrThrow(_cursor, "cityId");
          final int _cursorIndexOfLon = CursorUtil.getColumnIndexOrThrow(_cursor, "lon");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final ForecastEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final List<ListItem> _tmpList;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfList);
            _tmpList = DataConverter.stringToList(_tmp);
            final CityEntity _tmpCity;
            if (! (_cursor.isNull(_cursorIndexOfCityCountry) && _cursor.isNull(_cursorIndexOfCityName) && _cursor.isNull(_cursorIndexOfCityId) && _cursor.isNull(_cursorIndexOfLon) && _cursor.isNull(_cursorIndexOfLat))) {
              final String _tmpCityCountry;
              _tmpCityCountry = _cursor.getString(_cursorIndexOfCityCountry);
              final String _tmpCityName;
              _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
              final Integer _tmpCityId;
              if (_cursor.isNull(_cursorIndexOfCityId)) {
                _tmpCityId = null;
              } else {
                _tmpCityId = _cursor.getInt(_cursorIndexOfCityId);
              }
              final CoordEntity _tmpCityCoord;
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
                _tmpCityCoord = new CoordEntity(_tmpLon,_tmpLat);
              }  else  {
                _tmpCityCoord = null;
              }
              _tmpCity = new CityEntity(_tmpCityCountry,_tmpCityCoord,_tmpCityName,_tmpCityId);
            }  else  {
              _tmpCity = null;
            }
            _result = new ForecastEntity(_tmpId,_tmpCity,_tmpList);
          } else {
            _result = null;
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
  public LiveData<ForecastEntity> getForecastByCoord(final double lat, final double lon) {
    final String _sql = "SELECT * FROM Forecast ORDER BY abs(lat-?) AND abs(lon-?) LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindDouble(_argIndex, lat);
    _argIndex = 2;
    _statement.bindDouble(_argIndex, lon);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Forecast"}, false, new Callable<ForecastEntity>() {
      @Override
      public ForecastEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfList = CursorUtil.getColumnIndexOrThrow(_cursor, "list");
          final int _cursorIndexOfCityCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "cityCountry");
          final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "cityName");
          final int _cursorIndexOfCityId = CursorUtil.getColumnIndexOrThrow(_cursor, "cityId");
          final int _cursorIndexOfLon = CursorUtil.getColumnIndexOrThrow(_cursor, "lon");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final ForecastEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final List<ListItem> _tmpList;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfList);
            _tmpList = DataConverter.stringToList(_tmp);
            final CityEntity _tmpCity;
            if (! (_cursor.isNull(_cursorIndexOfCityCountry) && _cursor.isNull(_cursorIndexOfCityName) && _cursor.isNull(_cursorIndexOfCityId) && _cursor.isNull(_cursorIndexOfLon) && _cursor.isNull(_cursorIndexOfLat))) {
              final String _tmpCityCountry;
              _tmpCityCountry = _cursor.getString(_cursorIndexOfCityCountry);
              final String _tmpCityName;
              _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
              final Integer _tmpCityId;
              if (_cursor.isNull(_cursorIndexOfCityId)) {
                _tmpCityId = null;
              } else {
                _tmpCityId = _cursor.getInt(_cursorIndexOfCityId);
              }
              final CoordEntity _tmpCityCoord;
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
                _tmpCityCoord = new CoordEntity(_tmpLon,_tmpLat);
              }  else  {
                _tmpCityCoord = null;
              }
              _tmpCity = new CityEntity(_tmpCityCountry,_tmpCityCoord,_tmpCityName,_tmpCityId);
            }  else  {
              _tmpCity = null;
            }
            _result = new ForecastEntity(_tmpId,_tmpCity,_tmpList);
          } else {
            _result = null;
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
    final String _sql = "Select count(*) from Forecast";
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
