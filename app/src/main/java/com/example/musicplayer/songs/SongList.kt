package com.example.musicplayer.songs

class SongList {
    private val songs = mutableListOf(
        Song("Wish You Were Here", "Pink Floyd", "icon1.png"),
        Song("Comfortably Numb", "Pink Floyd", "icon2.png"),
        Song("Another Brick in the Wall, Part 2", "Pink Floyd", "icon3.png"),
        Song("Time", "Pink Floyd", "icon4.png"),
        Song("Shine On You Crazy Diamond", "Pink Floyd", "icon5.png")
    )

    fun getSongs(): List<Song> {
        return songs
    }
}