package headfirst.ch06;

// KELAS: ArrayListDog
// Tujuan: Menunjukkan penggunaan Java Library (ArrayList) dan autoboxing
import java.util.ArrayList; // Mengimpor kelas ArrayList dari Java Collections Framework
import java.util.List;      // Antarmuka List

public class ArrayListDog { // Deklarasi kelas
    // KELAS INNER sederhana
    static class Dog {
        String name;
        Dog(String name) { this.name = name; }
        void bark() { System.out.println(name + ": Woof!"); }
        @Override public String toString() { return "Dog(" + name + ")"; }
    }

    public static void main(String[] args) { // Titik masuk
        List<Dog> dogs = new ArrayList<>(); // Buat ArrayList bertipe Dog (generics)
        dogs.add(new Dog("Bruno"));         // Tambah elemen (index 0)
        dogs.add(new Dog("Milo"));          // Tambah elemen (index 1)
        dogs.add(new Dog("Zara"));          // Tambah elemen (index 2)

        // Iterasi dengan for-each
        for (Dog d : dogs) { // Ambil setiap objek Dog
            d.bark();        // Panggil perilakunya
        }

        // Akses berdasarkan indeks
        Dog first = dogs.get(0); // Ambil elemen pertama
        System.out.println("First: " + first); // Panggil toString()

        // Menghapus elemen
        dogs.remove(1); // Hapus elemen berindeks 1 ("Milo")
        System.out.println("Ukuran setelah remove: " + dogs.size()); // Ukuran list terkini

        // Autoboxing demo (Java otomatis konversi int <-> Integer)
        List<Integer> numbers = new ArrayList<>(); // List angka
        numbers.add(10); // Autoboxing (int -> Integer)
        numbers.add(20);
        int sum = 0;
        for (int n : numbers) { // Unboxing saat iterasi
            sum += n;
        }
        System.out.println("Sum = " + sum); // Tampilkan jumlah
    } // Akhir main
} // Akhir kelas
