package com.example.kulkasku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
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
        rvKulkas.layoutManager = LinearLayoutManager(this)
        val drinkAdapter = DrinkAdapter(list)
        rvKulkas.adapter = drinkAdapter
        drinkAdapter.setOnItemClickCallback(object :DrinkAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Drink) {
                showDetail(data)
            }
        })
    }

    private fun showDetail(data: Drink) {
        intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_NAME, data.name)
        intent.putExtra(DetailActivity.EXTRA_HARGA, data.price)
        intent.putExtra(DetailActivity.EXTRA_IMG, data.image)
        intent.putExtra(DetailActivity.EXTRA_TAG, data.tagline)
        intent.putExtra(DetailActivity.EXTRA_DETAIL, data.detail)
        intent.putExtra(DetailActivity.EXTRA_LOGO, data.logo)
        intent.putExtra(DetailActivity.EXTRA_PERUSAHAAN, data.perusahaan)
        intent.putExtra(DetailActivity.EXTRA_KOMPOSISI, data.komposisi)
        intent.putExtra(DetailActivity.EXTRA_PRODUK, data.produk)
        intent.putExtra(DetailActivity.EXTRA_URL, data.url)
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