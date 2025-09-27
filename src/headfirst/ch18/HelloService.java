package headfirst.ch18;

// INTERFACE REMOTE: HelloService
// Tujuan: Contoh antarmuka RMI sederhana
import java.rmi.Remote;           // Semua remote interface extend Remote
import java.rmi.RemoteException;  // Setiap method remote melempar RemoteException

public interface HelloService extends Remote { // Deklarasi remote interface
    String sayHello(String name) throws RemoteException; // Method jarak jauh
}
