package org.example.Services;

import org.example.Interface.TaxService;

public class BrazilTaxService implements TaxService {

    public double Tax(double amount) {
            if(amount <= 100.00){
                return amount * 0.2;
            }
            else{
                return amount * 0.15;
            }

    }
}
