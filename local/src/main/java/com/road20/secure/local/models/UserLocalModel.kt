package com.road20.secure.local.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "USER")
data class UserLocalModel (
    @PrimaryKey val id: String,
    val firstName: String,
    val lastName: String
)