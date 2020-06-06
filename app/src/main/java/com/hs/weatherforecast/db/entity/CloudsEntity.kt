package com.hs.weatherforecast.db.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import com.hs.weatherforecast.domain.model.Clouds
import kotlinx.android.parcel.Parcelize

/**
 * Created by JAIhsingh on 2020-06-02
 */

@Parcelize
@Entity(tableName = "Clouds")
data class CloudsEntity(
    @ColumnInfo(name = "all")
    var all: Int
) : Parcelable {
    @Ignore
    constructor(clouds: Clouds?) : this(
        all = clouds?.all ?: 0
    )
}
