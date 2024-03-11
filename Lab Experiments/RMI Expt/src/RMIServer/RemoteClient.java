package RMIServer;

import java.rmi.Naming;
import java.sql.SQLOutput;
import java.util.Scanner;

public class RemoteClient {
    public static void main(String[] args) {
        try{
            String path = "rmi://localhost:5000/palindrome";
            RemoteInterface obj = (RemoteInterface) Naming.lookup(path);
            do{
                System.out.print("Enter a string here to check if it is Palindrome or not: ");
                String str = getString();
                boolean res = obj.palindrome(str);
                if(res)
                    System.out.println("String is Palindrome");
                else
                    System.out.println("String in not Palindrome");
                System.out.println("Do you want to continue (y / n): ");
                String choice = getString();
                if(choice.equals("n"))
                    break;
            }while(true);
        }
        catch (Exception e){
            System.out.println("Server not Connected!");
            e.printStackTrace();
        }
    }
    private static String getString(){
        Scanner sin = new Scanner(System.in);
        try{
            String str = sin.next();
            return str;
        }
        catch (Exception e) {
            throw e;
        }
    }
}
