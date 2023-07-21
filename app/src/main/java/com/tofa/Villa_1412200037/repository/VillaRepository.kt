package com.tofa.Villa_1412200037.repository

import com.tofa.Villa_1412200037.Dao.VillaDao
import com.tofa.Villa_1412200037.model.Villa
import kotlinx.coroutines.flow.Flow

class VillaRepository(private val villaDao: VillaDao) {
    val allVillas:Flow<List<Villa>> =villaDao.getAllVilla()
    suspend fun insertvilla(villa: Villa){
        villaDao.Insertvilla(villa)
    }
    suspend fun deletevilla(villa: Villa){
        villaDao.Deletevilla(villa)
    }
    suspend fun updatevilla(villa: Villa){
        villaDao.Updatevilla(villa)
    }
}