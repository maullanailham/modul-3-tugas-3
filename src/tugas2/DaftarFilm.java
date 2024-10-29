package tugas2;

import java.util.ArrayList;
import java.util.List;

/**
 * Kelas DaftarFilm digunakan untuk menyimpan dan mengelola daftar film.
 */
public class DaftarFilm implements DaftarFilmm {
    private List<Film> filmList = new ArrayList<>();

    @Override
    public void tambahFilm(Film film) {
        filmList.add(film);
    }

    @Override
    public void tampilkanDaftarFilm() {
        listFilm();
    }

    private void listFilm() {
        for (Film film : filmList) {
            System.out.println("Judul: " + film.getJudul());
            System.out.println("Genre: " + film.getGenre());
            System.out.println("Tahun Rilis: " + film.getTahunRilis());
            System.out.println("---------------------------");
        }
    }

    @Override
    public void cariFilmByGenre(String genre) {
        for (Film film : filmList) {
            if (film.getGenre().equalsIgnoreCase(genre)) {
                System.out.println("Judul: " + film.getJudul());
            }
        }
    }

    @Override
    public void cariFilmByTahun(int tahun) {
        for (Film film : filmList) {
            if (film.getTahunRilis() == tahun) {
                System.out.println("Judul: " + film.getJudul());
            }
        }
    }
}
