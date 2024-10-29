package tugas2;

/**
 * Interface DaftarFilmm mendefinisikan metode yang digunakan untuk
 * mengelola daftar film.
 */
public interface DaftarFilmm {
    void tambahFilm(Film film);
    void tampilkanDaftarFilm();
    void cariFilmByGenre(String genre);
    void cariFilmByTahun(int tahun);
}
