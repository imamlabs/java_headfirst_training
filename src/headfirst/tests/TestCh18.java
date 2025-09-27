package headfirst.tests;

public class TestCh18 {
    public static void main(String[] args) throws Exception {
        // Jalankan server RMI pada thread terpisah (daemon)
        Thread t = new Thread(() -> {
            try {
                headfirst.ch18.HelloServer.main(new String[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        t.setDaemon(true);
        t.start();

        // Tunggu registry & server bind
        Thread.sleep(500);

        // Jalankan client
        headfirst.ch18.HelloClient.main(new String[0]);
        System.out.println("Ch18 OK");

        // >>> Penting: paksa proses selesai supaya thread RMI/registry tidak menggantung
        System.exit(0);
    }
}
