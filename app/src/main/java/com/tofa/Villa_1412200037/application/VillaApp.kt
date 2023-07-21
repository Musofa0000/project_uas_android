package com.tofa.Villa_1412200037.application

import android.app.Application
import com.tofa.Villa_1412200037.repository.VillaRepository

class VillaApp: Application() {
    val database by lazy { VillaDatabase.getDatabase(this) }
    val repository by lazy {VillaRepository(database.VillaDao())}
}