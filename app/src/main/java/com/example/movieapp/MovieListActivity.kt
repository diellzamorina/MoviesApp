package com.example.movieapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.movieapp.adapter.MovieAdapter
import com.example.movieapp.databinding.ActivityMovieListBinding
import com.example.movieapp.model.Movies

class MovieListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMovieListBinding
    private lateinit var moviesList: List<Movies>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMovieListBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val movieList = listOf(
            Movies(
                R.drawable.alfie3,
                "The Shawshank Redemption",
                9.2,
                "sadashdgsajhdgsajhkdgsakdjhgsajkdadkjg"
            ),
            Movies(
                R.drawable.alfie3,
                "The Godfather",
                9.2,
                "sadashdgsajhdgsajhkdgsakdjhgsajkdadkjg"
            ),
            Movies(
                R.drawable.alfie3,
                "The Dark Knight",
                9.0,
                "sadashdgsajhdgsajhkdgsakdjhgsajkdadkjg"
            ),
            Movies(
                R.drawable.alfie3,
                "The Godfather Part II",
                9.0,
                "sadashdgsajhdgsajhkdgsakdjhgsajkdadkjg"
            ),
            Movies(
                R.drawable.alfie3,
                "12 Angry Men",
                9.0,
                "sadashdgsajhdgsajhkdgsakdjhgsajkdadkjg"
            ),
            Movies(
                R.drawable.alfie3,
                "Schindler's List",
                8.9,
                "sadashdgsajhdgsajhkdgsakdjhgsajkdadkjg"
            ),
            Movies(
                R.drawable.alfie3,
                "The Lord of the Rings I",
                8.9,
                "sadashdgsajhdgsajhkdgsakdjhgsajkdadkjg"
            ),
            Movies(
                R.drawable.alfie3,
                "Pulp Fiction",
                8.8,
                "sadashdgsajhdgsajhkdgsakdjhgsajkdadkjg"
            ),
            Movies(
                R.drawable.alfie3,
                "The Lord of the Rings II",
                8.8,
                "sadashdgsajhdgsajhkdgsakdjhgsajkdadkjg"
            ),
            Movies(
                R.drawable.alfie3,
                "The Good, The Bad and The Ugly ",
                8.8,
                "sadashdgsajhdgsajhkdgsakdjhgsajkdadkjg"
            ),
        )

        val moviesAdapter = MovieAdapter(this, movieList)

        binding.lvMovies.adapter = moviesAdapter

        binding.lvMovies.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(
                this,
                "Item with name : ${moviesList[position]} is clicked",
                Toast.LENGTH_LONG
            ).show()
            val intent = Intent(this@MovieListActivity, MovieListDetailsActivity::class.java)
            intent.putExtra("movie_img", movieList[position].img)
            intent.putExtra("movie_title", movieList[position].movieTitle)
            intent.putExtra("movie_rating", movieList[position].movieRating)
            intent.putExtra("movie_description", movieList[position].movieDesc)
            startActivity(intent)

        }
    }
}


