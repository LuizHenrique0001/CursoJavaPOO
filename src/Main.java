import Model.Entity.Account;
import Model.Exeptions.AccontExeption;
import org.w3c.dom.DOMException;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args){

        try{
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalace = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(initialBalace, holder, number, withdrawLimit);

            System.out.print("Enter amount for withdraw:");
            double amount = sc.nextDouble();

            account.withdraw(amount);

            System.out.printf("New balance: %.2f", account.getBalance());

            sc.close();
        }
        catch (AccontExeption e) {
            System.out.print(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.print(e.getMessage());
        }
    }
}