package com.example.movieapp.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.movieapp.R
import com.example.movieapp.model.Movies

class MovieAdapter(private val context: Context, private val moviesList: List<Movies>):BaseAdapter() {
    private val inflater : LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater

    override fun getCount(): Int = moviesList.size

    override fun getItem(position: Int): Any = moviesList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        val rowView =inflater.inflate(R.layout.movie_list_item  ,p2,false)

        val ivMoviePhoto = rowView.findViewById<ImageView>(R.id.ivMoviePhoto)
        val tvMovieTitle = rowView.findViewById<TextView>(R.id.tvMovieTitle)
        val tvMovieRating = rowView.findViewById<TextView>(R.id.tvMovieImdb)
        val tvMovieDescription = rowView.findViewById<TextView>(R.id.tvFirstMovieDesc)

        moviesList[position].img?.let{ ivMoviePhoto.setImageResource(it) }
        tvMovieTitle.text = moviesList[position].movieTitle
        tvMovieRating.text = moviesList[position].movieRating.toString()
        tvMovieDescription.text = moviesList[position].movieDesc

        return rowView

    }
}