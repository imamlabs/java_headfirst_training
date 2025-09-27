package headfirst.ch18;

// KELAS: HelloServer
// Tujuan: Menjalankan server RMI & binding ke registry
import java.rmi.registry.LocateRegistry; // Utility untuk registri
import java.rmi.registry.Registry;       // Representasi registry
public class HelloServer {
    public static void main(String[] args) throws Exception {
        // Jalankan registry lokal di port default 1099 (jika belum jalan)
        try { LocateRegistry.createRegistry(1099); } catch (Exception ignore) {}
        // Buat instance servis
        HelloService service = new HelloServiceImpl();
        // Bind ke registry dengan nama "HelloService"
        Registry registry = LocateRegistry.getRegistry();
        registry.rebind("HelloService", service);
        System.out.println("RMI HelloService bound on registry.");
    }
}
