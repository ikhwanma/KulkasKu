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

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var imgDrink:ImageView
    private lateinit var imgLogo:ImageView
    private lateinit var tvNama:TextView
    private lateinit var tvHarga:TextView
    private lateinit var tvTagline:TextView
    private lateinit var tvDetail:TextView
    private lateinit var tvPerusahaan:TextView
    private lateinit var tvKomposisi:TextView
    private lateinit var tvProduk:TextView
    private lateinit var btnWebsite:Button
    private lateinit var btnShare:Button

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_HARGA = "extra_harga"
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_TAG = "extra_tag"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_LOGO = "extra_logo"
        const val EXTRA_PERUSAHAAN = "extra_perusahaan"
        const val EXTRA_KOMPOSISI = "extra_komposisi"
        const val EXTRA_PRODUK = "extra_produk"
        const val EXTRA_URL = "extra_url"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        imgDrink = findViewById(R.id.img_drink)
        imgLogo = findViewById(R.id.img_logo)
        tvNama = findViewById(R.id.tv_nama_minuman)
        tvHarga = findViewById(R.id.tv_harga_minuman)
        tvTagline = findViewById(R.id.tv_tag_minuman)
        tvDetail = findViewById(R.id.tv_detail_minuman)
        tvPerusahaan = findViewById(R.id.tv_nama_perusahaan)
        tvKomposisi = findViewById(R.id.tv_komposisi)
        tvProduk = findViewById(R.id.tv_produk)
        btnWebsite = findViewById(R.id.btn_website)
        btnShare = findViewById(R.id.btn_share)

        btnWebsite.setOnClickListener(this)
        btnShare.setOnClickListener(this)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        getDataIntent()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    override fun onClick(v: View?) {
        val url = intent.getStringExtra(EXTRA_URL)
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

    private fun getDataIntent() {
        val name = intent.getStringExtra(EXTRA_NAME)
        val price = intent.getStringExtra(EXTRA_HARGA)
        val image = intent.getIntExtra(EXTRA_IMG, 0)
        val tag = intent.getStringExtra(EXTRA_TAG)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val logo = intent.getIntExtra(EXTRA_LOGO, 0)
        val perusahaan = intent.getStringExtra(EXTRA_PERUSAHAAN)
        val komposisi = intent.getStringExtra(EXTRA_KOMPOSISI)
        val produk = intent.getStringExtra(EXTRA_PRODUK)

        supportActionBar?.title = name
        setView(name,price,image,tag,detail,logo,perusahaan,komposisi,produk)
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
            .into(imgDrink)
        Glide.with(this)
            .load(logo)
            .into(imgLogo)
        tvNama.text = name
        tvHarga.text = "Rp $price"
        tvTagline.text = "\"$tag\""
        tvDetail.text = detail
        tvPerusahaan.text = perusahaan
        tvKomposisi.text = komposisi
        tvProduk.text = produk
    }

}