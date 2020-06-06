package com.hs.weatherforecast.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.hs.weatherforecast.db.dao.CitiesForSearchDao;
import com.hs.weatherforecast.db.dao.CitiesForSearchDao_Impl;
import com.hs.weatherforecast.db.dao.CurrentWeatherDao;
import com.hs.weatherforecast.db.dao.CurrentWeatherDao_Impl;
import com.hs.weatherforecast.db.dao.ForecastDao;
import com.hs.weatherforecast.db.dao.ForecastDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherDatabase_Impl extends WeatherDatabase {
  private volatile ForecastDao _forecastDao;

  private volatile CurrentWeatherDao _currentWeatherDao;

  private volatile CitiesForSearchDao _citiesForSearchDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Forecast` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `list` TEXT, `cityCountry` TEXT, `cityName` TEXT, `cityId` INTEGER, `lon` REAL, `lat` REAL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CurrentWeather` (`visibility` INTEGER, `timezone` INTEGER, `dt` INTEGER, `weather` TEXT, `name` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `base` TEXT, `temp` REAL, `tempMin` REAL, `grndLevel` REAL, `tempKf` REAL, `humidity` INTEGER, `pressure` REAL, `seaLevel` REAL, `tempMax` REAL, `all` INTEGER, `deg` REAL, `speed` REAL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CitiesForSearch` (`administrative` TEXT, `Country` TEXT, `fullName` TEXT, `county` TEXT, `importance` INTEGER, `Id` TEXT NOT NULL, `lon` REAL, `lat` REAL, PRIMARY KEY(`Id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ad782e1a6ba0faca2c14ccb280a1a469')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Forecast`");
        _db.execSQL("DROP TABLE IF EXISTS `CurrentWeather`");
        _db.execSQL("DROP TABLE IF EXISTS `CitiesForSearch`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
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
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsForecast = new HashMap<String, TableInfo.Column>(7);
        _columnsForecast.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("list", new TableInfo.Column("list", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("cityCountry", new TableInfo.Column("cityCountry", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("cityName", new TableInfo.Column("cityName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("cityId", new TableInfo.Column("cityId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("lon", new TableInfo.Column("lon", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("lat", new TableInfo.Column("lat", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysForecast = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesForecast = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoForecast = new TableInfo("Forecast", _columnsForecast, _foreignKeysForecast, _indicesForecast);
        final TableInfo _existingForecast = TableInfo.read(_db, "Forecast");
        if (! _infoForecast.equals(_existingForecast)) {
          return new RoomOpenHelper.ValidationResult(false, "Forecast(com.hs.weatherforecast.db.entity.ForecastEntity).\n"
                  + " Expected:\n" + _infoForecast + "\n"
                  + " Found:\n" + _existingForecast);
        }
        final HashMap<String, TableInfo.Column> _columnsCurrentWeather = new HashMap<String, TableInfo.Column>(18);
        _columnsCurrentWeather.put("visibility", new TableInfo.Column("visibility", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("timezone", new TableInfo.Column("timezone", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("dt", new TableInfo.Column("dt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("weather", new TableInfo.Column("weather", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("base", new TableInfo.Column("base", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("temp", new TableInfo.Column("temp", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("tempMin", new TableInfo.Column("tempMin", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("grndLevel", new TableInfo.Column("grndLevel", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("tempKf", new TableInfo.Column("tempKf", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("humidity", new TableInfo.Column("humidity", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("pressure", new TableInfo.Column("pressure", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("seaLevel", new TableInfo.Column("seaLevel", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("tempMax", new TableInfo.Column("tempMax", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("all", new TableInfo.Column("all", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("deg", new TableInfo.Column("deg", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("speed", new TableInfo.Column("speed", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCurrentWeather = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCurrentWeather = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCurrentWeather = new TableInfo("CurrentWeather", _columnsCurrentWeather, _foreignKeysCurrentWeather, _indicesCurrentWeather);
        final TableInfo _existingCurrentWeather = TableInfo.read(_db, "CurrentWeather");
        if (! _infoCurrentWeather.equals(_existingCurrentWeather)) {
          return new RoomOpenHelper.ValidationResult(false, "CurrentWeather(com.hs.weatherforecast.db.entity.CurrentWeatherEntity).\n"
                  + " Expected:\n" + _infoCurrentWeather + "\n"
                  + " Found:\n" + _existingCurrentWeather);
        }
        final HashMap<String, TableInfo.Column> _columnsCitiesForSearch = new HashMap<String, TableInfo.Column>(8);
        _columnsCitiesForSearch.put("administrative", new TableInfo.Column("administrative", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCitiesForSearch.put("Country", new TableInfo.Column("Country", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCitiesForSearch.put("fullName", new TableInfo.Column("fullName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCitiesForSearch.put("county", new TableInfo.Column("county", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCitiesForSearch.put("importance", new TableInfo.Column("importance", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCitiesForSearch.put("Id", new TableInfo.Column("Id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCitiesForSearch.put("lon", new TableInfo.Column("lon", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCitiesForSearch.put("lat", new TableInfo.Column("lat", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCitiesForSearch = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCitiesForSearch = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCitiesForSearch = new TableInfo("CitiesForSearch", _columnsCitiesForSearch, _foreignKeysCitiesForSearch, _indicesCitiesForSearch);
        final TableInfo _existingCitiesForSearch = TableInfo.read(_db, "CitiesForSearch");
        if (! _infoCitiesForSearch.equals(_existingCitiesForSearch)) {
          return new RoomOpenHelper.ValidationResult(false, "CitiesForSearch(com.hs.weatherforecast.db.entity.CitiesForSearchEntity).\n"
                  + " Expected:\n" + _infoCitiesForSearch + "\n"
                  + " Found:\n" + _existingCitiesForSearch);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ad782e1a6ba0faca2c14ccb280a1a469", "7d85c4bb23790f2413a2064b3abde03d");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Forecast","CurrentWeather","CitiesForSearch");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Forecast`");
      _db.execSQL("DELETE FROM `CurrentWeather`");
      _db.execSQL("DELETE FROM `CitiesForSearch`");
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
  public ForecastDao forecastDao() {
    if (_forecastDao != null) {
      return _forecastDao;
    } else {
      synchronized(this) {
        if(_forecastDao == null) {
          _forecastDao = new ForecastDao_Impl(this);
        }
        return _forecastDao;
      }
    }
  }

  @Override
  public CurrentWeatherDao currentWeatherDao() {
    if (_currentWeatherDao != null) {
      return _currentWeatherDao;
    } else {
      synchronized(this) {
        if(_currentWeatherDao == null) {
          _currentWeatherDao = new CurrentWeatherDao_Impl(this);
        }
        return _currentWeatherDao;
      }
    }
  }

  @Override
  public CitiesForSearchDao citiesForSearchDao() {
    if (_citiesForSearchDao != null) {
      return _citiesForSearchDao;
    } else {
      synchronized(this) {
        if(_citiesForSearchDao == null) {
          _citiesForSearchDao = new CitiesForSearchDao_Impl(this);
        }
        return _citiesForSearchDao;
      }
    }
  }
}
