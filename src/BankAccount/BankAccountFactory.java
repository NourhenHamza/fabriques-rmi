import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BankAccountFactory extends Remote {
    BankAccount createAccount() throws RemoteException;
}
