package headfirst.ch05;

// KELAS: GameHelper
// Tujuan: Membantu membaca input pengguna dari konsol
import java.io.BufferedReader; // Untuk pembacaan baris
import java.io.InputStreamReader; // Untuk membaca dari System.in
import java.io.IOException; // Menangani kemungkinan IOException

public class GameHelper { // Mendefinisikan kelas GameHelper
    public String getUserInput(String prompt) { // Method untuk meminta input user
        String inputLine = null; // Variabel hasil input
        System.out.print(prompt + " "); // Cetak prompt dengan spasi
        try { // Blok coba untuk menangkap error I/O
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in)); // Bungkus System.in menjadi reader berbaris
            inputLine = is.readLine(); // Baca satu baris dari input
        } catch (IOException e) { // Jika terjadi error
            System.out.println("IOException: " + e); // Tampilkan pesan error
        }
        if (inputLine == null || inputLine.length() == 0) { // Jika input kosong
            return null; // Kembalikan null
        }
        return inputLine.toLowerCase(); // Kembalikan input dalam huruf kecil
    } // Akhir getUserInput
} // Akhir kelas
