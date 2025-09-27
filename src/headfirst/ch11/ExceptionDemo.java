package headfirst.ch11;

// KELAS: ExceptionDemo
// Tujuan: Menunjukkan try-catch-finally, multi-catch, throw/throws
public class ExceptionDemo {
    public static void risky(int n) throws CustomException { // 'throws' -> caller harus tangani
        if (n < 0) { // Kondisi tidak valid
            throw new CustomException("n tidak boleh negatif: " + n); // Lempar exception kustom
        }
        int result = 10 / n; // Bisa memicu ArithmeticException jika n == 0
        System.out.println("Result = " + result); // Cetak hasil bila aman
    }

    public static void main(String[] args) {
        try { // Coba eksekusi kode berisiko
            risky(2);    // Aman
            risky(0);    // Akan memicu ArithmeticException (runtime)
            risky(-5);   // Tidak dieksekusi karena sudah terhenti oleh exception sebelumnya
        } catch (ArithmeticException | NullPointerException ex) { // Multi-catch
            System.out.println("Runtime error: " + ex.getMessage()); // Tangani runtime exception
        } catch (CustomException ex) { // Tangani exception kustom (checked)
            System.out.println("Custom error: " + ex.getMessage()); // Tampilkan pesan
        } finally { // Selalu dieksekusi
            System.out.println("Blok finally: selalu jalan untuk cleanup."); // Cleanup/logging
        }
    }
}
