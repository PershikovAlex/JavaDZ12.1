package ru.netology.stat;

public class Poster {
    private Film[] films = new Film[0];
    private int maxLimit;

    public Poster() {

    }
    public Poster(int maxLimit) {

        this.maxLimit = maxLimit;
    }


    public void addFilm(Film film) {
        int resultLength = films.length + 1;
        Film[] tmp = new Film[resultLength];

        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film[] findAll() {

        Film[] result = new Film[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public Film[] findLast() {
        int resultLength = maxLimit;
        if (resultLength > films.length) {
            resultLength = films.length;
        }

        Film[] result = new Film[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
