package com.example.kulkasku

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.kulkasku.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    private var url = ""
    private lateinit var binding: ActivityDetailBinding

    companion object{
        const val EXTRA_DRINK = "extra_drink"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<Drink>(EXTRA_DRINK) as Drink
        url = data.url!!

        binding.btnWebsite.setOnClickListener(this)
        binding.btnShare.setOnClickListener(this)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        getDataIntent(data)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_website -> {
                startActivity(Intent(Intent.ACTION_VIEW , Uri.parse(url)))
            }
            R.id.btn_share -> {
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, url)
                    type = "text/plain"
                }

                val shareIntent = Intent.createChooser(sendIntent, null)
                startActivity(shareIntent)
            }
        }
    }

    private fun getDataIntent(drink:Drink) {
        supportActionBar?.title = drink.name
        setView(
            drink.name,
            drink.price,
            drink.image,
            drink.tagline,
            drink.detail,
            drink.logo,
            drink.perusahaan,
            drink.komposisi,
            drink.produk
        )
    }

    @SuppressLint("SetTextI18n")
    private fun setView(
        name: String?,
        price: String?,
        image: Int,
        tag: String?,
        detail: String?,
        logo: Int,
        perusahaan: String?,
        komposisi: String?,
        produk: String?
    ) {
        Glide.with(this)
            .load(image)
            .into(binding.imgDrink)
        Glide.with(this)
            .load(logo)
            .into(binding.imgLogo)
        binding.tvNama.text = name
        binding.tvHarga.text = "Rp $price"
        binding.tvTagline.text = "\"$tag\""
        binding.tvDetail.text = detail
        binding.tvNamaPerusahaan.text = perusahaan
        binding.tvKomposisi.text = komposisi
        binding.tvProduk.text = produk
    }

}