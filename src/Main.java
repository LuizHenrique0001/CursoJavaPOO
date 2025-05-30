import Entity.ImportedProduct;
import Entity.Product;
import Entity.UsedProduct;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Entre com o numero de produtos:");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++ ){

            System.out.println("Produto #"+i+":");

            System.out.print("Comum, Usado ou importado (c/i/u)? ");
            char typeProduct = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Preço: ");
            Double price = sc.nextDouble();
            if (typeProduct == 'i'){
                System.out.print("Custo Alfandega: ");
                products.add(new ImportedProduct(name, price, sc.nextDouble()));
            }else
            if (typeProduct == 'u'){
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                products.add(new UsedProduct( name, price,  new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine())));
            }else
            if(typeProduct == 'c'){
                products.add(new Product(name, price));
            }
        }

        System.out.println("TAG DE PREÇOS");
        for (Product item: products){

            System.out.println(item.priceTag());
        }

        sc.close();

    }
}