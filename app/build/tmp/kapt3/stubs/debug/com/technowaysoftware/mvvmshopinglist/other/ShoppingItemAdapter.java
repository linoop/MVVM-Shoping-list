package com.technowaysoftware.mvvmshopinglist.other;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/technowaysoftware/mvvmshopinglist/other/ShoppingItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/technowaysoftware/mvvmshopinglist/other/ShoppingItemAdapter$ShoppingViewHolder;", "items", "", "Lcom/technowaysoftware/mvvmshopinglist/data/db/entities/ShoppingItem;", "viewModel", "Lcom/technowaysoftware/mvvmshopinglist/ui/shoppinglist/ShoppingViewModel;", "(Ljava/util/List;Lcom/technowaysoftware/mvvmshopinglist/ui/shoppinglist/ShoppingViewModel;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ShoppingViewHolder", "app_debug"})
public final class ShoppingItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.technowaysoftware.mvvmshopinglist.other.ShoppingItemAdapter.ShoppingViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem> items;
    private final com.technowaysoftware.mvvmshopinglist.ui.shoppinglist.ShoppingViewModel viewModel = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.technowaysoftware.mvvmshopinglist.other.ShoppingItemAdapter.ShoppingViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.technowaysoftware.mvvmshopinglist.other.ShoppingItemAdapter.ShoppingViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem> p0) {
    }
    
    public ShoppingItemAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem> items, @org.jetbrains.annotations.NotNull()
    com.technowaysoftware.mvvmshopinglist.ui.shoppinglist.ShoppingViewModel viewModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/technowaysoftware/mvvmshopinglist/other/ShoppingItemAdapter$ShoppingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/technowaysoftware/mvvmshopinglist/other/ShoppingItemAdapter;Landroid/view/View;)V", "app_debug"})
    public final class ShoppingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ShoppingViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}