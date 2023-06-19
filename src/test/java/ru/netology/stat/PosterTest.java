package ru.netology.stat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {
    Poster poster = new Poster();
    @Test
    void shouldAdd() {
        Poster poster = new Poster(5);
        Film film1 = new Film(1, "Фильм1", "111", "Боевик");
        Film film2 = new Film(2, "Фильм2", "222", "Комедия");
        Film film3 = new Film(3, "Фильм3", "333", "Драма");
        poster.addFilm(film1);
        poster.addFilm(film2);
        poster.addFilm(film3);
        Film[] expected = new Film[]{film3, film2, film1};
        Film[] actual = poster.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
