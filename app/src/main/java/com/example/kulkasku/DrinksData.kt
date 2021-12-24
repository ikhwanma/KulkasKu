package com.example.kulkasku

object DrinksData {
    private val drinkImg = intArrayOf(
        R.drawable.img_aqua,
        R.drawable.img_coca_cola,
        R.drawable.img_fanta,
        R.drawable.img_frestea,
        R.drawable.img_good_day,
        R.drawable.img_nescafe,
        R.drawable.img_sprite,
        R.drawable.img_teh_botol,
        R.drawable.img_teh_pucuk,
        R.drawable.img_ultramilk
    )

    private val drinkLogo = intArrayOf(
        R.drawable.logo_aqua,
        R.drawable.logo_coca_cola,
        R.drawable.logo_fanta,
        R.drawable.logo_frestea,
        R.drawable.logo_good_day,
        R.drawable.logo_nescafe,
        R.drawable.logo_sprite,
        R.drawable.logo_teh_botol,
        R.drawable.logo_teh_pucuk,
        R.drawable.logo_ultra_milk
    )

    private val drinkName = arrayOf(
        "Aqua",
        "Coca-Cola",
        "Fanta",
        "Frestea",
        "Good Day",
        "Nescafe",
        "Sprite",
        "Teh Botol",
        "Teh Pucuk",
        "Ultra Milk"
    )

    private val drinkPrice = arrayOf(
        "3500",
        "5000",
        "5000",
        "4500",
        "7000",
        "10.000",
        "5000",
        "4000",
        "3500",
        "7500"
    )

    private val drinkTag = arrayOf(
        "Kebaikan Berawal Dari Sini",
        "Taste The Feeling",
        "Jadi Lebih Berasa",
        "Pilihan Generasi Fres",
        "Karena hidup banyak rasa",
        "It all starts with a NESCAFÉ",
        "Obey Your Thirst",
        "apapun makanannya, minumnya Teh Botol Sosro",
        "Rasa teh terbaik terletak di bagian pucuknya",
        "Make Your Move"
    )

    private val drinkDetail = arrayOf(
        "AQUA atau disebut juga Danone-AQUA adalah merek air minum dalam kemasan yang diproduksi oleh AQUA Group sejak tahun 1973.",
        "Coca-Cola adalah minuman ringan berkarbonasi yang dijual di toko, restoran dan mesin penjual di lebih dari 200 negara.",
        "Fanta adalah merek minuman ringan berkarbonasi rasa buah Italia-Jerman yang dibuat oleh Coca-Cola Deutschland, Ada lebih dari 150 rasa di seluruh dunia.",
        "Frestea adalah merek minuman teh siap minum yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi 17520-Indonesia.",
        "kopi instan produksi Santos Jaya Abadi (Kapal Api Group)",
        "Nescafé adalah merek kopi yang dibuat oleh Nestlé. Kopi ini dijual dalam berbagai varian. Nama Nescafé merupakan lakuran dari kata \"Nestlé\" dan \"café\".",
        "Sprite adalah minuman yang tidak berwarna dengan rasa lemon dan jeruk nipis serta bebas kafeina yang diproduksi oleh The Coca-Cola Company.",
        "Teh Botol Sosro adalah merek teh beraroma melati yang dipasarkan oleh PT. Sinar Sosro. ",
        "Teh Pucuk Harum adalah produk minuman teh yang diproduksi oleh Mayora Indah.",
        "Ultra Milk merupakan susu kotak UHT pertama dan terpopuler di Indonesia. Ultra Milk tersedia dalam berbagai pilihan rasa."
    )

    private val drinkPerusahaan = arrayOf(
        "PT. Aqua Golden Mississippi",
        "The Coca-Cola Company",
        "The Coca-Cola Company",
        "PT. Coca-Cola Bottling Indonesia",
        "PT. Santos Jaya Abadi",
        "Nestlé",
        "The Coca-Cola Company",
        "PT Sinar Sosro",
        "PT. Tirta Tresindo Jaya",
        "PT Ultrajaya Milk"
    )

