import Entity.Employee;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered?:");
        int quantityEmployee = sc.nextInt();

        List<Employee> employeesList = new ArrayList<>();

        for (int i=1; i<=quantityEmployee; i++){

            System.out.println("Emplyoee #"+ i);
            System.out.print("Id: ");
            int idEmployee = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String nameEmployee = sc.nextLine();
            System.out.print("Salary: ");
            double salaryEmployee = sc.nextDouble();

            employeesList.add(new Employee(idEmployee, nameEmployee, salaryEmployee));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idEmployee = sc.nextInt();

        Employee research = employeesList.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);

        if (research != null) {

            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            research.increaseSalary(percentage);

        } else {

            System.out.println("This id not exist");
        }

        System.out.println("List of employees:");
        for(Employee x : employeesList){
            System.out.print(x);
        }

        sc.close();
    }
}