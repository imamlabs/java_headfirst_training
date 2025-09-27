    package headfirst.ch02;

    // KELAS: GuessGame
    // Tujuan: Menjalankan permainan tebak angka dengan 3 pemain
    public class GuessGame { // Mendefinisikan kelas GuessGame
        Player p1; // Referensi ke pemain 1
        Player p2; // Referensi ke pemain 2
        Player p3; // Referensi ke pemain 3

        public void startGame() { // Method untuk memulai permainan
            p1 = new Player(); // Membuat objek pemain 1
            p2 = new Player(); // Membuat objek pemain 2
            p3 = new Player(); // Membuat objek pemain 3

            int targetNumber = (int) (Math.random() * 10); // Angka target 0..9
            System.out.println("I'm thinking of a number between 0 and 9..."); // Info ke konsol
            System.out.println("The number to guess is " + targetNumber); // (Dalam buku angka ini tidak selalu dicetak; di sini dicetak agar mudah belajar)

            boolean p1isRight = false; // Status benar/tidak pemain 1
            boolean p2isRight = false; // Status benar/tidak pemain 2
            boolean p3isRight = false; // Status benar/tidak pemain 3

            // Loop sampai ada yang menebak benar
            while (true) { // Loop tak hingga, akan break jika ada pemenang
                System.out.println("Players, make your guess!"); // Meminta tebakan
                p1.guess(); // Pemain 1 menebak
                p2.guess(); // Pemain 2 menebak
                p3.guess(); // Pemain 3 menebak

                int guessp1 = p1.number; // Ambil tebakan p1
                int guessp2 = p2.number; // Ambil tebakan p2
                int guessp3 = p3.number; // Ambil tebakan p3

                // Bandingkan masing-masing tebakan dengan target
                if (guessp1 == targetNumber) { // Jika tebakan p1 benar
                    p1isRight = true; // Tandai benar
                }
                if (guessp2 == targetNumber) { // Jika tebakan p2 benar
                    p2isRight = true; // Tandai benar
                }
                if (guessp3 == targetNumber) { // Jika tebakan p3 benar
                    p3isRight = true; // Tandai benar
                }

                // Jika ada yang benar, umumkan dan akhiri permainan
                if (p1isRight || p2isRight || p3isRight) { // Jika salah satu benar
                    System.out.println("We have a winner!"); // Umumkan pemenang
                    System.out.println("Player one got it right? " + p1isRight); // Status p1
                    System.out.println("Player two got it right? " + p2isRight); // Status p2
                    System.out.println("Player three got it right? " + p3isRight); // Status p3
                    System.out.println("Game over."); // Akhiri
                    break; // Keluar dari loop while(true)
                } else {
                    // Jika belum ada yang benar, lanjutkan loop
                    System.out.println("Players will have to try again.
"); // Info ulang
                }
            } // Akhir while
        } // Akhir startGame
    } // Akhir kelas
