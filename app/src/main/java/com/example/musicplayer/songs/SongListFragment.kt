package com.example.musicplayer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.musicplayer.databinding.FragmentSongListBinding
import com.example.musicplayer.songs.SongList
import com.example.musicplayer.songs.SongsRecyclerAdapter
import com.google.android.material.snackbar.Snackbar

class SongListFragment : Fragment(R.layout.fragment_song_list) {
    private lateinit var binding: FragmentSongListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongListBinding.inflate(layoutInflater)

        setupSongsRecycler()
        setupSearchButton()

        return binding.root
    }

    private fun setupSongsRecycler() {
        val songList = SongList()
        binding.songListRecycler.adapter = SongsRecyclerAdapter(songList.getSongs())
        binding.songListRecycler.layoutManager = LinearLayoutManager(activity)
    }

    private fun setupSearchButton() {
        binding.searchSongButton.setOnClickListener {
            val snackbar = Snackbar.make(binding.root, "Searching...", Snackbar.LENGTH_SHORT)
            snackbar.show()
            snackbar.setAction("Close") {
                snackbar.dismiss()
            }
        }
    }
}