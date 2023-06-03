package com.example.workoutplan.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.workoutplan.R

data class Day(
    @StringRes val day: Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)

val MonthWorkOuts = listOf<Day>(
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1),
    Day(R.string.day_1, R.string.title_1, R.string.info_1, R.drawable.day_1)
)