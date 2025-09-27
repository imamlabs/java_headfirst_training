package headfirst.tests;
import java.io.*;
import java.net.*;
public class TestCh15 {
    public static void main(String[] args) throws Exception {
        // Jalankan server pada thread terpisah
        Thread serverThread = new Thread(() -> {
            try { headfirst.ch15.SimpleServer.main(new String[0]); } catch (Exception e) { e.printStackTrace(); }
        });
        serverThread.setDaemon(true); // Biarkan berhenti bersama proses utama
        serverThread.start();
        // Tunggu server siap
        Thread.sleep(500); // Tunggu singkat

        // Klien sederhana (bukan SimpleClient yang membaca keyboard)
        try (Socket s = new Socket("127.0.0.1", 5000);
             BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
             PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true)) {
            out.println("hello");
            String resp = in.readLine();
            TestUtil.assertTrue(resp != null && resp.contains("echo:"), "Server echo response");
            out.println("quit");
        }
        System.out.println("Ch15 OK");
    }
}
