import Model.Entity.Contract;
import Model.Entity.Installment;
import Model.Service.ContractService;
import Model.Service.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");

        String stringDate = sc.nextLine();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(stringDate, fmt);

        System.out.print("Valor do contrato: ");
        double valueContract = sc.nextDouble();

        Contract contract = new Contract(date, number, valueContract);

        System.out.print("Entre com o numero de parcelas: ");
        int numberInstallments = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, numberInstallments);

        System.out.println("Parcelas: ");
        for (Installment item: contract.getInstallments()){
            System.out.println(item);
        }


        sc.close();

    }
}