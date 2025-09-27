package headfirst.ch02;

// KELAS: Player
// Tujuan: Mewakili pemain yang "menebak" angka
import java.util.concurrent.ThreadLocalRandom; // Untuk menghasilkan tebakan acak

public class Player { // Mendefinisikan kelas Player
    int number = 0; // Menyimpan angka tebakan terakhir si pemain

    public void guess() { // Method untuk melakukan tebakan
        number = ThreadLocalRandom.current().nextInt(10); // Menebak angka 0..9
        System.out.println("I'm guessing " + number); // Menampilkan tebakan
    } // Akhir method guess
} // Akhir kelas
