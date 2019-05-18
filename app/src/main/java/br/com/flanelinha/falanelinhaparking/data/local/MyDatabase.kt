package br.com.flanelinha.falanelinhaparking.data.local

import android.content.Context

@Database(entities = [Car::class], version = 1)
abstract class MyDatabase : RoomDatabase() {

    companion object {
        @Volatile private var instance: MyDatabase? = null

        @Synchronized
        fun getInstance(context: Context): MyDatabase? {
            if (instance == null) {
                instance = create(context)
            }
            return instance
        }

        private fun create(context: Context): MyDatabase {
            return Room.databaseBuilder(
                context,
                MyDatabase::class.java!!,
                DB_NAME).build()
        }
    }

    abstract fun carDao(): CarDAO

}