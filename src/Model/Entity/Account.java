package Model.Entity;

import Model.Exeptions.AccontExeption;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Double balance, String holder, Integer number, Double withdrawLimit) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount){

        if(amount>getWithdrawLimit()){
            throw new AccontExeption("The amount exceeds withdraw limit");
        }
        if(amount> getBalance()){
            throw new AccontExeption("Not enough balance");
        }

        this.balance -= amount;

    }
}
