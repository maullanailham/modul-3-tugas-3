package tugas2;

/**
 * Kelas Film merepresentasikan informasi dasar mengenai sebuah film.
 */
public class Film {
    private String judul;
    private String genre;
    private int tahunRilis;

    /**
     * Konstruktor untuk membuat objek Film.
     *
     * @param infoFilm objek InfoFilm yang berisi informasi film
     */
    public Film(InfoFilm infoFilm) {
        this.judul = infoFilm.judul();
        this.genre = infoFilm.genre();
        this.tahunRilis = infoFilm.tahunRilis();
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }
}
