import Entity.Individual;
import Entity.JuridicalPerson;
import Entity.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        System.out.print("Entre com o numero de pessoas taxadas: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++ ){

            System.out.println("Pessoa taxada #"+i+": ");
            System.out.print("Pessoa Normal ou Juridica (n/j)? ");
            char typePerson = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Renda anual: ");
            Double annualIncome = sc.nextDouble();

            if(typePerson =='n'){

                System.out.print("Gastos com saude: ");
                personList.add(new Individual(annualIncome, name, sc.nextDouble()));
            }else {

                System.out.print("Numero de funcionarios: ");
                personList.add(new JuridicalPerson(annualIncome, name, sc.nextInt()));
            }
        }

        System.out.println("Total de cada pessoa taxada:");

        Double totalTax = 0.0;
        for (Person item: personList){
            totalTax += item.tax();
            System.out.println(item.getName() +": $ "+item.tax());
        }
        System.out.println();
        System.out.printf("Valor total de taxas: %.2f", totalTax);



        sc.close();

    }
}