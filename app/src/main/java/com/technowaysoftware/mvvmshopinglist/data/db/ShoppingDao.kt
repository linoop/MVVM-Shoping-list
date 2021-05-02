package com.technowaysoftware.mvvmshopinglist.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upInsert(item: ShoppingItem)

    @Delete
    suspend fun delete(item: ShoppingItem)

    @Query("SELECT * FROM shopping_items")
    fun getAllShoppingItems(): LiveData<List<ShoppingItem>>

}