package Model.Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer number;
    private LocalDate date;
    private Double totalVelue;
    private List<Installment> Installments = new ArrayList<>();

    public Contract(LocalDate date, Integer number, Double totalVelue) {
        this.date = date;
        this.number = number;
        this.totalVelue = totalVelue;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Installment> getInstallments() {
        return Installments;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getTotalVelue() {
        return totalVelue;
    }

    public void setTotalVelue(Double totalVelue) {
        this.totalVelue = totalVelue;
    }
}
