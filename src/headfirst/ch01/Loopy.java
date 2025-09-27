package headfirst.ch01;

// KELAS: Loopy
// Tujuan: Contoh while loop yang menampilkan nilai x setiap iterasi
public class Loopy { // Mendefinisikan kelas Loopy
    public static void main(String[] args) { // Titik masuk program
        int x = 1; // Inisialisasi x dengan 1
        System.out.println("Before the loop"); // Menandai awal
        while (x < 4) { // Loop berjalan selama x kurang dari 4
            System.out.println("In the loop"); // Info sedang di dalam loop
            System.out.println("Value of x is " + x); // Menampilkan nilai x
            x = x + 1; // Menambah x agar loop tidak infinite
        }
        System.out.println("This is after the loop"); // Menandai akhir
    } // Akhir main
} // Akhir kelas
