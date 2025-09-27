package headfirst.ch11;

// KELAS: CustomException
// Tujuan: Membuat exception kustom
public class CustomException extends Exception { // Extend dari Exception (checked)
    public CustomException(String message) { // Konstruktor dengan pesan
        super(message); // Teruskan ke superclass
    }
}
