package com.hs.weatherforecast.core

import androidx.recyclerview.widget.DiffUtil

/**
 * Created by JAIhsingh on 2020-06-02
 */

open class BaseDiffCallback<T> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T) = oldItem == newItem

    override fun areContentsTheSame(oldItem: T, newItem: T) = oldItem == newItem
}
