package headfirst.ch04;

// KELAS: DogEncap
// Tujuan: Mencontohkan ENCAPSULATION (field private + getter/setter)
public class DogEncap { // Deklarasi kelas
    private String name; // Field private (hanya bisa diakses lewat method)
    private int size;    // Field private

    // GETTER untuk name
    public String getName() { // Mengembalikan nilai name
        return name;
    }

    // SETTER untuk name
    public void setName(String name) { // Mengatur nilai name
        // Bisa menambahkan validasi di sini bila perlu
        this.name = name; // 'this' merujuk pada field milik objek ini
    }

    // GETTER untuk size
    public int getSize() { // Mengembalikan nilai size
        return size;
    }

    // SETTER untuk size
    public void setSize(int size) { // Mengatur nilai size
        if (size < 0) { // Contoh validasi sederhana
            size = 0;   // Hindari nilai negatif
        }
        this.size = size; // Simpan ke field
    }

    // Behavior
    public void bark() { // Method bark memanfaatkan state (name, size)
        if (size > 60) {
            System.out.println(name + ": Woof! Woof!");
        } else if (size > 14) {
            System.out.println(name + ": Ruff! Ruff!");
        } else {
            System.out.println(name + ": Yap! Yap!");
        }
    }
}
