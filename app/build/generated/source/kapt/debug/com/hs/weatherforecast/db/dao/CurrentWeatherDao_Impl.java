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
import com.hs.weatherforecast.db.entity.CloudsEntity;
import com.hs.weatherforecast.db.entity.CurrentWeatherEntity;
import com.hs.weatherforecast.db.entity.MainEntity;
import com.hs.weatherforecast.db.entity.WindEntity;
import com.hs.weatherforecast.domain.model.WeatherItem;
import com.hs.weatherforecast.utils.typeconverters.DataConverter;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CurrentWeatherDao_Impl implements CurrentWeatherDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CurrentWeatherEntity> __insertionAdapterOfCurrentWeatherEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCurrentWeather;

  public CurrentWeatherDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCurrentWeatherEntity = new EntityInsertionAdapter<CurrentWeatherEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CurrentWeather` (`visibility`,`timezone`,`dt`,`weather`,`name`,`id`,`base`,`temp`,`tempMin`,`grndLevel`,`tempKf`,`humidity`,`pressure`,`seaLevel`,`tempMax`,`all`,`deg`,`speed`) VALUES (?,?,?,?,?,nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrentWeatherEntity value) {
        if (value.getVisibility() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getVisibility());
        }
        if (value.getTimezone() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getTimezone());
        }
        if (value.getDt() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getDt());
        }
        final String _tmp;
        _tmp = DataConverter.weatherListToString(value.getWeather());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        if (value.getName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getName());
        }
        stmt.bindLong(6, value.getId());
        if (value.getBase() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBase());
        }
        final MainEntity _tmpMain = value.getMain();
        if(_tmpMain != null) {
          if (_tmpMain.getTemp() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindDouble(8, _tmpMain.getTemp());
          }
          if (_tmpMain.getTempMin() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindDouble(9, _tmpMain.getTempMin());
          }
          if (_tmpMain.getGrndLevel() == null) {
            stmt.bindNull(10);
          } else {
            stmt.bindDouble(10, _tmpMain.getGrndLevel());
          }
          if (_tmpMain.getTempKf() == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindDouble(11, _tmpMain.getTempKf());
          }
          if (_tmpMain.getHumidity() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindLong(12, _tmpMain.getHumidity());
          }
          if (_tmpMain.getPressure() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindDouble(13, _tmpMain.getPressure());
          }
          if (_tmpMain.getSeaLevel() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindDouble(14, _tmpMain.getSeaLevel());
          }
          if (_tmpMain.getTempMax() == null) {
            stmt.bindNull(15);
          } else {
            stmt.bindDouble(15, _tmpMain.getTempMax());
          }
        } else {
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
          stmt.bindNull(12);
          stmt.bindNull(13);
          stmt.bindNull(14);
          stmt.bindNull(15);
        }
        final CloudsEntity _tmpClouds = value.getClouds();
        if(_tmpClouds != null) {
          stmt.bindLong(16, _tmpClouds.getAll());
        } else {
          stmt.bindNull(16);
        }
        final WindEntity _tmpWind = value.getWind();
        if(_tmpWind != null) {
          if (_tmpWind.getDeg() == null) {
            stmt.bindNull(17);
          } else {
            stmt.bindDouble(17, _tmpWind.getDeg());
          }
          if (_tmpWind.getSpeed() == null) {
            stmt.bindNull(18);
          } else {
            stmt.bindDouble(18, _tmpWind.getSpeed());
          }
        } else {
          stmt.bindNull(17);
          stmt.bindNull(18);
        }
      }
    };
    this.__preparedStmtOfDeleteCurrentWeather = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM CurrentWeather";
        return _query;
      }
    };
  }

  @Override
  public void insertCurrentWeather(final CurrentWeatherEntity currentWeatherEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCurrentWeatherEntity.insert(currentWeatherEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAndInsert(final CurrentWeatherEntity currentWeatherEntity) {
    __db.beginTransaction();
    try {
      CurrentWeatherDao.DefaultImpls.deleteAndInsert(CurrentWeatherDao_Impl.this, currentWeatherEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteCurrentWeather() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCurrentWeather.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteCurrentWeather.release(_stmt);
    }
  }

  @Override
  public LiveData<CurrentWeatherEntity> getCurrentWeather() {
    final String _sql = "SELECT * FROM CurrentWeather";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"CurrentWeather"}, false, new Callable<CurrentWeatherEntity>() {
      @Override
      public CurrentWeatherEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility");
          final int _cursorIndexOfTimezone = CursorUtil.getColumnIndexOrThrow(_cursor, "timezone");
          final int _cursorIndexOfDt = CursorUtil.getColumnIndexOrThrow(_cursor, "dt");
          final int _cursorIndexOfWeather = CursorUtil.getColumnIndexOrThrow(_cursor, "weather");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBase = CursorUtil.getColumnIndexOrThrow(_cursor, "base");
          final int _cursorIndexOfTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "temp");
          final int _cursorIndexOfTempMin = CursorUtil.getColumnIndexOrThrow(_cursor, "tempMin");
          final int _cursorIndexOfGrndLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "grndLevel");
          final int _cursorIndexOfTempKf = CursorUtil.getColumnIndexOrThrow(_cursor, "tempKf");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
          final int _cursorIndexOfSeaLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "seaLevel");
          final int _cursorIndexOfTempMax = CursorUtil.getColumnIndexOrThrow(_cursor, "tempMax");
          final int _cursorIndexOfAll = CursorUtil.getColumnIndexOrThrow(_cursor, "all");
          final int _cursorIndexOfDeg = CursorUtil.getColumnIndexOrThrow(_cursor, "deg");
          final int _cursorIndexOfSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "speed");
          final CurrentWeatherEntity _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpVisibility;
            if (_cursor.isNull(_cursorIndexOfVisibility)) {
              _tmpVisibility = null;
            } else {
              _tmpVisibility = _cursor.getInt(_cursorIndexOfVisibility);
            }
            final Integer _tmpTimezone;
            if (_cursor.isNull(_cursorIndexOfTimezone)) {
              _tmpTimezone = null;
            } else {
              _tmpTimezone = _cursor.getInt(_cursorIndexOfTimezone);
            }
            final Long _tmpDt;
            if (_cursor.isNull(_cursorIndexOfDt)) {
              _tmpDt = null;
            } else {
              _tmpDt = _cursor.getLong(_cursorIndexOfDt);
            }
            final List<WeatherItem> _tmpWeather;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfWeather);
            _tmpWeather = DataConverter.weatherStringToList(_tmp);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpBase;
            _tmpBase = _cursor.getString(_cursorIndexOfBase);
            final MainEntity _tmpMain;
            if (! (_cursor.isNull(_cursorIndexOfTemp) && _cursor.isNull(_cursorIndexOfTempMin) && _cursor.isNull(_cursorIndexOfGrndLevel) && _cursor.isNull(_cursorIndexOfTempKf) && _cursor.isNull(_cursorIndexOfHumidity) && _cursor.isNull(_cursorIndexOfPressure) && _cursor.isNull(_cursorIndexOfSeaLevel) && _cursor.isNull(_cursorIndexOfTempMax))) {
              final Double _tmpTemp;
              if (_cursor.isNull(_cursorIndexOfTemp)) {
                _tmpTemp = null;
              } else {
                _tmpTemp = _cursor.getDouble(_cursorIndexOfTemp);
              }
              final Double _tmpTempMin;
              if (_cursor.isNull(_cursorIndexOfTempMin)) {
                _tmpTempMin = null;
              } else {
                _tmpTempMin = _cursor.getDouble(_cursorIndexOfTempMin);
              }
              final Double _tmpGrndLevel;
              if (_cursor.isNull(_cursorIndexOfGrndLevel)) {
                _tmpGrndLevel = null;
              } else {
                _tmpGrndLevel = _cursor.getDouble(_cursorIndexOfGrndLevel);
              }
              final Double _tmpTempKf;
              if (_cursor.isNull(_cursorIndexOfTempKf)) {
                _tmpTempKf = null;
              } else {
                _tmpTempKf = _cursor.getDouble(_cursorIndexOfTempKf);
              }
              final Integer _tmpHumidity;
              if (_cursor.isNull(_cursorIndexOfHumidity)) {
                _tmpHumidity = null;
              } else {
                _tmpHumidity = _cursor.getInt(_cursorIndexOfHumidity);
              }
              final Double _tmpPressure;
              if (_cursor.isNull(_cursorIndexOfPressure)) {
                _tmpPressure = null;
              } else {
                _tmpPressure = _cursor.getDouble(_cursorIndexOfPressure);
              }
              final Double _tmpSeaLevel;
              if (_cursor.isNull(_cursorIndexOfSeaLevel)) {
                _tmpSeaLevel = null;
              } else {
                _tmpSeaLevel = _cursor.getDouble(_cursorIndexOfSeaLevel);
              }
              final Double _tmpTempMax;
              if (_cursor.isNull(_cursorIndexOfTempMax)) {
                _tmpTempMax = null;
              } else {
                _tmpTempMax = _cursor.getDouble(_cursorIndexOfTempMax);
              }
              _tmpMain = new MainEntity(_tmpTemp,_tmpTempMin,_tmpGrndLevel,_tmpTempKf,_tmpHumidity,_tmpPressure,_tmpSeaLevel,_tmpTempMax);
            }  else  {
              _tmpMain = null;
            }
            final CloudsEntity _tmpClouds;
            if (! (_cursor.isNull(_cursorIndexOfAll))) {
              final int _tmpAll;
              _tmpAll = _cursor.getInt(_cursorIndexOfAll);
              _tmpClouds = new CloudsEntity(_tmpAll);
            }  else  {
              _tmpClouds = null;
            }
            final WindEntity _tmpWind;
            if (! (_cursor.isNull(_cursorIndexOfDeg) && _cursor.isNull(_cursorIndexOfSpeed))) {
              final Double _tmpDeg;
              if (_cursor.isNull(_cursorIndexOfDeg)) {
                _tmpDeg = null;
              } else {
                _tmpDeg = _cursor.getDouble(_cursorIndexOfDeg);
              }
              final Double _tmpSpeed;
              if (_cursor.isNull(_cursorIndexOfSpeed)) {
                _tmpSpeed = null;
              } else {
                _tmpSpeed = _cursor.getDouble(_cursorIndexOfSpeed);
              }
              _tmpWind = new WindEntity(_tmpDeg,_tmpSpeed);
            }  else  {
              _tmpWind = null;
            }
            _result = new CurrentWeatherEntity(_tmpVisibility,_tmpTimezone,_tmpMain,_tmpClouds,_tmpDt,_tmpWeather,_tmpName,_tmpId,_tmpBase,_tmpWind);
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
    final String _sql = "Select count(*) from CurrentWeather";
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
