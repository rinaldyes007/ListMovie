package com.example.listmovie.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.textclassifier.TextLinks
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.listmovie.R
import com.example.listmovie.model.Film
import kotlinx.android.synthetic.main.item_film.view.*

class FilmAdapter(private val listFilm: ArrayList<Film>) : RecyclerView.Adapter<FilmAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_film, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listFilm.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listFilm[position])
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(film : Film) {
            with(itemView) {
                Glide.with(itemView.context)
                    .load(film.photo)
                    .apply(RequestOptions().override(100, 150))
                    .into(img_film)

                tv_judul.text = film.judul
                tv_desc.text = film.desc
            }
        }

    }

}

//    internal var films = arrayListOf<Film>()
//
//
//    override fun getView(position: Int, view: View?, viewGroup: ViewGroup): View {
//        var itemView = view
//        if (itemView == null) {
//            itemView = LayoutInflater.from(context).inflate(R.layout.item_film, viewGroup, false)
//
//        }
//        val viewHolder = ViewHolder(itemView as View)
//        val film = getItem(position) as Film
//        viewHolder.bind(film)
//        return itemView
//    }
//
//    override fun getItem(position: Int): Any {
//       return films[position]
//    }
//
//    override fun getItemId(position: Int): Long {
//       return position.toLong()
//    }
//
//    override fun getCount(): Int {
//        return films.size
//    }
//
//    private inner class ViewHolder internal constructor(view: View) {
//        private val tvJudul: TextView = view.findViewById(R.id.tv_judul)
//        private val tvDesc: TextView = view.findViewById(R.id.tv_desc)
//        private val imgFilm: ImageView = view.findViewById(R.id.img_film)
//
//        internal fun bind(film: Film) {
//            tvJudul.text = film.judul
//            tvDesc.text = film.desc
//            imgFilm.setImageResource(film.photo)
//        }
//
//    }

//    interface OnItemClickCallBack {
//        fun onItemClicked(data: Film)
//    }



//}