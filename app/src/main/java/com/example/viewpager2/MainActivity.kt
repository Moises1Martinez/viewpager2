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
              fondo=R.color.aqua,
              imagen = R.drawable.yo    ,
                titulo2 = "Creador:",
                descripcion2 = "Daniel Enrique Zaldaña Castillo"
            ),
            Board(
                fondo=R.color.red,
                imagen = R.drawable.ugb,
                titulo2 = "Ubicaión UGB:",
                descripcion2 = "Captura de panatlla de la UGB"

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