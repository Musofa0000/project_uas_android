package com.tofa.Villa_1412200037.model


import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "Villa_table")
data class Villa(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val address: String,
    val capacity: String,
    val latitude : Double?,
    val longitude : Double?
) : Parcelable