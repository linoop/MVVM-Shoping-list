package com.technowaysoftware.mvvmshopinglist.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem
import javax.inject.Inject

@Database(entities = [ShoppingItem::class], version = 1)
abstract class ShoppingDatabase : RoomDatabase() {
    abstract fun getShoppingDao(): ShoppingDao

    companion object {
        @Volatile//meaning that writes to this field are immediately made visible to other threads.
        private var dbInstance: ShoppingDatabase? = null

        private val LOCK = Any()

        operator fun invoke(context: Context) = dbInstance ?: synchronized(LOCK) {
            dbInstance ?: createDatabase(context).also { dbInstance = it }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ShoppingDatabase::class.java, "shoppingDb.db"
            ).build()
    }
}