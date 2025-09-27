package headfirst.ch08;

// KELAS ABSTRAK: Animal
// Tujuan: Menjadi supertype yang TIDAK dapat diinstansiasi langsung
public abstract class Animal { // 'abstract' -> hanya untuk diwariskan
    protected String name; // Nama hewan
    public Animal(String name) { this.name = name; } // Konstruktor
    public abstract void makeNoise(); // Harus diimplementasikan subclass
    public void sleep() { System.out.println(name + " is sleeping..."); } // Concrete method
}
