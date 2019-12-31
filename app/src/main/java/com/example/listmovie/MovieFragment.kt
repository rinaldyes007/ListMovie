package com.example.listmovie


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listmovie.adapter.FilmAdapter
import com.example.listmovie.model.Film
import kotlinx.android.synthetic.main.fragment_movie.*

/**
 * A simple [Fragment] subclass.
 */
class MovieFragment : Fragment() {

    private lateinit var tvList: RecyclerView
    private val list = ArrayList<Film>()
    internal lateinit var param: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        param = inflater.inflate(R.layout.fragment_movie, container, false)
        tvList = param.findViewById(R.id.tv_list)
        tvList.setHasFixedSize(true)
        list.addAll(getlistFilm())
        showRecyclerList()

        return param
    }

    fun getlistFilm(): ArrayList<Film> {
        val  dataJudul = resources.getStringArray(R.array.filmData)
        val dataDesc = resources.getStringArray(R.array.descData)
        val dataPhoto = resources.obtainTypedArray(R.array.fotoData)
        val  dataRilis = resources.getStringArray(R.array.tanggal_rilis)
        val   dataRatingFilm = resources.getStringArray(R.array.ratingFilm)

        val listFilm = ArrayList<Film>()

        for (position in dataJudul.indices) {
            val film = Film(
                dataPhoto.getResourceId(position, 0),
                dataJudul[position],
                dataDesc[position],
                dataRilis[position],
                dataRatingFilm[position]


            )
            listFilm.add(film)
        }
        return listFilm
    }

    private fun showRecyclerList() {
        tvList.layoutManager = LinearLayoutManager(activity)
        val filmAdapter = FilmAdapter(list)
        tvList.adapter = filmAdapter

        filmAdapter.setOnItemClickCallBack(object : FilmAdapter.OnItemClickCallBack{
            override fun onItemClicked(data: Film) {
               // showSelectedFilm(data)
                val intent = Intent(getActivity(), DetailFilm::class.java)
                intent.putExtra(DetailFilm.EXTRA_FILM, data)
                startActivity(intent)
            }
        })
    }

//    private fun showSelectedFilm(film: Film) {
//        Toast.makeText(context, "Kamu Menyentuh ${film.judul}", Toast.LENGTH_SHORT).show()
//    }


}
