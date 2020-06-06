package com.hs.weatherforecast.db.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import com.hs.weatherforecast.domain.model.Wind
import kotlinx.android.parcel.Parcelize

/**
 * Created by JAIhsingh on 2020-06-02
 */

@Parcelize
@Entity(tableName = "Wind")
data class WindEntity(
    @ColumnInfo(name = "deg")
    val deg: Double?,
    @ColumnInfo(name = "speed")
    val speed: Double?
) : Parcelable {
    @Ignore
    constructor(wind: Wind?) : this(
        deg = wind?.deg,
        speed = wind?.speed
    )
}
