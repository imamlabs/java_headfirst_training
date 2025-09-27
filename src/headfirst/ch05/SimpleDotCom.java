package headfirst.ch05;

// KELAS: SimpleDotCom
// Tujuan: Mewakili 'kapal' sederhana yang harus 'ditembak' oleh pemain
public class SimpleDotCom { // Mendefinisikan kelas SimpleDotCom
    private int[] locationCells; // Posisi kapal pada papan (indeks grid)
    private int numOfHits = 0; // Jumlah tembakan tepat yang diterima

    public void setLocationCells(int[] locs) { // Setter posisi kapal
        locationCells = locs; // Simpan posisi ke field
    } // Akhir setter

    public String checkYourself(String stringGuess) { // Mengecek tebakan pengguna
        int guess; // Variabel untuk menyimpan tebakan sebagai integer
        try { // Blok try untuk konversi string ke integer
            guess = Integer.parseInt(stringGuess); // Konversi input ke int
        } catch (NumberFormatException e) { // Jika bukan angka
            return "invalid"; // Kembalikan status tidak valid
        }

        String result = "miss"; // Asumsikan meleset
        for (int cell : locationCells) { // Loop setiap posisi kapal
            if (guess == cell) { // Jika tebakan sama dengan salah satu posisi
                result = "hit"; // Tandai kena
                numOfHits++; // Tambah hit
                break; // Hentikan loop karena sudah kena
            }
        }

        if (numOfHits == locationCells.length) { // Jika semua posisi sudah kena
            result = "kill"; // Kapal tenggelam
        }

        System.out.println(result); // Tampilkan hasil
        return result; // Kembalikan hasil
    } // Akhir checkYourself
} // Akhir kelas
