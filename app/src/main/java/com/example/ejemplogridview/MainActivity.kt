package com.example.ejemplogridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         var frutas= ArrayList<String>()
        frutas.add("Manzana")
        frutas.add("Plátano")
        frutas.add("Sandía")
        frutas.add("Durazno")

        var grid:GridView = findViewById(R.id.grid)
        var adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        grid.adapter = adaptador
        grid.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, frutas.get(i), Toast.LENGTH_SHORT).show()
        }
    }
}