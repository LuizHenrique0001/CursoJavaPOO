import Entity.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number:");
        int numberAccount = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder:");
        String holderAccount = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n):");
        char deposit = sc.nextLine().charAt(0);
        double valueInitialAccount = 0;
        if (deposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            valueInitialAccount = sc.nextDouble();
        }

        Account account = new Account(numberAccount, holderAccount, valueInitialAccount);
        System.out.println("Account data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double outerDepisit = sc.nextDouble();

        account.depositValueAccount(outerDepisit);

        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();

        account.withdrawValueAccount(withdraw);
        System.out.println("Updated account data:");
        System.out.println(account);


        sc.close();
    }
}