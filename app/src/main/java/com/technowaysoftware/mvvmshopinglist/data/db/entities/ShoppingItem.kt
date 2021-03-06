package com.technowaysoftware.mvvmshopinglist.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import javax.inject.Inject

@Entity(tableName = "shopping_items")
data class ShoppingItem @Inject constructor(
    @ColumnInfo(name = "item_name")
    var name: String,
    @ColumnInfo(name = "item_amount")
    var amount: Int
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="item_id")
    var id: Int? = null
}
