package com.dikin.assignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var itemList: ArrayList<Item>
    private lateinit var imageList: Array<Int>
    private lateinit var textList: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList = arrayOf(
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground
        )

        textList = arrayOf(
            "John Doe",
            "Silvester Stalone",
            "Jason Statham",
            "Johnny Depp",
            "Jackie Chan",
            "Bruce Willis"
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        itemList = arrayListOf()
        getData()
    }

    private fun getData() {
        for (i in imageList.indices) {
            val item = Item(imageList[i], textList[i])
            itemList.add(item)
        }

        recyclerView.adapter = ItemAdapter(itemList)
    }
}