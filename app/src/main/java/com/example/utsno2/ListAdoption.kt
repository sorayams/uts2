package com.example.utsno2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R
import android.widget.ListView

import android.widget.SimpleAdapter

class ListAdoption : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.utsno2.R.layout.activity_list_adoption)
        val titleArray = arrayOf("title 1", "title 2", "title 3", "title 4")
        val detailArray = arrayOf("detail 1", "detail 2", "detail 3", "detail 4")

        val listArray: MutableList<Map<String, String?>> = ArrayList()

        for (i in titleArray.indices) {
            val listItem: MutableMap<String, String?> = HashMap()
            listItem["titleKey"] = titleArray[i]
            listItem["detailKey"] = detailArray[i]
            listArray.add(listItem)
        }

        val simpleAdapter = SimpleAdapter(
            this, listArray,
            R.layout.simple_list_item_2, arrayOf("titleKey", "detailKey"), intArrayOf(com.example.utsno2.R.id.txt1, com.example.utsno2.R.id.txt2)
        )

        val listView: ListView = findViewById(com.example.utsno2.R.id.listId)
        listView.setAdapter(simpleAdapter)

    }
}