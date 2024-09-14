package org.example.Services;

import org.example.Interface.TaxService;
import org.example.entities.CarRental;
import org.example.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double princePerHour;
    private Double princePerDay;

    private TaxService taxService;

    public RentalService(Double princePerHour, Double princePerDay, TaxService taxService) {
        this.princePerHour = princePerHour;
        this.princePerDay = princePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;
        if (hours <= 12.0 ){
            basicPayment = princePerHour * Math.ceil(hours);
        }else{
            basicPayment = princePerDay * Math.ceil(hours/24.0);
        }

        double tax = taxService.Tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

}
