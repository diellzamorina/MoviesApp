package com.example.movieapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.movieapp.adapter.MovieAdapter
import com.example.movieapp.databinding.ActivityMainBinding
import com.example.movieapp.model.Users

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val userList = listOf(
            Users("Andi","Ajeti"),
            Users("Albion","Bekaj"),
            Users("Diellza", "Morina"),
            Users("Elmedin", "Fejzullahu"),
            Users("Gresa", "Osmani"),
            Users("Shend", "Ajeti"),
            Users("Filan", "Fisteku"),
            Users("Filane", "Fistekja"),
            Users("Aid", "Jashanica"),
            Users("Ramiz", "Lladrovci")
        )


        binding.btnLogIn.setOnClickListener {
            if (userList.any {
                    it.username.toString() == binding.etUsername.text.toString() && userList.any {
                        it.password.toString() == binding.etPassword.text.toString()
                    }
                }) {
                    val intent = Intent(this@MainActivity,MovieListActivity::class.java)
                    startActivity(intent)
            } else {
                Toast.makeText(this, "Gabim email/password!", Toast.LENGTH_LONG).show()
            }
        }

    }

}