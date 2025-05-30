package Entity;

public abstract class Person {

    private String name;
    private Double annualIncome;

    public Person(Double annualIncome, String name) {
        this.annualIncome = annualIncome;
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Double tax();

}
