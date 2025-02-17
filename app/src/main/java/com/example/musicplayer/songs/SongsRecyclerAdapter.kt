package com.example.musicplayer.songs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.musicplayer.R

class SongsRecyclerAdapter(
    private val songList: List<Song>
) : RecyclerView.Adapter<SongsRecyclerAdapter.SongViewHolder>() {

    // That's class fields!
    inner class SongViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val icon: ImageView? = view.findViewById(R.id.song_item_icon)
        val title: TextView? = view.findViewById(R.id.song_item_title)
        val author: TextView? = view.findViewById(R.id.song_item_author)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        return SongViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_song,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return songList.size
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songList[position]
        holder.title?.text = song.title
        holder.author?.text = song.author
    }
}