package com.example.listmovie

import android.graphics.BlurMaskFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.listmovie.model.Film


class DetailFilm : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_film)


        val tvJudul : TextView = findViewById(R.id.get_judul)
        val imgpic : ImageView = findViewById(R.id.poster_film)
        val tvRating : TextView = findViewById(R.id.get_rating)
        val tvRilis : TextView = findViewById(R.id.get_date)
        val tvDetail : TextView = findViewById(R.id.get_detail)



        val film = intent.getParcelableExtra(EXTRA_FILM) as Film
        val judull = film.judul.toString()
        val rating = film.rating.toString()
        val rilis = film.releaseDate.toString()
        val detail = film.desc.toString()
        val poster = film.photo


        tvJudul.text = judull
        tvRating.text = rating
        tvRilis.text = rilis
        tvDetail.text = detail
        imgpic.setImageResource(poster)



    }
//



    companion object {
        const val EXTRA_FILM = "extra_film"
    }
}
