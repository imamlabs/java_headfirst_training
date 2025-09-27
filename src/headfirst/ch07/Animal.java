package headfirst.ch07;

// KELAS: Animal
// Tujuan: Menjadi kelas dasar (superclass) untuk contoh pewarisan
public class Animal { // Superclass umum
    protected String name; // 'protected' agar subclass bisa akses langsung (untuk demo)

    public Animal(String name) { // Konstruktor untuk memberi nama
        this.name = name; // Simpan nama
    }
    public void makeNoise() { // Perilaku default
        System.out.println(name + " makes some noise..."); // Pesan generik
    }
    public void eat() { // Perilaku umum
        System.out.println(name + " is eating."); // Cetak aktivitas
    }
}
