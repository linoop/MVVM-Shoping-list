package com.technowaysoftware.mvvmshopinglist.data.repository

import com.technowaysoftware.mvvmshopinglist.data.db.ShoppingDatabase
import com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem
import javax.inject.Inject
import javax.inject.Singleton

class ShoppingRepo @Inject constructor(private val db: ShoppingDatabase) {
    suspend fun upInsert(item: ShoppingItem) = db.getShoppingDao().upInsert(item)
    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItem() = db.getShoppingDao().getAllShoppingItems()
}