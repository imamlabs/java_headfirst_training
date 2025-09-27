package headfirst.ch01;

// KELAS: IfTest2
// Tujuan: Menunjukkan if-else
public class IfTest2 { // Mendefinisikan kelas IfTest2
    public static void main(String[] args) { // Titik masuk program
        int x = 2; // Inisialisasi x = 2
        if (x == 3) { // Jika x sama dengan 3
            System.out.println("x must be 3"); // Cabang benar
        } else { // Selain itu (x bukan 3)
            System.out.println("x is NOT 3"); // Cabang salah
        }
        System.out.println("This runs no matter what"); // Selalu dicetak
    } // Akhir main
} // Akhir kelas
