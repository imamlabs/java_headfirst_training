package headfirst.ch05;

// KELAS: SimpleDotComTestDrive
// Tujuan: Menjalankan permainan SimpleDotCom pada konsol
import java.util.concurrent.ThreadLocalRandom; // Untuk membuat posisi acak

public class SimpleDotComTestDrive { // Mendefinisikan kelas penguji
    public static void main(String[] args) { // Titik masuk program
        int start = ThreadLocalRandom.current().nextInt(0, 5); // Posisi awal 0..4 (agar muat 3 sel hingga 6)
        int[] locations = { start, start + 1, start + 2 }; // Kapal menempati 3 sel berurutan
        SimpleDotCom dot = new SimpleDotCom(); // Buat objek kapal
        dot.setLocationCells(locations); // Set posisi kapal
        GameHelper helper = new GameHelper(); // Buat helper untuk input
        int numOfGuesses = 0; // Hitung jumlah tebakan

        boolean isAlive = true; // Status permainan
        System.out.println("Tebak posisi kapal (0..6). Ketik 'q' untuk keluar."); // Instruksi

        while (isAlive) { // Loop selama kapal belum tenggelam
            String guess = helper.getUserInput("Masukkan angka:"); // Minta input user
            if (guess == null || guess.equals("q")) { // Jika user keluar
                System.out.println("Keluar permainan."); // Info
                break; // Hentikan loop
            }
            String result = dot.checkYourself(guess); // Cek tebakan
            numOfGuesses++; // Tambah counter tebakan
            if (result.equals("kill")) { // Jika kapal tenggelam
                isAlive = false; // Akhiri permainan
                System.out.println("Kamu menenggelamkan kapal dalam " + numOfGuesses + " tebakan."); // Ringkasan
            }
        } // Akhir while
    } // Akhir main
} // Akhir kelas
