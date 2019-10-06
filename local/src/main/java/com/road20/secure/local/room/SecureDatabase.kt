package com.road20.secure.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.road20.secure.local.BuildConfig

@Database(
    version = BuildConfig.VERSION_CODE,
    entities = []
)
abstract class SecureDatabase : RoomDatabase() {
}