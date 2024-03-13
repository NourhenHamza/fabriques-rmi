import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BankAccountImpl extends UnicastRemoteObject implements BankAccount {
    private double balance;

    protected BankAccountImpl() throws RemoteException {
        super();
    }

    @Override
    public void deposit(double amount) throws RemoteException {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws RemoteException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new RemoteException("Insufficient funds");
        }
    }

    @Override
    public double getBalance() throws RemoteException {
        return balance;
    }
}
