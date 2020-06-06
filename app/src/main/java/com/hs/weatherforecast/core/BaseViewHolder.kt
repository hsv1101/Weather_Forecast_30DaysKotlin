package com.hs.weatherforecast.core

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by JAIhsingh on 2020-06-02
 */

open class BaseViewHolder<out T : ViewDataBinding>(val binding: T) : RecyclerView.ViewHolder(binding.root)
