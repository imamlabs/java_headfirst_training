package headfirst.ch04;

// KELAS: PassByValue
// Tujuan: Menunjukkan bahwa Java SELALU pass-by-value (nilai variabel disalin)
public class PassByValue { // Deklarasi kelas
    public static void main(String[] args) { // Titik masuk
        int x = 10;            // Primitive
        changePrimitive(x);    // Mengirim salinan nilai 10
        System.out.println("Setelah changePrimitive, x = " + x); // Tetap 10

        Dog d = new Dog("Fido"); // Reference ke objek Dog
        renameDog(d);            // Mengirim SALINAN REFERENSI (alamat) objek
        System.out.println("Setelah renameDog, d.getName() = " + d.getName()); // Nama berubah (objek sama)

        reassignReference(d);    // Mengirim SALINAN referensi, lalu diset ke objek baru di dalam method
        System.out.println("Setelah reassignReference, d.getName() = " + d.getName()); // Tetap sama seperti sebelum pemanggilan
    }

    static void changePrimitive(int y) { // y adalah SALINAN dari x
        y = 999; // Mengubah y tidak mengubah x di caller
    }

    static void renameDog(Dog dogRef) { // dogRef adalah salinan referensi ke objek yang sama
        dogRef.setName("Rex"); // Mengubah state objek -> caller melihat perubahan
    }

    static void reassignReference(Dog dogRef) {
        dogRef = new Dog("Max"); // MENGALIHAN salinan referensi ke objek baru (tidak mempengaruhi variabel caller)
    }

    // KELAS Dog untuk demo pass-by-value referensi
    static class Dog {
        private String name;
        Dog(String name) { this.name = name; }
        String getName() { return name; }
        void setName(String name) { this.name = name; }
    }
}
