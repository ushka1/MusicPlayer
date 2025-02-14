package com.example.musicplayer

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import com.example.musicplayer.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupActivity()
        setupToolbar()
        setupSearchButton()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.playlist_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_playlist_item -> {
                Snackbar.make(binding.root, "Adding playlist...", Snackbar.LENGTH_SHORT).show()
            }

            R.id.load_playlist_item -> {
                Snackbar.make(binding.root, "Loading playlist...", Snackbar.LENGTH_SHORT).show()
            }

            R.id.delete_playlist_item -> {
                Snackbar.make(binding.root, "Deleting playlist...", Snackbar.LENGTH_SHORT).show()
            }
        }
        return true
    }

    private fun setupActivity() {
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                0,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }
    }

    private fun setupToolbar() {
        val toolbar = binding.mainToolbar.root
        ViewCompat.setOnApplyWindowInsetsListener(toolbar) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.updatePadding(top = systemBars.top)
            insets
        }

        // It's the menu icon, that keeps Toolbar size the same, no matter the padding.
        setSupportActionBar(toolbar)
    }

    private fun setupSearchButton() {
        val button = binding.searchSongButton
        button.setOnClickListener {
            Snackbar.make(binding.root, "Searching...", Snackbar.LENGTH_SHORT).show()
        }
    }
}