package headfirst.ch03;

// KELAS: ArrayIntro
// Tujuan: Memperkenalkan Array (ukuran tetap, indeks mulai 0)
public class ArrayIntro { // Deklarasi kelas
    public static void main(String[] args) { // Titik masuk program
        int[] nums = new int[4]; // Membuat array int berukuran 4 (indeks 0..3), default 0
        nums[0] = 42;            // Isi indeks 0
        nums[1] = 7;             // Isi indeks 1
        nums[2] = 13;            // Isi indeks 2
        // nums[3] tetap 0 (default)

        // Loop for untuk menampilkan semua elemen
        for (int i = 0; i < nums.length; i++) { // i dari 0 hingga 3
            System.out.println("nums[" + i + "] = " + nums[i]); // Cetak elemen
        }

        // Array literal (cara cepat) -> membuat dan mengisi sekaligus
        String[] names = { "Ana", "Budi", "Chandra" }; // Panjang 3
        for (String n : names) { // Enhanced for (for-each) untuk iterasi elemen
            System.out.println("Name: " + n); // Mencetak nama
        }
    } // Akhir main
} // Akhir kelas ArrayIntro
