package com.example.listmovie.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.listmovie.BuildConfig.IMAGES_PATH_API
import com.example.listmovie.R
import com.example.listmovie.model.Movie
import kotlinx.android.synthetic.main.item_film.view.*


class FilmAdapter(private val Listfilm: ArrayList<Movie>) :
    RecyclerView.Adapter<FilmAdapter.ListViewHolder>() {

    private var onItemClickCallBack: OnItemClickCallBack? = null

    fun setOnItemClickCallBack(onItemClickCallBack: OnItemClickCallBack) {
        this.onItemClickCallBack = onItemClickCallBack
    }




    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_film, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = Listfilm.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(Listfilm[position])
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(film: Movie) {
            with(itemView) {
                Glide.with(itemView.context)
                    .load(IMAGES_PATH_API+film.poster_path)
                    .apply(RequestOptions())
                    .into(img_film)

                tv_judul.text = film.title
                tv_desc.text = film.overview

                itemView.setOnClickListener { onItemClickCallBack?.onItemClicked(film) }
            }
        }

    }

    interface OnItemClickCallBack {
        fun onItemClicked(data: Movie)
    }

}

