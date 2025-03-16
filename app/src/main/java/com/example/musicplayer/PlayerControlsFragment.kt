package com.example.musicplayer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.musicplayer.databinding.FragmentPlayerControlsBinding
import com.google.android.material.snackbar.Snackbar

class PlayerControlsFragment : Fragment(R.layout.fragment_player_controls) {
    private lateinit var binding: FragmentPlayerControlsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlayerControlsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.playPauseButton.setOnClickListener {
            val snackbar = Snackbar.make(binding.root, "Play/Pause", Snackbar.LENGTH_SHORT)
            snackbar.show()
            snackbar.setAction("Close") {
                snackbar.dismiss()
            }
        }

        binding.stopButton.setOnClickListener {
            val snackbar = Snackbar.make(binding.root, "Stop", Snackbar.LENGTH_SHORT)
            snackbar.setAction("Close") {
                snackbar.dismiss()
            }
            snackbar.show()
        }
    }
}