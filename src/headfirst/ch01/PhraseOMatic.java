package headfirst.ch01;

// KELAS: PhraseOMatic
// Tujuan: Menghasilkan frasa bisnis acak ala "Phrase-o-matic"
import java.util.concurrent.ThreadLocalRandom; // Mengimpor utilitas untuk angka acak

public class PhraseOMatic { // Mendefinisikan kelas PhraseOMatic
    public static void main(String[] args) { // Titik masuk program
        // Daftar kata (sesuai nuansa contoh di buku; Anda boleh menambah sendiri)
        String[] wordListOne = { // Array kata bagian 1
            "24/7", "multi-tier", "30,000 foot", "B-to-B", "win-win",
            "front-end", "web-based", "pervasive", "smart", "six-sigma",
            "critical-path", "dynamic"
        };

        String[] wordListTwo = { // Array kata bagian 2
            "empowered", "sticky", "value-added", "oriented", "centric",
            "distributed", "clustered", "branded", "outside-the-box",
            "positioned", "networked", "focused", "leveraged", "aligned",
            "targeted", "shared", "cooperative", "accelerated"
        };

        String[] wordListThree = { // Array kata bagian 3
            "process", "tipping-point", "solution", "architecture",
            "core competency", "strategy", "mindshare", "portal",
            "space", "vision", "paradigm"
        };

        // Tentukan panjang masing-masing array (untuk batas acak)
        int oneLen = wordListOne.length; // Panjang array pertama
        int twoLen = wordListTwo.length; // Panjang array kedua
        int threeLen = wordListThree.length; // Panjang array ketiga

        // Ambil indeks acak untuk masing-masing array
        int i1 = ThreadLocalRandom.current().nextInt(oneLen); // Indeks acak 0..oneLen-1
        int i2 = ThreadLocalRandom.current().nextInt(twoLen); // Indeks acak 0..twoLen-1
        int i3 = ThreadLocalRandom.current().nextInt(threeLen); // Indeks acak 0..threeLen-1

        // Gabungkan menjadi satu frasa
        String phrase = wordListOne[i1] + " " + wordListTwo[i2] + " " + wordListThree[i3]; // Merangkai kata

        // Cetak frasa ke konsol
        System.out.println("What we need is a " + phrase + "."); // Menampilkan hasil
    } // Akhir main
} // Akhir kelas
