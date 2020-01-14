package com.example.listmovie.fragment


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listmovie.activity.DetailFilm
import com.example.listmovie.R
import com.example.listmovie.Retrofit.Common
import com.example.listmovie.`interface`.RetrofitInterface
import com.example.listmovie.adapter.FilmAdapter
import com.example.listmovie.model.Film
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**
 * A simple [Fragment] subclass.
 */
class MovieFragment : Fragment() {

    lateinit var adapter: FilmAdapter
    lateinit var mInterface: RetrofitInterface
    private lateinit var tvList: RecyclerView
    private val list = ArrayList<Film>()
    internal lateinit var param: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        mInterface = Common.retrofitInterface
        param = inflater.inflate(R.layout.fragment_movie, container, false)
        tvList = param.findViewById(R.id.tv_list)
        tvList.layoutManager = LinearLayoutManager(activity)
        tvList.setHasFixedSize(true)
        getlistFilm()
//        showRecyclerList()

        return param
    }

    fun getlistFilm(){
        mInterface.getMovie().enqueue(object : Callback<MutableList<Film>>{
            override fun onFailure(call: Call<MutableList<Film>>, t: Throwable) {
                Toast.makeText(activity, "gagal", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(
                call: Call<MutableList<Film>>,
                response: Response<MutableList<Film>>
            ) {
                adapter = FilmAdapter(response.body() as MutableList<Film>)
                tvList.adapter = adapter
            }

        })
    }

//    fun getlistFilm(): ArrayList<Film> {
//        val  dataJudul = resources.getStringArray(R.array.filmData)
//        val dataDesc = resources.getStringArray(R.array.descData)
//        val dataPhoto = resources.obtainTypedArray(R.array.fotoData)
//        val  dataRilis = resources.getStringArray(R.array.tanggal_rilis)
//        val   dataRatingFilm = resources.getStringArray(R.array.ratingFilm)
//
//        val listFilm = ArrayList<Film>()
//
//        for (position in dataJudul.indices) {
//            val film = Film(
//                dataPhoto.getResourceId(position, 0),
//                dataJudul[position],
//                dataDesc[position],
//                dataRilis[position],
//                dataRatingFilm[position]
//
//
//            )
//            listFilm.add(film)
//        }
//        return listFilm
//    }

//    private fun showRecyclerList() {
//        tvList.layoutManager = LinearLayoutManager(activity)
//
//
//        adapter.setOnItemClickCallBack(object : FilmAdapter.OnItemClickCallBack{
//            override fun onItemClicked(data: Film) {
//               // showSelectedFilm(data)
//                val intent = Intent(getActivity(), DetailFilm::class.java)
//                intent.putExtra(DetailFilm.EXTRA_FILM, data)
//                startActivity(intent)
//            }
//        })
//    }




}
