package com.savelov.filmicpro.domain

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Film(
        val title: String,
        val poster: Int,
        val description: String,
        var rating: Float = 0f,
        var isInFavorites: Boolean = false
) : Parcelable