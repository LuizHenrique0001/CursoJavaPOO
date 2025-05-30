package Entity;

public class Individual extends Person{

    private Double healthcareExpenses;

    public Individual(Double annualIncome, String name, Double healthcareExpenses) {
        super(annualIncome, name);
        this.healthcareExpenses = healthcareExpenses;
    }

    public Double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(Double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }

    @Override
    public Double tax() {

        Double tax;

        if(getAnnualIncome() >=20000){

            if (healthcareExpenses !=null){
                tax = getAnnualIncome() * 0.25 - healthcareExpenses * 0.5;
            }else{
                tax = getAnnualIncome() * 0.25;
            }
        }else{

            if (healthcareExpenses !=null){
                tax = getAnnualIncome() * 0.15 - healthcareExpenses * 0.5;
            }else{
                tax = getAnnualIncome() * 0.15;
            }
        }
        return tax;
    }


}
