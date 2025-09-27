package headfirst.tests;
import java.io.File;
import java.util.ArrayList;
public class TestCh14 {
    public static void main(String[] args) throws Exception {
        File f = new File("testcards.dat");
        ArrayList<headfirst.ch14.QuizCard> list = new ArrayList<>();
        list.add(new headfirst.ch14.QuizCard("Q1", "A1"));
        list.add(new headfirst.ch14.QuizCard("Q2", "A2"));
        headfirst.ch14.QuizCardIO.save(list, f);
        var loaded = headfirst.ch14.QuizCardIO.load(f);
        TestUtil.assertEquals(list.size(), loaded.size(), "QuizCard size equal");
        System.out.println("Ch14 OK");
    }
}
