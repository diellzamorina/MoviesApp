package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.movieapp.databinding.ActivityMovieListBinding
import com.example.movieapp.databinding.ActivityMovieListDetailsBinding
import com.example.movieapp.model.Movies

class MovieListDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMovieListDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMovieListDetailsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val ivImageDetails = intent.getIntExtra("movie_img",0)
        binding.ivImage.setImageResource(ivImageDetails)
        val titleDet = intent.getStringExtra("movie_title")
        binding.tvTitle.text= titleDet
        val ratingDet = intent.getDoubleExtra("movie_rating",0.0)
        binding.tvRating.text = ratingDet.toString()
        val descriptionDet = intent.getStringExtra("movie_description")
        binding.tvDescription.text = descriptionDet





    }

}