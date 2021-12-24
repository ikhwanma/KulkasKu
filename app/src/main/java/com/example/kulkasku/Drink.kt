package com.example.kulkasku

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Drink(
    var name: String? = null,
    var price: String? = null,
    var tagline: String? = null,
    var image: Int = 0,
    var detail: String? = null,
    var logo: Int = 0,
    var perusahaan: String? = null,
    var komposisi: String? = null,
    var produk: String? = null,
    var url: String? = null
): Parcelable
