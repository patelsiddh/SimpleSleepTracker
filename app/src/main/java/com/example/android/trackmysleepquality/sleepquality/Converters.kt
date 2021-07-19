package com.example.android.trackmysleepquality.sleepquality

import androidx.room.TypeConverter
import com.example.android.trackmysleepquality.database.SleepNight

class Converters{
    @TypeConverter
    fun fromListToArraySleepNights(sleepNights: List<SleepNight>?): Array<SleepNight> {
        return sleepNights?.toTypedArray() ?: arrayOf()
    }

    @TypeConverter
    fun fromArrayToListSleepNights(sleepNights: Array<SleepNight>?): List<SleepNight> {
        return sleepNights?.toList() ?: listOf()
    }
}