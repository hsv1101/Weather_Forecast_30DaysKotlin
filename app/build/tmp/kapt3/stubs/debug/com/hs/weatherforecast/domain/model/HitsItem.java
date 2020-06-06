package com.hs.weatherforecast.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B\u00c1\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0012\b\u0003\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0012\b\u0003\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t\u0012\u0012\b\u0003\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0012\b\u0003\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0013\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010-\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0013\u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tH\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0013\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tH\u00c6\u0003J\u0013\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u00ca\u0001\u00103\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\b\u0003\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\b\u0003\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0012\b\u0003\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0012\b\u0003\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u00020\u000bH\u00d6\u0001J\t\u00108\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001b\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b \u0010\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b\u0005\u0010!R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b\u0007\u0010!R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b\u0012\u0010!R\u001b\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u001b\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019\u00a8\u00069"}, d2 = {"Lcom/hs/weatherforecast/domain/model/HitsItem;", "", "country", "", "countryCode", "isCity", "", "isCountry", "administrative", "", "adminLevel", "", "postcode", "county", "geoloc", "Lcom/hs/weatherforecast/domain/model/Geoloc;", "importance", "objectID", "isSuburb", "localeNames", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/hs/weatherforecast/domain/model/Geoloc;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getAdminLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAdministrative", "()Ljava/util/List;", "getCountry", "()Ljava/lang/String;", "getCountryCode", "getCounty", "getGeoloc", "()Lcom/hs/weatherforecast/domain/model/Geoloc;", "getImportance", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLocaleNames", "getObjectID", "getPostcode", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/hs/weatherforecast/domain/model/Geoloc;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lcom/hs/weatherforecast/domain/model/HitsItem;", "equals", "other", "hashCode", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class HitsItem {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String country = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String countryCode = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isCity = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isCountry = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> administrative = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer adminLevel = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> postcode = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> county = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hs.weatherforecast.domain.model.Geoloc geoloc = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer importance = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String objectID = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isSuburb = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> localeNames = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isCity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getAdministrative() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAdminLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getPostcode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getCounty() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Geoloc getGeoloc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getImportance() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getObjectID() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isSuburb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getLocaleNames() {
        return null;
    }
    
    public HitsItem(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "country")
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "country_code")
    java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "is_city")
    java.lang.Boolean isCity, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "is_country")
    java.lang.Boolean isCountry, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "administrative")
    java.util.List<java.lang.String> administrative, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "admin_level")
    java.lang.Integer adminLevel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "postcode")
    java.util.List<java.lang.String> postcode, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "county")
    java.util.List<java.lang.String> county, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_geoloc")
    com.hs.weatherforecast.domain.model.Geoloc geoloc, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "importance")
    java.lang.Integer importance, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "objectID")
    java.lang.String objectID, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "is_suburb")
    java.lang.Boolean isSuburb, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "locale_names")
    java.util.List<java.lang.String> localeNames) {
        super();
    }
    
    public HitsItem() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Geoloc component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hs.weatherforecast.domain.model.HitsItem copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "country")
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "country_code")
    java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "is_city")
    java.lang.Boolean isCity, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "is_country")
    java.lang.Boolean isCountry, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "administrative")
    java.util.List<java.lang.String> administrative, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "admin_level")
    java.lang.Integer adminLevel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "postcode")
    java.util.List<java.lang.String> postcode, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "county")
    java.util.List<java.lang.String> county, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_geoloc")
    com.hs.weatherforecast.domain.model.Geoloc geoloc, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "importance")
    java.lang.Integer importance, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "objectID")
    java.lang.String objectID, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "is_suburb")
    java.lang.Boolean isSuburb, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "locale_names")
    java.util.List<java.lang.String> localeNames) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}