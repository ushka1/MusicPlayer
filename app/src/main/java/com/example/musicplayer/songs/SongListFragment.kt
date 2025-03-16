package com.example.musicplayer.songs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.musicplayer.R
import com.example.musicplayer.databinding.FragmentSongListBinding
import com.google.android.material.snackbar.Snackbar

class SongListFragment : Fragment(R.layout.fragment_song_list) {
    private lateinit var binding: FragmentSongListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongListBinding.inflate(layoutInflater)
        return binding.root
    }

    // All initialization logic goes here.
    // https://stackoverflow.com/questions/75108726/should-i-inflate-the-layout-in-oncreateview-or-onviewcreated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupSongsRecycler()
        setupSearchButton()
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