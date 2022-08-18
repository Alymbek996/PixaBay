package com.geektech.pixabay.netWork

import com.geektech.pixabay.model.PixabayModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayApi {

    @GET("api/")
    fun getImagesByWord(
        @Query("key") key: String = "28283066-0ec69652eb612ae95db3e1a9a",
        @Query("q") keyWord: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int = 10
    ): Call<PixabayModel>

}