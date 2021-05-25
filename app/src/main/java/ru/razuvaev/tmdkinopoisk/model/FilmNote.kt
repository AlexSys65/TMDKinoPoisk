package ru.razuvaev.tmdkinopoisk.model

data class FilmNote(
    private val mId: String,
    private val mTitleFilm: String,
    private val mRatingFilm: String,
    private val mGenreFilm: String,
    private val mURLImage: String,
    private val mNotification: Boolean
)