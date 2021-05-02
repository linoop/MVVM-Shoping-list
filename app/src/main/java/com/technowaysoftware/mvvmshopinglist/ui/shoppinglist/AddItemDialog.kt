package com.technowaysoftware.mvvmshopinglist.ui.shoppinglist

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import com.technowaysoftware.mvvmshopinglist.R
import com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem
import kotlinx.android.synthetic.main.dialog_add_item.*

class AddItemDialog(context: Context, var addItemListener: AddItemListener) :
    AppCompatDialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_add_item)

        textViewAdd.setOnClickListener {
            val name = editTextTextItemName.text.toString()
            val amount = editTextTextAmount.text.toString()

            if (name.isEmpty() || amount.isEmpty()) {
                Toast.makeText(context, "Please enter values", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val item = ShoppingItem(name, amount.toInt())
            addItemListener.onAddButtonClicked(item)
            dismiss()
        }
        textViewCancel.setOnClickListener { cancel() }
    }
}