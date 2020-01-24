package com.example.listmovie.Retrofit

import com.example.listmovie.BuildConfig
import com.example.listmovie.BuildConfig.PATH_API_KEY
import com.example.listmovie.BuildConfig.TMDS_API_KEY
import com.example.listmovie.`interface`.RetrofitInterface
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {


    val instance: RetrofitInterface by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(PATH_API_KEY)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(RetrofitInterface::class.java)

    }


//    fun getClient (baseUrl: String) : RetrofitInterface {
//        if (retrofit == null) {
//            retrofit = Retrofit.Builder()
//                .baseUrl(baseUrl)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//        }
//        return retrofit.create(RetrofitInterface::class.java)
//    }







}