import Entity.Client;
import Entity.Order;
import Entity.OrderItem;
import Entity.Product;
import Entity.enuns.OrderStatus;

import java.security.interfaces.DSAPublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name:");
        String clientName = sc.nextLine();
        System.out.print("Email:");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY):");
        String clientBirthDateString = sc.nextLine();
        Date clientBirthDate = new SimpleDateFormat("dd/MM/yyyy").parse(clientBirthDateString);

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println("Enter order data:");
        System.out.print("Status (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED):");
        String status = sc.nextLine();

        Order order = new Order(Instant.now(), OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order?");
        int quantityIdems = sc.nextInt();

        for(int i=1; i<=quantityIdems;i++){

            System.out.println("Enter #"+i+" item data:");
            System.out.print("Product name:");
            String productName = sc.nextLine();
            sc.nextLine();
            System.out.print("Product price:");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity:");
            int quantity = sc.nextInt();

            order.addItem(new OrderItem(quantity, productPrice, new Product(productName, productPrice)));

        }
        System.out.println(order);


        sc.close();

    }
}