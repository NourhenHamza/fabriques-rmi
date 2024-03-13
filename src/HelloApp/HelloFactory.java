import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloFactory extends Remote {
    Hello createHello() throws RemoteException;
}
