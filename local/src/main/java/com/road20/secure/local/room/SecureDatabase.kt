package com.road20.secure.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.road20.secure.local.BuildConfig
import com.road20.secure.local.models.UserLocalModel

@Database(
    version = BuildConfig.VERSION_CODE,
    entities = [UserLocalModel::class]
)
abstract class SecureDatabase : RoomDatabase()