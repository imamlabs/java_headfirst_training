package headfirst.ch04;

// KELAS: DogEncapTest
// Tujuan: Menguji enkapsulasi melalui getter/setter
public class DogEncapTest { // Deklarasi kelas
    public static void main(String[] args) { // Titik masuk
        DogEncap d = new DogEncap(); // Buat objek
        d.setName("Bruno");          // Set nama via setter
        d.setSize(70);               // Set size via setter
        System.out.println("Name: " + d.getName()); // Ambil nama via getter
        System.out.println("Size: " + d.getSize()); // Ambil size via getter
        d.bark(); // Perilaku menggunakan state terenkripsi
    } // Akhir main
} // Akhir kelas
