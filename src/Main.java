import Model.Entity.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        System.out.print("Enter salary: ");
        Double baseSalary = sc.nextDouble();


        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            List<Employee> employeeList = new ArrayList<>();
            while(line != null){

                String[] employees = line.split(",");
                employeeList.add(new Employee(employees[1], employees[0], Double.parseDouble(employees[2])));
                line = br.readLine();
            }

            List<Employee> newListToSalaryBase = employeeList.stream().filter(employee -> employee.getSalary() >= baseSalary).toList();

            Double sum = employeeList.stream().filter(employee -> employee.getEmail().charAt(0) == 'm').map(Employee::getSalary).reduce(0.0, Double::sum);

            for (Employee item: newListToSalaryBase){
                System.out.println(item);
            }
            System.out.print("Sum of salary of people whose email starts with 'M': "+ sum);

        } catch (Exception e) {
            System.out.print("Error: "+ e.getMessage());
        }

        sc.close();
    }
}