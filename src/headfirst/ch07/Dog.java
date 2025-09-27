package headfirst.ch07;

// KELAS: Dog (subclass)
// Tujuan: Menunjukkan pewarisan (extends) dan overriding method
public class Dog extends Animal { // Dog ADALAH Animal (IS-A)
    public Dog(String name) { // Konstruktor Dog
        super(name); // Panggil konstruktor superclass (Animal)
    }
    @Override // Menandai bahwa kita MENIMPA (override) method dari superclass
    public void makeNoise() { // Versi Dog dari makeNoise
        System.out.println(name + ": Woof!"); // Suara anjing
    }
    // Overloading (nama sama, parameter beda) — contoh sederhana
    public void makeNoise(int times) { // Overloading method makeNoise
        for (int i = 0; i < times; i++) { // Ulangi sesuai 'times'
            makeNoise(); // Panggil versi tanpa parameter (override)
        }
    }
}
