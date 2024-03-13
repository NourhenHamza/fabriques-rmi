import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloFactoryImpl extends UnicastRemoteObject implements HelloFactory {
    protected HelloFactoryImpl() throws RemoteException {
        super();
    }

    @Override
    public Hello createHello() throws RemoteException {
        return new HelloImpl();
    }
}
