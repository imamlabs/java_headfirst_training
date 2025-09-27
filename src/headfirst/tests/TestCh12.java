package headfirst.tests;
public class TestCh12 {
    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "true"); // Jalankan dalam mode headless
        // Kita tidak memanggil setVisible(true); hanya instantiate untuk memastikan tak error
        new headfirst.ch12.SimpleFrame();
        System.out.println("Ch12 OK");
    }
}
