package RMIServer;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RemoteClass extends UnicastRemoteObject implements RemoteInterface{
    RemoteClass() throws RemoteException{
        super();
    }
    public boolean palindrome(String str) throws RemoteException{
        int s = 0;
        int e = str.length() - 1;
        while(s < e){
            if(str.charAt(s) != str.charAt(e))
                return false;
            s++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) throws RemoteException{
        try{
            Registry reg = LocateRegistry.createRegistry(5000);
            reg.bind("palindrome", new RemoteClass());
            System.out.println("Server started...");
        }
        catch (Exception e){
            System.out.println("Server Error...");
            e.printStackTrace();
        }
    }
}
