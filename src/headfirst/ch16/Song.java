package headfirst.ch16;

// KELAS: Song
// Tujuan: Objek lagu untuk latihan sorting & set/map
import java.util.Objects; // Untuk equals/hashCode

public class Song implements Comparable<Song> { // Implement Comparable untuk sorting alami (title)
    private String title;  // Judul
    private String artist; // Artis
    private int bpm;       // Beats per minute (contoh metadata)

    public Song(String title, String artist, int bpm) { // Konstruktor
        this.title = title; this.artist = artist; this.bpm = bpm; // Simpan field
    }
    public String getTitle() { return title; }   // Getter
    public String getArtist() { return artist; } // Getter
    public int getBpm() { return bpm; }          // Getter

    @Override public int compareTo(Song o) { // Sorting alami: berdasarkan title
        return this.title.compareToIgnoreCase(o.title); // Bandingkan tanpa memperhatikan kapital
    }
    @Override public boolean equals(Object o) { // Dua lagu sama jika judul & artis sama
        if (this == o) return true; // Cek referensi sama
        if (!(o instanceof Song)) return false; // Tipe lain -> tidak sama
        Song s = (Song) o; // Cast
        return Objects.equals(title, s.title) && Objects.equals(artist, s.artist); // Bandingkan field
    }
    @Override public int hashCode() { // Hash konsisten dgn equals
        return Objects.hash(title, artist); // Gunakan helper
    }
    @Override public String toString() { // Representasi string
        return title + " / " + artist + " (" + bpm + " bpm)"; // Format
    }
}
