package com.geektech.pixabay.netWork

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {

    val retrofit = Retrofit.Builder().baseUrl("https://pixabay.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    fun getApi() : PixabayApi = retrofit.create(PixabayApi::class.java)
}