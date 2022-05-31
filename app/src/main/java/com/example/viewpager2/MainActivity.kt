package com.example.viewpager2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var boardList: List<Board>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boardList= listOf(
            Board(
              fondo=R.color.black,
              imagen = R.drawable.bold_collective_1   ,
                text_titulo2 = "Creador:",
                text_descripcion2 = "Moises Martinez"
            ),
            Board(
                fondo=R.color.black,
                imagen = R.drawable.ubicacion,
                text_titulo2 = "Col. belen",
                text_descripcion2 = "Captura de la ubicacion"

            )
        )
        val adapter = ViewPagerAdapter(boardList)
        page.adapter=adapter

        mapa.setOnClickListener{
            val intent = Intent(this, MapsActivity::class.java).apply {

            }
            startActivity(intent)
        }


    }
}