package headfirst.ch03;

// KELAS: DogTestDrive
// Tujuan: Membuat objek Dog, mengisi state (field), memanggil behavior (method)
public class DogTestDrive { // Deklarasi kelas
    public static void main(String[] args) { // Titik masuk
        Dog d = new Dog();    // Membuat objek Dog
        d.name = "Fido";      // Set nama
        d.size = 50;          // Set ukuran
        d.bark();             // Panggil perilaku (akan "Ruff! Ruff!" untuk size 50)

        Dog e = new Dog();    // Objek Dog lain
        e.name = "Tiny";      // Nama lain
        e.size = 8;           // Ukuran kecil
        e.bark();             // Akan "Yap! Yap!"
    } // Akhir main
} // Akhir kelas
