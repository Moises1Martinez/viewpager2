package com.example.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.board_item.view.*

class ViewPagerAdapter(
    private val boardList: List<Board>
): RecyclerView.Adapter<ViewPagerAdapter.BoarViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.BoarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.board_item, parent, false)
        return BoarViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.BoarViewHolder, position: Int) {
       holder.bind(boardList[position])
    }

    override fun getItemCount(): Int {
        return boardList.size
    }
    inner class BoarViewHolder(
        itemView:View
    ):RecyclerView.ViewHolder(itemView){

        private val contenedor = itemView.container
        private val imagen = itemView.imageView
        private val titulo =itemView.titulo1
        private val descripcion =itemView.descripcion1



        fun bind(board: Board)= with(itemView){
            contenedor.background = ContextCompat.getDrawable(context, board.fondo)
            imagen.setImageResource(board.imagen)
            titulo.text=board.titulo2
            descripcion.text = board.descripcion2


        }
    }

}