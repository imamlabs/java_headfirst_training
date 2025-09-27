package headfirst.ch02;

// KELAS: GameLauncher
// Tujuan: Menyediakan main() untuk menjalankan GuessGame
public class GameLauncher { // Mendefinisikan kelas GameLauncher
    public static void main(String[] args) { // Titik masuk program
        GuessGame game = new GuessGame(); // Membuat objek permainan
        game.startGame(); // Memulai permainan
    } // Akhir main
} // Akhir kelas
