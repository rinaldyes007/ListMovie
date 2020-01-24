package com.example.listmovie.`interface`


import com.example.listmovie.BuildConfig.TMDS_API_KEY
import com.example.listmovie.model.FilmResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {

    @GET("discover/movie")
    fun getMovie(
        @Query("api_key") apiKey: String = TMDS_API_KEY,
        @Query("languange") langCode: String = "en"
    ): Call<MutableList<FilmResponse>>


}

