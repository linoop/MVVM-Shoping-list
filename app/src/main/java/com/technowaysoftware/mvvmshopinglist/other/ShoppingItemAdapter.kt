package com.technowaysoftware.mvvmshopinglist.other

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.technowaysoftware.mvvmshopinglist.R
import com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem
import com.technowaysoftware.mvvmshopinglist.ui.shoppinglist.ShoppingViewModel
import kotlinx.android.synthetic.main.shopping_item.view.*

class ShoppingItemAdapter(
    var items: List<ShoppingItem>,
    private val viewModel: ShoppingViewModel
) : RecyclerView.Adapter<ShoppingItemAdapter.ShoppingViewHolder>() {

    inner class ShoppingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.shopping_item, parent, false)
        return ShoppingViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShoppingViewHolder, position: Int) {
        val item = items[position]
        holder.itemView.textViewName.text = item.name
        holder.itemView.textViewAmount.text = item.amount.toString()

        holder.itemView.imageViewDelete.setOnClickListener {
            viewModel.delete(item)
        }

        holder.itemView.imageViewPlus.setOnClickListener {
            item.amount++
            viewModel.upInsert(item)
        }

        holder.itemView.imageViewMinus.setOnClickListener {
            if (item.amount > 0) {
                item.amount--
                viewModel.upInsert(item)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}