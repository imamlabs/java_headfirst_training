package headfirst.tests;

// UTILITAS: TestUtil
// Tujuan: Membuat assert sederhana tanpa lib eksternal
public class TestUtil {
    public static void assertTrue(boolean cond, String msg) {
        if (!cond) throw new RuntimeException("ASSERT FAILED: " + msg);
    }
    public static void assertEquals(Object expected, Object actual, String msg) {
        if (expected == null ? actual != null : !expected.equals(actual)) {
            throw new RuntimeException("ASSERT FAILED: " + msg + " | expected=" + expected + ", actual=" + actual);
        }
    }
}
