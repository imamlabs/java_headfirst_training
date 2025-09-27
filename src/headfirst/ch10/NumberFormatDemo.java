package headfirst.ch10;

// KELAS: NumberFormatDemo
// Tujuan: Menunjukkan wrapper, autoboxing, dan formatting angka & tanggal
import java.text.DecimalFormat; // Untuk format angka khusus
import java.time.LocalDateTime; // Untuk tanggal/waktu modern
import java.time.format.DateTimeFormatter; // Formatter tanggal/waktu

public class NumberFormatDemo {
    public static void main(String[] args) {
        // Wrapper & autoboxing
        Integer a = 10; // Autoboxing dari int -> Integer
        Integer b = 20; // Autoboxing
        int sum = a + b; // Unboxing otomatis lalu penjumlahan
        System.out.println("Sum: " + sum); // Cetak jumlah

        // Decimal formatting
        double price = 12345.6789; // Nilai double
        DecimalFormat df = new DecimalFormat("#,##0.00"); // Pola ribuan dan 2 desimal
        System.out.println("Price formatted: " + df.format(price)); // Cetak harga terformat

        // Date-Time formatting
        LocalDateTime now = LocalDateTime.now(); // Waktu saat ini
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd MMM uuuu HH:mm:ss"); // Pola tanggal
        System.out.println("Now: " + now.format(fmt)); // Cetak waktu terformat
    }
}
