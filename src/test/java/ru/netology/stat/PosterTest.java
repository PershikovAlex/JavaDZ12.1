package ru.netology.stat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {
    Poster poster = new Poster();
    Film film1 = new Film(1, "Фильм1", "111", "Боевик");
    Film film2 = new Film(2, "Фильм2", "222", "Комедия");
    Film film3 = new Film(3, "Фильм3", "333", "Драма");
    Film film4 = new Film(4, "Фильм4", "444", "Триллер");
    Film film5 = new Film(5, "Фильм5", "555", "Документальный");
    Film film6 = new Film(6, "Фильм6", "666", "Трагикомедия");
    @Test
    void shouldAddFilms() {
        Poster poster = new Poster(5);

        poster.addFilm(film1);

        Film[] expected = new Film[]{film1};
        Film[] actual = poster.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetMaxLimit() {
        Poster poster = new Poster(3);

        poster.addFilm(film1);
        poster.addFilm(film2);
        poster.addFilm(film3);
        poster.addFilm(film4);
        poster.addFilm(film5);
        poster.addFilm(film6);

        Film[] expected = new Film[]{film6, film5, film4};
        Film[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAllFillms() {
        Poster poster = new Poster();
        poster.addFilm(film1);
        poster.addFilm(film2);
        poster.addFilm(film3);
        poster.addFilm(film4);
        poster.addFilm(film5);
        poster.addFilm(film6);

        Film[] expected = new Film[]{film6, film5, film4, film3, film2, film1};
        Film[] actual = poster.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
