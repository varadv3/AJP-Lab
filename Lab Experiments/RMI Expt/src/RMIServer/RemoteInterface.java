package RMIServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface RemoteInterface extends Remote{
    public boolean palindrome(String str) throws RemoteException;
}