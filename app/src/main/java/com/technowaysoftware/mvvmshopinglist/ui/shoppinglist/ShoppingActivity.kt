package com.technowaysoftware.mvvmshopinglist.ui.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.technowaysoftware.mvvmshopinglist.R
import com.technowaysoftware.mvvmshopinglist.data.db.ShoppingDatabase
import com.technowaysoftware.mvvmshopinglist.data.db.entities.ShoppingItem
import com.technowaysoftware.mvvmshopinglist.data.repository.ShoppingRepo
import com.technowaysoftware.mvvmshopinglist.other.ShoppingItemAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_shopping.*
import javax.inject.Inject

@AndroidEntryPoint
class ShoppingActivity : AppCompatActivity() {

    private val viewModel: ShoppingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        //val db = ShoppingDatabase(this)
        //val repo = ShoppingRepo(db)
        //val factory = ShoppingViewModelFactory(repo)

        //val viewModel = ViewModelProvider(this, factory).get(ShoppingViewModel::class.java)


        val adapter = ShoppingItemAdapter(listOf(), viewModel)

        recyclerViewItems.layoutManager = LinearLayoutManager(this)
        recyclerViewItems.adapter = adapter

        viewModel.getAllShoppingItems().observe(this, Observer {
            adapter.items = it
            adapter.notifyDataSetChanged()
        })

        fab.setOnClickListener {
            AddItemDialog(this, object : AddItemListener {
                override fun onAddButtonClicked(item: ShoppingItem) {
                    viewModel.upInsert(item)
                }
            }).show()
        }
    }
}