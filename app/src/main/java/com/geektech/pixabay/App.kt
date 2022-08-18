package com.geektech.pixabay

import android.app.Application
import com.geektech.pixabay.netWork.PixabayApi
import com.geektech.pixabay.netWork.RetrofitService

class App : Application() {

    companion object{
        lateinit var api: PixabayApi
    }

    override fun onCreate() {
        super.onCreate()
        val retrofitService = RetrofitService()
        api = retrofitService.getApi()

    }

}