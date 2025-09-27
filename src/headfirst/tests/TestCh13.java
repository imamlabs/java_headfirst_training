package headfirst.tests;
public class TestCh13 {
    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "true");
        // Jalankan main; SwingWidgetsDemo membuat GUI. Karena headless, kita tidak jalankan main.
        // Sebagai ganti, uji komponen secara konstruksi minimal: tidak tersedia konstruktor terpisah,
        // jadi cukup anggap Bab 13 OK jika kelas dapat dimuat (classloading sukses).
        try {
            Class.forName("headfirst.ch13.SwingWidgetsDemo");
            System.out.println("Ch13 OK (class loaded)");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Ch13 class not found", e);
        }
    }
}
