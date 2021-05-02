package com.technowaysoftware.mvvmshopinglist.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/technowaysoftware/mvvmshopinglist/data/repository/ShoppingRepo;", "", "db", "Lcom/technowaysoftware/mvvmshopinglist/data/db/ShoppingDatabase;", "(Lcom/technowaysoftware/mvvmshopinglist/data/db/ShoppingDatabase;)V", "delete", "", "item", "Lcom/technowaysoftware/mvvmshopinglist/data/db/entities/ShoppingItem;", "(Lcom/technowaysoftware/mvvmshopinglist/data/db/entities/ShoppingItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllShoppingItem", "Landroidx/lifecycle/LiveData;", "", "upInsert", "app_debug"})
public final class ShoppingRepo {
    private final com.technowaysoftware.mvvmshopinglist.data.db.ShoppingDatabase db = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object upInsert(@org.jetbrains.annotations.NotNull()
    com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem>> getAllShoppingItem() {
        return null;
    }
    
    public ShoppingRepo(@org.jetbrains.annotations.NotNull()
    com.technowaysoftware.mvvmshopinglist.data.db.ShoppingDatabase db) {
        super();
    }
}