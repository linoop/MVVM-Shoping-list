package com.technowaysoftware.mvvmshopinglist.ui.shoppinglist

import androidx.lifecycle.ViewModel
import com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem
import com.technowaysoftware.mvvmshopinglist.data.repository.ShoppingRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ShoppingViewModel @Inject constructor(private val repo: ShoppingRepo) : ViewModel() {
    fun upInsert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repo.upInsert(item)
    }

    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repo.delete(item)
    }

    fun getAllShoppingItems() = repo.getAllShoppingItem()
}