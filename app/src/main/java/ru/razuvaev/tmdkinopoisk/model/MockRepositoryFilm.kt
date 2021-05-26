package ru.razuvaev.tmdkinopoisk.model

object MockRepositoryFilm : FilmsRepository {

    private val data: ArrayList<FilmSheet> = ArrayList()

    override fun getFilms(): ArrayList<FilmSheet> {return ArrayList(data)}

    override fun addFilms() {
        data.add(
            FilmSheet(
                "id1",
                "Title Number 1",
                "7.2",
                "Comedy",
                "https://www.mekc.info/wp-content/uploads/2017/09/sp_s13_poster_FULL.jpg",
                false
            )
        )
        data.add(
            FilmSheet(
                "id2",
                "Title Number 2",
                "7.2",
                "Comedy",
                "https://www.l4d-inside.ru/900x680/assets/gallery/posters/BloodHarvest.jpg",
                true
            )
        )
        data.add(
            FilmSheet(
                "id3",
                "Title Number 3",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/54545-1.jpg",
                true
            )
        )
        data.add(
            FilmSheet(
                "id4",
                "Title Number 4",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-22.jpg",
                true
            )
        )
        data.add(
            FilmSheet(
                "id5",
                "Title Number 5",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-21-1.jpg",
                true
            )
        )
        data.add(
            FilmSheet(
                "id6",
                "Title Number 6",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-14.jpg",
                false
            )
        )
        data.add(
            FilmSheet(
                "id7",
                "Title Number 7",
                "7.2",
                "Comedy",
                "https://www.mekc.info/wp-content/uploads/2017/09/sp_s13_poster_FULL.jpg",
                true
            )
        )
        data.add(
            FilmSheet(
                "id8",
                "Title Number 8",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-38.jpg",
                true
            )
        )
        data.add(
            FilmSheet(
                "id9",
                "Title Number 9",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-18.jpg",
                false
            )
        )
        data.add(
            FilmSheet(
                "id10",
                "Title Number 10",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-39.jpg",
                true
            )
        )
        data.add(
            FilmSheet(
                "id11",
                "Title Number 11",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-40.jpg",
                true
            )
        )
        data.add(
            FilmSheet(
                "id12",
                "Title Number 12",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-2.jpg",
                true
            )
        )
        data.add(
            FilmSheet(
                "id13",
                "Title Number 13",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-37.jpg",
                true
            )
        )
        data.add(
            FilmSheet(
                "id14",
                "Title Number 14",
                "7.2",
                "Comedy",
                "https://www.mekc.info/wp-content/uploads/2017/09/sp_s13_poster_FULL.jpg",
                true
            )
        )
        data.add(
            FilmSheet(
                "id15",
                "Title Number 15",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-6.jpg",
                false
            )
        )
        data.add(
            FilmSheet(
                "id16",
                "Title Number 16",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-12.jpg",
                true
            )
        )
        data.add(
            FilmSheet(
                "id17",
                "Title Number 17",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-39.jpg",
                true
            )
        )
        data.add(
            FilmSheet(
                "id18",
                "Title Number 18",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-33.jpg",
                false
            )
        )
        data.add(
            FilmSheet(
                "id19",
                "Title Number 19",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-21-1.jpg",
                true
            )
        )
        data.add(
            FilmSheet(
                "id20",
                "Title Number 20",
                "7.2",
                "Comedy",
                "http://beloweb.ru/wp-content/uploads/2016/03/Your_Post_As_A_Movie-2.jpg",
                true
            )
        )
    }
}