package com.doctorblue.colordetector.api

import com.doctorblue.colordetector.model.Product
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("fetch.php")
    fun getProductDetails(
        @Query("hex") hex: String
    ): Call<Product>

}
