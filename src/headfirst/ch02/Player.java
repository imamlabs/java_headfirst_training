package headfirst.ch02;

// KELAS: Player
// Tujuan: Mewakili pemain yang "menebak" angka
import java.util.concurrent.ThreadLocalRandom; // Untuk menghasilkan tebakan acak

public class Player { // Mendefinisikan kelas Player
    private int number = 0; // Simpan angka tebakan terakhir (private agar enkapsulasi rapi)

    public void guess() { // Method untuk melakukan tebakan
        number = ThreadLocalRandom.current().nextInt(10); // Menebak angka 0..9
        System.out.println("I'm guessing " + number); // Menampilkan tebakan
    }

    public int getNumber() { // Getter untuk angka tebakan (dipakai di test)
        return number;
    }
}
