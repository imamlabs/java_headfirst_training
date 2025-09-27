package headfirst.ch01;

// KELAS: DooBee
// Tujuan: Mencetak pola "DooBeeDooBeeDo" menggunakan loop dan if
public class DooBee { // Mendefinisikan kelas DooBee
    public static void main(String[] args) { // Titik masuk program
        int x = 1; // Inisialisasi variabel penghitung
        while (x < 3) { // Loop akan berjalan saat x bernilai 1 dan 2
            System.out.print("Doo"); // Cetak "Doo" tanpa newline
            System.out.print("Bee"); // Cetak "Bee" tanpa newline (hasil: "DooBee")
            x = x + 1; // Tambah x untuk mendekati kondisi berhenti
        }
        if (x == 3) { // Setelah loop selesai, x bernilai 3
            System.out.print("Do"); // Cetak "Do" untuk menghasilkan "DooBeeDooBeeDo"
        }
        System.out.println(); // Pindah baris setelah selesai
    } // Akhir main
} // Akhir kelas
