package com.example.listmovie

import android.content.Intent
import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listmovie.DetailFilm.Companion.EXTRA_FILM
import com.example.listmovie.adapter.FilmAdapter
import com.example.listmovie.model.Film
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_movie.*

class MainActivity : AppCompatActivity() {

//    private lateinit var dataJudul: Array<String>
//    private lateinit var dataDesc: Array<String>
//    private lateinit var dataPhoto: TypedArray
//    private lateinit var dataRatingFilm: Array<String>
//    private lateinit var dataDirector1: Array<String>
//    private lateinit var dataDirector2: Array<String>
//    private lateinit var dataScreenPlay1: Array<String>
//    private lateinit var dataScreenPlay2: Array<String>
//    private lateinit var dataRilis: Array<String>
//    private var films = arrayListOf<Film>()

    private val list = ArrayList<Film>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        viewpager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(viewpager)
        supportActionBar?.elevation = 0f

//        tv_list.setHasFixedSize(true)
//        list.addAll(getlistFilm())
//        showRecyclerList()

    }

//    fun getlistFilm(): ArrayList<Film> {
//      val  dataJudul = resources.getStringArray(R.array.filmData)
//        val dataDesc = resources.getStringArray(R.array.descData)
//        val dataPhoto = resources.obtainTypedArray(R.array.fotoData)
//        val  dataRilis = resources.getStringArray(R.array.tanggal_rilis)
//        val   dataRatingFilm = resources.getStringArray(R.array.ratingFilm)
//        val   dataDirector1 = resources.getStringArray(R.array.director1)
//        val    dataDirector2 = resources.getStringArray(R.array.director2)
//        val   dataScreenPlay1 = resources.getStringArray(R.array.screenPlay1)
//        val  dataScreenPlay2 = resources.getStringArray(R.array.screenPlay2)
//
//        val listFilm = ArrayList<Film>()
//
//        for (position in dataJudul.indices) {
//            val film = Film(
//                dataPhoto.getResourceId(position, 0),
//                dataJudul[position],
//                dataDesc[position],
//                dataRilis[position],
//                dataRatingFilm[position],
//                dataDirector1[position],
//                dataDirector2[position],
//                dataScreenPlay1[position],
//                dataScreenPlay2[position]
//
//
//            )
//            listFilm.add(film)
//        }
//        return listFilm
//    }

//    private fun showRecyclerList() {
//        tv_list.layoutManager = LinearLayoutManager(this)
//        val filmAdapter = FilmAdapter(list)
//        tv_list.adapter = filmAdapter
//    }


}































//        val listView:ListView = findViewById(R.id.tv_list)
//        adapter = FilmAdapter(this)
//        listView.adapter = adapter
//
//        prepare()
//        addItem()
//
//        listView.onItemClickListener = AdapterView.OnItemClickListener{_, _, position, _ ->
//            val film = Film(
//                dataPhoto.getResourceId(position, -1),
//                dataJudul[position],
//                dataDesc[position],
//                dataRilis[position],
//                dataRatingFilm[position],
//                dataDirector1[position],
//                dataDirector2[position],
//                dataScreenPlay1[position],
//                dataScreenPlay2[position]
//            )
//            val intent = Intent(this@MainActivity, DetailFilm::class.java)
//            intent.putExtra(EXTRA_FILM, film)
//            startActivity(intent)
//        }
//    }
//
//    private fun prepare() {
//        dataJudul = resources.getStringArray(R.array.filmData)
//        dataDesc = resources.getStringArray(R.array.descData)
//        dataPhoto = resources.obtainTypedArray(R.array.fotoData)
//        dataRilis = resources.getStringArray(R.array.tanggal_rilis)
//        dataRatingFilm = resources.getStringArray(R.array.ratingFilm)
//        dataDirector1 = resources.getStringArray(R.array.director1)
//        dataDirector2 = resources.getStringArray(R.array.director2)
//        dataScreenPlay1 = resources.getStringArray(R.array.screenPlay1)
//        dataScreenPlay2 = resources.getStringArray(R.array.screenPlay2)
//    }
//    private fun addItem() {
//        for (position in dataJudul.indices) {
//            val film = Film(
//                dataPhoto.getResourceId(position, -1),
//                dataJudul[position],
//                dataDesc[position],
//                dataRilis[position],
//                dataRatingFilm[position],
//                dataDirector1[position],
//                dataDirector2[position],
//                dataScreenPlay1[position],
//                dataScreenPlay2[position]
//
//
//            )
//            films.add(film)
//        }
//        adapter.films = films
//    }
//}
//



