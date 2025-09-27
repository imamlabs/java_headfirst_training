package headfirst.ch07;

// KELAS: InheritanceDemo
// Tujuan: Menjalankan contoh pewarisan, overriding, overloading, IS-A vs HAS-A
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Bruno"); // Dog IS-A Animal
        d.eat();                  // Panggil method warisan (Animal.eat)
        d.makeNoise();            // Panggil method override (Dog.makeNoise)
        d.makeNoise(3);           // Panggil method overload (punya parameter)

        Vet clinic = new Vet();   // Vet HAS-A ketergantungan terhadap Animal
        clinic.examine(d);        // Polimorfik — memanggil Dog.makeNoise()

        Animal a = new Animal("Generic"); // Objek Animal biasa
        clinic.examine(a);                // Memanggil versi Animal.makeNoise()
    }
}
