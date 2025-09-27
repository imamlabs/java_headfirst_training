package headfirst.ch09;

// KELAS: ConstructorDemo
// Tujuan: Menjalankan contoh constructor chaining & super()
public class ConstructorDemo {
    public static void main(String[] args) {
        Car c1 = new Car();                 // Panggil chain default -> "Unknown", 0
        Car c2 = new Car("Toyota", 2020);   // Panggil konstruktor utama

        // GC bukan fitur yang bisa diandalkan manual; cukup tunjukkan bahwa object akan dikumpulkan
        c1 = null; // Lepas referensi (sekadar contoh; tidak menjamin GC segera jalan)
        c2 = null;
        // System.gc(); // TIDAK disarankan di produksi; hanya untuk demo (opsional)
        System.out.println("Objects eligible for GC when no longer referenced.");
    }
}
