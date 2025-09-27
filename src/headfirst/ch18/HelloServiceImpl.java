package headfirst.ch18;

// IMPLEMENTASI REMOTE: HelloServiceImpl
// Tujuan: Implementasi konkret dari HelloService
import java.rmi.server.UnicastRemoteObject; // Untuk export objek sebagai remote
import java.rmi.RemoteException;            // Exception komunikasi RMI

public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {
    protected HelloServiceImpl() throws RemoteException { super(); } // Konstruktor wajib
    @Override public String sayHello(String name) throws RemoteException { // Implementasi
        return "Hello, " + name + "! (from RMI server)"; // Kembalikan sapaan
    }
}
