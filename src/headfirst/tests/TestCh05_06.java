package headfirst.tests;
public class TestCh05_06 {
    public static void main(String[] args) {
        // Test SimpleDotCom logic langsung tanpa input interaktif
        headfirst.ch05.SimpleDotCom dot = new headfirst.ch05.SimpleDotCom();
        dot.setLocationCells(new int[]{2,3,4});
        String r1 = dot.checkYourself("2");
        String r2 = dot.checkYourself("3");
        String r3 = dot.checkYourself("4");
        TestUtil.assertEquals("hit", r1, "hit #1");
        TestUtil.assertEquals("hit", r2, "hit #2");
        TestUtil.assertEquals("kill", r3, "kill #3");

        // Test ArrayListDog (Bab 6)
        headfirst.ch06.ArrayListDog.main(new String[0]);
        System.out.println("Ch05_06 OK");
    }
}
