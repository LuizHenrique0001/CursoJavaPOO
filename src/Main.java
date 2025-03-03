import Entity.Employee;
import Entity.Rectangle;
import Entity.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha qual atividade gostaria de testar(1, 2, 3):");
        int escolha = sc.nextInt();

        if(escolha == 1){
            System.out.println("Enter rectangle width and height:");
            double width = sc.nextDouble();
            double height = sc.nextDouble();

            Rectangle rec = new Rectangle(width, height);

            System.out.println(rec);
        }

        if(escolha == 2){
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Gross Salary:");
            double grossSalary = sc.nextDouble();
            System.out.print("Tax:");
            double tax = sc.nextDouble();

            Employee empl = new Employee(name, grossSalary, tax);

            System.out.println("Employee: " + empl);

            System.out.println("Which percentage to increase salary?");
            double percentage = sc.nextDouble();
            empl.increaseSalary(percentage);

            System.out.println();
            System.out.println("Updated data: " + empl);
        }

        if (escolha == 3){
            String name = sc.nextLine();
            double not1 = sc.nextDouble();
            double not2 = sc.nextDouble();
            double not3 = sc.nextDouble();

            Student student = new Student(name, not1, not2, not3);

            System.out.print("FINAL GRADE = " + student.result());
        }

        if (escolha != 1 || escolha != 2 || escolha != 3){
            System.out.println("VALOR INVALIDO");
        }


        sc.close();
    }
}