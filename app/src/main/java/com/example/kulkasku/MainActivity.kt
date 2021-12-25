package com.example.kulkasku

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvKulkas: RecyclerView
    private var list: ArrayList<Drink> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvKulkas = findViewById(R.id.rv_kulkas)
        rvKulkas.setHasFixedSize(true)

        list.addAll(DrinksData.listData)
        showRecycler()
    }

    private fun showRecycler() {
        if(applicationContext.resources.configuration.orientation==Configuration.ORIENTATION_LANDSCAPE){
            rvKulkas.layoutManager = GridLayoutManager(this,2)
        }else{
            rvKulkas.layoutManager = LinearLayoutManager(this)
        }
        val drinkAdapter = DrinkAdapter(list)
        rvKulkas.adapter = drinkAdapter
        drinkAdapter.setOnItemClickCallback(object :DrinkAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Drink) {
                showDetail(data)
            }
        })
    }

    private fun showDetail(data: Drink) {
        val drink = Drink(
            data.name,
            data.price,
            data.tagline,
            data.image,
            data.detail,
            data.logo,
            data.perusahaan,
            data.komposisi,
            data.produk,
            data.url
        )

        intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_DRINK, drink)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.about, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_about -> {
                startActivity(Intent(this@MainActivity, AboutActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}