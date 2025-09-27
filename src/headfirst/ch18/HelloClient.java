package headfirst.ch18;

// KELAS: HelloClient
// Tujuan: Klien yang lookup layanan RMI & memanggil method remote
import java.rmi.registry.LocateRegistry; // Utility untuk menemukan registry
import java.rmi.registry.Registry;       // Registry RMI

public class HelloClient {
    public static void main(String[] args) throws Exception {
        String host = "127.0.0.1"; // Alamat host registry
        Registry registry = LocateRegistry.getRegistry(host); // Dapatkan registry pada host
        HelloService svc = (HelloService) registry.lookup("HelloService"); // Lookup by name
        String result = svc.sayHello("Imam"); // Panggil method remote
        System.out.println("Server replied: " + result); // Tampilkan hasil
    }
}
