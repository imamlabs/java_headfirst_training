package headfirst.ch08;

// KELAS: Cat
// Tujuan: Contoh kelas yang MENG-extends Animal (abstract) + implements Pet (interface)
public class Cat extends Animal implements Pet { // Cat IS-A Animal & IS-A Pet (via interface)
    public Cat(String name) { super(name); } // Panggil konstruktor superclass
    @Override public void makeNoise() { System.out.println(name + ": Meow!"); } // Implementasi abstrak
    @Override public void play() { System.out.println(name + " plays with a yarn ball."); } // Implement interface
    public void scratch() { System.out.println(name + " scratches the sofa!"); } // Method spesifik Cat
}
