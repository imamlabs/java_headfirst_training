package headfirst.ch15;

// KELAS: SimpleClient
// Tujuan: Klien socket sederhana untuk mengirim pesan ke server
import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) throws Exception {
        String host = "127.0.0.1"; // Alamat server
        int port = 5000;           // Port server
        try (Socket socket = new Socket(host, port); // Hubungkan ke server
             BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); // Input user
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Input dari server
             PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true)) { // Output ke server
            System.out.println("Connected. Ketik pesan, 'quit' untuk keluar.");
            String line;
            while ((line = keyboard.readLine()) != null) { // Baca dari keyboard
                out.println(line); // Kirim ke server
                if ("quit".equalsIgnoreCase(line)) break; // Berhenti jika 'quit'
                String reply = in.readLine(); // Baca balasan
                System.out.println("Server: " + reply); // Tampilkan
            }
        }
    }
}
