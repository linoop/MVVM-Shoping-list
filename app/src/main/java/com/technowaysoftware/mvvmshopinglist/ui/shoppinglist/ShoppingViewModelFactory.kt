package com.technowaysoftware.mvvmshopinglist.ui.shoppinglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.technowaysoftware.mvvmshopinglist.data.repository.ShoppingRepo
import javax.inject.Inject

class ShoppingViewModelFactory(private val repo: ShoppingRepo) :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ShoppingViewModel(repo) as T
    }
}