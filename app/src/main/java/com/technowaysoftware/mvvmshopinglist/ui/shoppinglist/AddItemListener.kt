package com.technowaysoftware.mvvmshopinglist.ui.shoppinglist

import com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem

interface AddItemListener {
    fun onAddButtonClicked(item: ShoppingItem)
}