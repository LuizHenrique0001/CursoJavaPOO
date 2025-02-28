import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha qual atividade gostaria de testar(1, 2, 3, 4, 5):");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.println("Soma");

            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            int result = v1 + v2;

            System.out.println("Soma = " + result + "%n");
        }
        if (escolha == 2) {
            double v3 = sc.nextDouble();

            double result2 = 3.14159 * Math.pow(v3, 2);

            System.out.printf("A = %.4f%n", result2);
        }
        if (escolha == 3) {
            int v4 = sc.nextInt();
            int v5 = sc.nextInt();
            int v6 = sc.nextInt();
            int v7 = sc.nextInt();

            int result3 = (v4 * v5 - v6 * v7);

            System.out.println("Diferenca = " + result3 + "%n");
        }
        if (escolha == 4) {
            int numEmployee = sc.nextInt();
            int numHour = sc.nextInt();
            double velueHour = sc.nextDouble();

            double valueSalary = numHour * velueHour;

            System.out.println("NUMBER = " + numEmployee);
            System.out.printf("SALARY = U$ %.2f%n", valueSalary);
        }
        if (escolha == 5) {
            int cod1 = sc.nextInt();
            int qant1 = sc.nextInt();
            double velueCod1 = sc.nextDouble();

            int cod2 = sc.nextInt();
            int qant2 = sc.nextInt();
            double velueCod2 = sc.nextDouble();

            double velueTotal = qant1 * velueCod1 + qant2 * velueCod2;

            System.out.printf("VALOR A PAGAR: R$ %.2f%n", velueTotal);
        }

        sc.close();
    }
}