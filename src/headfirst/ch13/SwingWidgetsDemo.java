package headfirst.ch13;

// KELAS: SwingWidgetsDemo
// Tujuan: Menunjukkan layout & komponen (JCheckBox, JTextField, JList) + event handling
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingWidgetsDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Widgets Demo"); // Frame utama
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Keluar saat ditutup
        f.setLayout(new BorderLayout()); // Gunakan BorderLayout

        // ---- NORTH: Panel input + checkbox ----
        JPanel north = new JPanel(new FlowLayout()); // FlowLayout
        JTextField text = new JTextField(15); // Input teks 15 kolom
        JCheckBox check = new JCheckBox("Uppercase"); // Centang: ubah ke huruf besar
        north.add(new JLabel("Ketik:")); // Label
        north.add(text); // Field teks
        north.add(check); // Checkbox
        f.add(north, BorderLayout.NORTH); // Tempatkan di atas

        // ---- CENTER: JList dengan data ----
        DefaultListModel<String> model = new DefaultListModel<>(); // Model list
        model.addElement("alpha"); model.addElement("beta"); model.addElement("gamma"); // Isi awal
        JList<String> list = new JList<>(model); // List menggunakan model
        f.add(new JScrollPane(list), BorderLayout.CENTER); // Tambah scroll pane

        // ---- SOUTH: Tombol aksi ----
        JButton add = new JButton("Tambahkan ke List"); // Tombol untuk tambah item
        f.add(add, BorderLayout.SOUTH); // Tempatkan di bawah

        // Event: klik tombol -> ambil teks, transform sesuai checkbox, masukkan ke list
        add.addActionListener(new ActionListener() { // Listener anonim
            @Override public void actionPerformed(ActionEvent e) {
                String s = text.getText(); // Ambil teks dari field
                if (s == null || s.isBlank()) return; // Abaikan jika kosong
                if (check.isSelected()) s = s.toUpperCase(); // Ubah ke huruf besar jika dicentang
                model.addElement(s); // Tambahkan ke list
                text.setText(""); // Kosongkan field
                text.requestFocusInWindow(); // Fokus kembali
            }
        });

        f.setSize(420, 300); // Ukuran
        f.setLocationRelativeTo(null); // Pusatkan
        f.setVisible(true); // Tampilkan
    }
}
