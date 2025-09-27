package headfirst.ch14;

// KELAS: QuizCardIO
// Tujuan: Menulis/membaca daftar QuizCard ke/dari file menggunakan serialization
import java.io.*;                 // Stream I/O
import java.util.ArrayList;       // Struktur data penampung

public class QuizCardIO {
    public static void save(ArrayList<QuizCard> list, File file) throws IOException { // Simpan ke file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) { // Bungkus output
            out.writeObject(list); // Tulis seluruh list sebagai satu objek
        } // Otomatis close karena try-with-resources
    }
    @SuppressWarnings("unchecked") // Beri tahu compiler kita yakin tipe-nya benar
    public static ArrayList<QuizCard> load(File file) throws IOException, ClassNotFoundException { // Baca dari file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) { // Bungkus input
            return (ArrayList<QuizCard>) in.readObject(); // Casting hasil bacaan
        }
    }
    public static void main(String[] args) throws Exception { // Demo singkat
        // Buat data contoh
        ArrayList<QuizCard> data = new ArrayList<>();
        data.add(new QuizCard("Ibukota Indonesia?", "Jakarta"));
        data.add(new QuizCard("2+2?", "4"));

        // Simpan
        File f = new File("quizcards.dat"); // Nama file output
        save(data, f); // Tulis ke file
        System.out.println("Saved " + data.size() + " cards to " + f.getAbsolutePath());

        // Muat
        var loaded = load(f); // Baca kembali
        System.out.println("Loaded: " + loaded); // Tampilkan hasil
    }
}
