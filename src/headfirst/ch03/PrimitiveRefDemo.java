package headfirst.ch03;

// KELAS: PrimitiveRefDemo
// Tujuan: Menjelaskan perbedaan PRIMITIVE vs REFERENCE di Java
public class PrimitiveRefDemo { // Deklarasi kelas
    public static void main(String[] args) { // Titik masuk program
        // ---------- Bagian 1: Primitive (menyimpan NILAI langsung) ----------
        int a = 10; // 'a' menyimpan nilai 10
        int b = a;  // 'b' mendapatkan SALINAN nilai dari 'a' (bukan referensi)
        a = 99;     // Mengubah 'a' TIDAK mempengaruhi 'b'
        System.out.println("Primitive -> a: " + a + ", b: " + b); // Output: a:99, b:10

        // ---------- Bagian 2: Reference (menyimpan ALAMAT objek) ----------
        Dog dog1 = new Dog(); // 'dog1' menyimpan REFERENSI (alamat) objek Dog di heap
        dog1.name = "Fido";   // Set field 'name' pada objek yang dirujuk 'dog1'

        Dog dog2 = dog1;      // 'dog2' memegang referensi yang SAMA (bukan salinan objek)
        dog2.name = "Rex";    // Mengubah melalui 'dog2' memodifikasi objek yang sama
        System.out.println("Reference -> dog1.name: " + dog1.name + ", dog2.name: " + dog2.name);
        // Keduanya "Rex" karena merujuk objek yang sama
    } // Akhir main

    // KELAS NESTED SEDERHANA (untuk demo)
    static class Dog { // Kelas Dog sederhana dengan satu field
        String name;  // Field 'name' (reference ke objek String)
    } // Akhir kelas Dog
} // Akhir kelas PrimitiveRefDemo
