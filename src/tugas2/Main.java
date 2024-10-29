package tugas2;

/**
 * Kelas Main digunakan untuk menjalankan program utama
 * yang berfungsi untuk mengelola daftar film.
 */
public class Main {
    public static void main(String[] args) {
        DaftarFilm daftarFilm = new DaftarFilm();
        daftarFilm.tambahFilm(new Film(new InfoFilm("Inception", "Sci-Fi", 2010)));
        daftarFilm.tambahFilm(new Film(new InfoFilm("Titanic", "Romance", 1997)));

        daftarFilm.tampilkanDaftarFilm();

        System.out.println("Film dengan genre Sci-Fi:");
        daftarFilm.cariFilmByGenre("Sci-Fi");

        System.out.println("Film yang rilis tahun 1997:");
        daftarFilm.cariFilmByTahun(1997);
    }
}
