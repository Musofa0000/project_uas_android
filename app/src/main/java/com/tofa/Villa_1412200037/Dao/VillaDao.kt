package com.tofa.Villa_1412200037.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.tofa.Villa_1412200037.model.Villa
import kotlinx.coroutines.flow.Flow

@Dao
interface VillaDao {
    @Query("SELECT * FROM `villa_table` ORDER BY name ASC")
    fun getAllVilla(): Flow<List<Villa>>

    @Insert
    suspend fun Insertvilla(villa: Villa)

    @Delete
    suspend fun Deletevilla(villa: Villa)

    @Update
    suspend fun Updatevilla(villa: Villa)
}