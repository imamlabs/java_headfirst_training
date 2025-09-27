package headfirst.ch15;

// KELAS: SimpleServer
// Tujuan: Server socket sederhana yang memantulkan kembali (echo) pesan klien
import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) throws Exception {
        int port = 5000; // Port server
        ServerSocket server = new ServerSocket(port); // Buka port
        System.out.println("Server listening on port " + port);
        while (true) { // Terima banyak klien
            Socket socket = server.accept(); // Tunggu koneksi
            // Tangani tiap klien pada thread terpisah
            new Thread(() -> handle(socket)).start(); // Buat thread lambda
        }
    }
    private static void handle(Socket socket) { // Tangani satu klien
        System.out.println("Client connected: " + socket);
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true)) {
            String line;
            while ((line = in.readLine()) != null) { // Baca baris
                if ("quit".equalsIgnoreCase(line)) break; // Keluar jika "quit"
                out.println("echo: " + line); // Kirim balik
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try { socket.close(); } catch (IOException ignore) {}
            System.out.println("Client disconnected: " + socket);
        }
    }
}
