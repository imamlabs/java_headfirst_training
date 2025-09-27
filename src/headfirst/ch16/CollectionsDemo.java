package headfirst.ch16;

// KELAS: CollectionsDemo
// Tujuan: Menunjukkan sort, Comparator, HashSet uniqueness
import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>(); // List lagu
        songs.add(new Song("Pink Moon", "Nick Drake", 120));
        songs.add(new Song("Somersault", "Zero 7", 100));
        songs.add(new Song("Circles", "BT", 128));
        songs.add(new Song("Passenger", "Headmix", 90));
        songs.add(new Song("Pink Moon", "Nick Drake", 120)); // Duplikat

        // Sort default (Comparable -> title)
        Collections.sort(songs); // Urutkan by title
        System.out.println("Sort by title (default): " + songs);

        // Sort by artist (Comparator)
        songs.sort(Comparator.comparing(Song::getArtist, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Sort by artist: " + songs);

        // Uniqueness pada Set (menggunakan equals/hashCode)
        Set<Song> unique = new HashSet<>(songs); // Hapus duplikat berdasarkan equals/hashCode
        System.out.println("Unique set: " + unique);
    }
}
