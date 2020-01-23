package com.example.listmovie.`interface`


import com.example.listmovie.BuildConfig.TMDS_API_KEY
import com.example.listmovie.model.Film
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {

    @GET("discover/movie?api_key=$TMDS_API_KEY&language=en-US")
    fun getMovie(
        @Query("languange") langCode: String = "en"
    ): Call<MutableList<Film>>


}

