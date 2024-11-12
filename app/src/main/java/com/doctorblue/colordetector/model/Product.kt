package com.doctorblue.colordetector.model

data class Product(
    val item_id: Int,
    val item_name: String,
    val brand_name: String,
    val item_image: String,
    val item_date: String,
    val expiration_date: String,
    val item_price: Int,
    val type: String,
    val quantity: Int,
    val gl: String,
    val pallet_id: Int,
    val hex: String
)
