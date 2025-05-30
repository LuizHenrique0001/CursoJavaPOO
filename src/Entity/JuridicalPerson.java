package Entity;

public class JuridicalPerson extends Person{

    private Integer quantityEmployee;

    public JuridicalPerson(Double annualIncome, String name, Integer quantityEmployee) {
        super(annualIncome, name);
        this.quantityEmployee = quantityEmployee;
    }

    public Integer getQuantityEmployee() {
        return quantityEmployee;
    }

    public void setQuantityEmployee(Integer quantityEmployee) {
        this.quantityEmployee = quantityEmployee;
    }

    @Override
    public Double tax() {
        Double tax;
        if(quantityEmployee > 10){
          tax = getAnnualIncome() * 0.14;
        }else {
            tax = getAnnualIncome() *0.16;
        }
        return tax;
    }


}
