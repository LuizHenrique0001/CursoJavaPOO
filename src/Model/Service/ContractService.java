package Model.Service;

import Model.Entity.Contract;
import Model.Entity.Installment;
import Model.Interface.OnlinePaymentService;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months){

        Double valueMonthsBasic = contract.getTotalVelue() / months;
        LocalDate dateRefece;

        for (int i=1; i<=months;i++){

            dateRefece = contract.getDate().plusMonths(1);
            double interest = paymentService.interest(valueMonthsBasic, i);
            double fee = paymentService.paymentFee(valueMonthsBasic + interest);
            contract.getInstallments().add(new Installment(valueMonthsBasic + interest + fee, dateRefece));
        }
    }
}
