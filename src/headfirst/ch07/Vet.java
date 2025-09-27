package headfirst.ch07;

// KELAS: Vet (memiliki/HAS-A dependency pada Animal)
// Tujuan: Mencontohkan HAS-A (komposisi/agregasi) + polimorfisme saat menerima Animal
public class Vet { // Dokter hewan
    public void examine(Animal a) { // Menerima Animal APAPUN (supertype)
        System.out.print("Examining... ");
        a.makeNoise(); // Polimorfik: akan memanggil versi override milik subclass
    }
}
