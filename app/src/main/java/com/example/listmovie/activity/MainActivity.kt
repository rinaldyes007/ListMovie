package com.example.listmovie.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
import com.example.listmovie.R
import com.example.listmovie.adapter.SectionsPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sectionsPagerAdapter =
            SectionsPagerAdapter(this, supportFragmentManager)
        viewpager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(viewpager)
        supportActionBar?.elevation = 0f


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_change_settings) {
            val mIntent = Intent(Settings.ACTION_LOCALE_SETTINGS)
            startActivity(mIntent)
        }
        return super.onOptionsItemSelected(item)
    }


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



