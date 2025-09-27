package headfirst.tests;
import java.io.*;
public class TestCh17 {
    public static void main(String[] args) throws Exception {
        // Kompilasi sudah dilakukan di workflow. Di sini, kita buat JAR dan jalankan via Process.
        Process p1 = new ProcessBuilder("jar", "cfe", "hello-test.jar",
                "headfirst.ch17.HelloJar", "-C", "out", "headfirst/ch17/HelloJar.class").inheritIO().start();
        int code1 = p1.waitFor();
        TestUtil.assertEquals(0, code1, "jar create exit code");

        Process p2 = new ProcessBuilder("java", "-jar", "hello-test.jar").redirectErrorStream(true).start();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(p2.getInputStream()))) {
            String line; boolean ok = false;
            while ((line = br.readLine()) != null) {
                if (line.contains("Hello from an executable JAR")) { ok = true; break; }
            }
            TestUtil.assertTrue(ok, "jar run output contains greeting");
        }
        int code2 = p2.waitFor();
        TestUtil.assertEquals(0, code2, "jar run exit code");
        System.out.println("Ch17 OK");
    }
}
