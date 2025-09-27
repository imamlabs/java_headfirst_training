package headfirst.ch08;

// KELAS: PolymorphismDemo
// Tujuan: Menunjukkan polymorphic reference dan casting
public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a = new Cat("Mimi"); // Reference bertipe Animal menunjuk ke objek Cat
        a.makeNoise();              // Polimorfik: panggil Cat.makeNoise()
        a.sleep();                  // Panggil method konkret di Animal

        // a.play(); // ERROR: a bertipe Animal, tidak kenal method play() dari Pet
        // Casting ke Pet agar bisa akses method interface
        Pet p = (Pet) a;            // Safe cast karena objek sebenarnya adalah Cat yang implements Pet
        p.play();                   // Panggil method dari interface Pet

        // Casting ke Cat agar bisa akses method spesifik scratch()
        if (a instanceof Cat) {     // Cek tipe nyata sebelum cast
            Cat c = (Cat) a;        // Cast ke Cat
            c.scratch();            // Panggil method khusus Cat
        }
    }
}
