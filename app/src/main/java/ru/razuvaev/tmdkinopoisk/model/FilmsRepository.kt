package ru.razuvaev.tmdkinopoisk.model

interface FilmsRepository {

    fun getFilms(): ArrayList<FilmSheet>

    fun addFilms()

    
}