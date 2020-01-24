package com.example.listmovie.fragment


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listmovie.activity.DetailFilm
import com.example.listmovie.R
import com.example.listmovie.adapter.FilmAdapter
import com.example.listmovie.model.Film

/**
 * A simple [Fragment] subclass.
 */
class TvShowFragment : Fragment() {

//    private lateinit var tvShowList: RecyclerView
//    private val list = ArrayList<Film>()
//    internal lateinit var param: View
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        param = inflater.inflate(R.layout.fragment_tv_show, container, false)
//        tvShowList = param.findViewById(R.id.tv_show)
//        tvShowList.setHasFixedSize(true)
//        list.addAll(getTvShow())
//        showRecyclerList()
//        return param
//    }
//
//    fun getTvShow(): ArrayList<Film> {
//        val  tv_ShowJudul = resources.getStringArray(R.array.tvShowData)
//        val  tv_ShowDesc = resources.getStringArray(R.array.tvShowDesc)
//        val  tv_ShowPhoto = resources.obtainTypedArray(R.array.tvShowFoto)
//        val  tv_ShowRilis = resources.getStringArray(R.array.rilisTvShow)
//        val  tv_ShowRating = resources.getStringArray(R.array.ratingTvShow)
//
//        val listFilm = ArrayList<Film>()
//
//        for (position in tv_ShowJudul.indices) {
//            val film = Film(
//                tv_ShowPhoto.getResourceId(position, 0),
//                tv_ShowJudul[position],
//                tv_ShowDesc[position],
//                tv_ShowRilis[position],
//                tv_ShowRating[position]
//
//
//            )
//            listFilm.add(film)
//        }
//        return listFilm
//    }
//
//    private fun showRecyclerList() {
//        tvShowList.layoutManager = LinearLayoutManager(activity)
//        val filmAdapter = FilmAdapter(list)
//        tvShowList.adapter = filmAdapter
//
//        filmAdapter.setOnItemClickCallBack(object : FilmAdapter.OnItemClickCallBack{
//            override fun onItemClicked(data: Film) {
////                showSelectedtvShow(data)
//                val intent = Intent(getActivity(), DetailFilm::class.java)
//                intent.putExtra(DetailFilm.EXTRA_FILM, data)
//                startActivity(intent)
//            }
//        })
//    }

}
