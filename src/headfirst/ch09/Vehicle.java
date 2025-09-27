package headfirst.ch09;

// KELAS: Vehicle
// Tujuan: Menunjukkan constructor chaining dan super()
public class Vehicle {
    protected String brand;
    public Vehicle() { // Konstruktor default
        this("Generic"); // Panggil konstruktor lain di kelas yang sama (this())
    }
    public Vehicle(String brand) { // Konstruktor dengan parameter
        this.brand = brand; // Set nilai field
        System.out.println("Vehicle constructed with brand: " + brand); // Info konstruksi
    }
}
