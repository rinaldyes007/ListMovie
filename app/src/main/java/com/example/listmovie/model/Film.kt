package com.example.listmovie.model

import com.google.gson.annotations.SerializedName


data class Film (
    val id: String,
    val title: String,
    val overview: String,
    @SerializedName("gambar")  val poster: String
)


