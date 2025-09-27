package headfirst.ch03;

// KELAS: Dog (versi sederhana untuk Bab 3)
// Tujuan: Menunjukkan field (instance variables) dan method sederhana
public class Dog { // Deklarasi kelas Dog
    public String name; // Field 'name' (public untuk kemudahan demo)
    public int size;    // Field 'size'

    public void bark() { // Method bark (perilaku)
        // Variasi suara berdasarkan size
        if (size > 60) {                 // Anjing besar
            System.out.println(name + ": Woof! Woof!");
        } else if (size > 14) {          // Anjing sedang
            System.out.println(name + ": Ruff! Ruff!");
        } else {                         // Anjing kecil
            System.out.println(name + ": Yap! Yap!");
        }
    } // Akhir method bark
} // Akhir kelas Dog
