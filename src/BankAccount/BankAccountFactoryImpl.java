import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BankAccountFactoryImpl extends UnicastRemoteObject implements BankAccountFactory {
    protected BankAccountFactoryImpl() throws RemoteException {
        super();
    }

    @Override
    public BankAccount createAccount() throws RemoteException {
        return new BankAccountImpl();
    }
}