    private val drinkKomposisi = arrayOf(
        "Air Mineral",
        "Air berkarbonasi, pewarna caramel (kelas IV), pengatur keasaman (Asam Fosfat, Trinatrium Sitrat), pemanis buatan (sukralosa 55 mg/saji, asesulfam-K 41 mg/saji), konsentrat kola, natrium benzoat, kafein",
        "Air berkarbonasi, gula, pengatur keasaman (asam sitrat), pengawet (natrium benzoat), perisa artifisial, pewarna (karmoisin CI 14720, kuning FCF CI 15985)",
        "Air, gula, teh (0.2%), pengatur keasaman (natrium karbonat), antioksiadan (natrium askorbat) dan perisa identik alam",
        "Air, gula, krimer nabati, kopi, instant (1%), susu skim bubuk, bubuk kakao, penstabil makanan, perisa identik alami moka",
        "Air, gula, susu bubuk skim, kopi bubuk instant, lemak susu, pengatur keasaman, pengemulsi lesitin kedelai, perisa susu, penstabil, bubuk kakao",
        "Air berkarbonasi, gula, pengatur keasaman (asam sitrat, natrium sitrat), perisa (alami, identik alami), pengawet (natrium benzoat)",
        "Air, gula, ekstrak teh melati dan antioksidan",
        "Air, gula, teh melati (daun teh + bunga melati), perisa bunga melati, penstabil trikalium fosfat",
        "Susu sapi segar, sukrosa, bubuk coklat, pemantap nabati, perisa coklat"
    )

    private val drinkProduk = arrayOf(
        "kemasan botol plastik 330 ml, 450 ml, 600 ml, 750 ml dan 1500 ml; kemasan gelas plastik 240 ml; dan kemasan galon 19 liter",
        "Cola, Cola Cherry, Cola Vanilla, Cola Green Tea, Cola Lemon, Cola Lemon Lime, Cola Lime, Cola Orange and Cola Raspberry",
        "Fanta Rasa Anggur, Fanta Rasa Jeruk, Fanta Rasa Nanas, Fanta Rasa Mocca, Fanta Rasa Stroberi, Fanta Soda Water, Fanta Rasa Coco Pandan",
        "Frestea Minuman Tehh Original, Frestea Rendah Kalori, Frestea Minuman Teh Hijau, Frestea Minuman Teh Hijau Rasa Madu, Frestea Minuman Teh Rasa Apel, Frestea Minuman Teh Rasa Markisa, Frestea Minuman Teh Susu Gula Aren",
        "Rasa Mocaccino, Rasa Tiramisu, Rasa Avocado Delight, Caramel Machiato, White Vanilla",
        "NESCAFÉ CAN Original, NESCAFÉ CAN Latte, NESCAFÉ CAN Mocha, Caramel Macchiato Manis, Ala Café, Latte Lembut Dan Creamy Ala Café",
        "Sprite, Diet Sprite, Sprite Zero, Sprite Remix, Sprite WaterLymon",
        "Rasa Original, Less Sugar, Tawar",
        "Teh Pucuk Harum 350mL, Teh Pucuk Harum 500mL",
        "Rasa Coklat, Rasa FullCream, Rasa Karamel, Rasa Strawberry, Rasa Taro"
    )

    private val drinkUrl = arrayOf(
        "https://aqua.co.id/",
        "https://www.coca-cola.co.id/id/home",
        "https://www.fanta.co.id/id/home",
        "https://www.cocacola.co.id/produk/frestea",
        "https://www.hidupbanyakrasa.com/",
        "https://www.nescafe.com/id/",
        "https://www.sprite.com/",
        "https://www.tehbotolsosro.com/",
        "https://www.tehpucukharum.com/",
        "https://www.ultrajaya.co.id/"
    )

    val listData: ArrayList<Drink>
        get() {
            val list = arrayListOf<Drink>()
            for (position in drinkName.indices) {
                val drink = Drink()
                drink.name = drinkName[position]
                drink.image = drinkImg[position]
                drink.price = drinkPrice[position]
                drink.tagline = drinkTag[position]
                drink.detail = drinkDetail[position]
                drink.logo = drinkLogo[position]
                drink.perusahaan = drinkPerusahaan[position]
                drink.komposisi = drinkKomposisi[position]
                drink.produk = drinkProduk[position]
                drink.url = drinkUrl[position]
                list.add(drink)
            }
            return list
        }
}