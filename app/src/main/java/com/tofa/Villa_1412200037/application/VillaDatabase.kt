package com.tofa.Villa_1412200037.application

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.tofa.Villa_1412200037.Dao.VillaDao
import com.tofa.Villa_1412200037.model.Villa

@Database(entities = [Villa::class ], version = 1, exportSchema = false)
abstract class VillaDatabase: RoomDatabase(){
    abstract fun VillaDao (): VillaDao

    companion object{
        private var INSTANCE: VillaDatabase? =null
        private val migration1To2 : Migration = object : Migration(1,2){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE villa_table ADD COLOUMN latitude Double DEFAULT 0.0")
                database.execSQL("ALTER TABLE villa_table ADD COLOUMN longitude Double DEFAULT 0.0")
            }
        }

        fun getDatabase(context: Context):VillaDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    VillaDatabase::class.java,
                    "Villa_database_1"
                )
                    .addMigrations(migration1To2)
                    .allowMainThreadQueries()
                    .build()

                INSTANCE= instance
                instance
            }

        }
    }
}