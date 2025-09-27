package headfirst.ch01;

// KELAS: BeerSong
// Tujuan: Menyanyikan lagu "99 bottles of beer" dengan logika if/else dan loop
public class BeerSong { // Mendefinisikan kelas BeerSong
    public static void main(String[] args) { // Titik masuk program
        int beerNum = 99; // Mendeklarasikan variabel jumlah botol bir, mulai dari 99
        String word = "bottles"; // Kata baku jamak "bottles"

        // Loop akan berjalan selama beerNum lebih besar dari 0
        while (beerNum > 0) { // Memulai loop while
            if (beerNum == 1) { // Jika tinggal 1 botol, gunakan bentuk tunggal
                word = "bottle"; // Ubah kata menjadi "bottle"
            } else { // Jika lebih dari 1 botol
                word = "bottles"; // Pastikan kata jamak
            }

            // Menampilkan baris lagu sesuai jumlah botol saat ini
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down."); // Instruksi mengambil satu botol
            System.out.println("Pass it around."); // Instruksi meneruskan botol

            beerNum = beerNum - 1; // Mengurangi jumlah botol sebanyak 1

            // Setelah dikurangi, cek apakah masih ada botol
            if (beerNum > 0) { // Jika masih ada
                // Tentukan kembali bentuk kata (singular/plural) untuk tampilan selanjutnya
                word = (beerNum == 1) ? "bottle" : "bottles"; // Operator ternary untuk ringkas
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println(); // Baris kosong untuk pemisah
            } else { // Jika habis
                System.out.println("No more bottles of beer on the wall"); // Penutup lagu
            }
        } // Akhir while
    } // Akhir main
} // Akhir kelas
