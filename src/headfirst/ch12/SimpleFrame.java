package headfirst.ch12;

// KELAS: SimpleFrame
// Tujuan: Membuat GUI Swing sederhana + animasi timer
import javax.swing.*;         // Komponen Swing
import java.awt.*;            // Grafik 2D
import java.awt.event.*;      // Event
public class SimpleFrame extends JPanel { // Turun dari JPanel untuk menggambar sendiri
    private int x = 10; // Posisi X lingkaran
    private int y = 10; // Posisi Y lingkaran
    private int dx = 2; // Kecepatan X
    private int dy = 2; // Kecepatan Y

    public SimpleFrame() { // Konstruktor
        // Timer untuk animasi (memanggil repaint berkala)
        Timer timer = new Timer(16, new ActionListener() { // ~60 FPS (1000ms/60 ≈ 16ms)
            @Override public void actionPerformed(ActionEvent e) {
                moveBall();   // Update posisi
                repaint();    // Gambar ulang
            }
        });
        timer.start(); // Mulai animasi
    }

    private void moveBall() { // Logika pergerakan & pantulan
        x += dx; y += dy; // Update posisi
        if (x < 0 || x + 30 > getWidth())  dx = -dx; // Pantul di batas kiri/kanan
        if (y < 0 || y + 30 > getHeight()) dy = -dy; // Pantul di batas atas/bawah
    }

    @Override protected void paintComponent(Graphics g) { // Gambar lingkaran
        super.paintComponent(g); // Bersihkan latar
        g.fillOval(x, y, 30, 30); // Gambar lingkaran diameter 30
    }

    public static void main(String[] args) { // Jalankan aplikasi
        JFrame frame = new JFrame("SimpleFrame Demo"); // Buat window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Keluar saat ditutup
        frame.setContentPane(new SimpleFrame()); // Pakai panel kita
        frame.setSize(400, 300); // Ukuran window
        frame.setLocationRelativeTo(null); // Pusatkan layar
        frame.setVisible(true); // Tampilkan
    }
}
