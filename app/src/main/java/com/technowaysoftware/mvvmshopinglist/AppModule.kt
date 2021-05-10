package com.technowaysoftware.mvvmshopinglist

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.technowaysoftware.mvvmshopinglist.data.db.ShoppingDatabase
import com.technowaysoftware.mvvmshopinglist.ui.shoppinglist.ShoppingViewModel
import com.technowaysoftware.mvvmshopinglist.ui.shoppinglist.ShoppingViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context) = ShoppingDatabase(context)


}