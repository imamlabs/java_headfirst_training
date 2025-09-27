package headfirst.tests;
// Uji Bab 2: Menguji Player.guess dalam rentang 0..9 beberapa kali
public class TestCh02 {
    public static void main(String[] args) {
        headfirst.ch02.Player p = new headfirst.ch02.Player();
        for (int i = 0; i < 100; i++) {
            p.guess();
            TestUtil.assertTrue(p.number >= 0 && p.number <= 9, "Player guess out of range");
        }
        System.out.println("Ch02 OK");
    }
}
