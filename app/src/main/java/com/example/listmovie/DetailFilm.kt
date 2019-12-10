package com.example.listmovie

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
        val tvDirector1 : TextView = findViewById(R.id.get_direct1)
        val tvDirector2 : TextView = findViewById(R.id.get_direct2)
        val tvScreen1 : TextView = findViewById(R.id.get_screen)
        val tvScreen2 : TextView = findViewById(R.id.get_screen2)


        val film = intent.getParcelableExtra(EXTRA_FILM) as Film
        val judull = film.judul.toString()
        val rating = film.rating.toString()
        val rilis = film.releaseDate.toString()
        val detail = film.desc.toString()
        val direktur1 = film.direktur1.toString()
        val direktur2 = film.direktur2.toString()
        val splay1 = film.screenplay1.toString()
        val splay2 = film.screenplay2.toString()
        val poster = film.photo



        tvJudul.text = judull
        tvRating.text = rating
        tvRilis.text = rilis
        tvDetail.text = detail
        tvDirector1.text = direktur1
        tvDirector2.text = direktur2
        tvScreen1.text = splay1
        tvScreen2.text = splay2
        imgpic.setImageResource(poster)



    }

    companion object {
        const val EXTRA_FILM = "extra_film"
    }
}
