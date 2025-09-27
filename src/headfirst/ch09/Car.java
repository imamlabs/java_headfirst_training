package headfirst.ch09;

// KELAS: Car
// Tujuan: Menunjukkan pemanggilan super() dan overloading constructor
public class Car extends Vehicle {
    private int year;
    public Car() { // Konstruktor default
        this("Unknown", 0); // Delegasi ke konstruktor lain
    }
    public Car(String brand, int year) { // Konstruktor utama
        super(brand); // Panggil konstruktor superclass (Vehicle)
        this.year = year; // Set field
        System.out.println("Car constructed: " + brand + " (" + year + ")");
    }
}
