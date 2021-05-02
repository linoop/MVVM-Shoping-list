package com.technowaysoftware.mvvmshopinglist.ui.shoppinglist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/technowaysoftware/mvvmshopinglist/ui/shoppinglist/ShoppingViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/technowaysoftware/mvvmshopinglist/data/repository/ShoppingRepo;", "(Lcom/technowaysoftware/mvvmshopinglist/data/repository/ShoppingRepo;)V", "delete", "Lkotlinx/coroutines/Job;", "item", "Lcom/technowaysoftware/mvvmshopinglist/data/db/entities/ShoppingItem;", "getAllShoppingItems", "Landroidx/lifecycle/LiveData;", "", "upInsert", "app_debug"})
public final class ShoppingViewModel extends androidx.lifecycle.ViewModel {
    private final com.technowaysoftware.mvvmshopinglist.data.repository.ShoppingRepo repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job upInsert(@org.jetbrains.annotations.NotNull()
    com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull()
    com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem>> getAllShoppingItems() {
        return null;
    }
    
    public ShoppingViewModel(@org.jetbrains.annotations.NotNull()
    com.technowaysoftware.mvvmshopinglist.data.repository.ShoppingRepo repo) {
        super();
    }
}