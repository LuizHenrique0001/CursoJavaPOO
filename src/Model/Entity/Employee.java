package Model.Entity;

public class Employee {

    private String name;
    private String email;
    private Double salary;

    public Employee(String email, String name, Double salary) {
        this.email = email;
        this.name = name;
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getEmail();
    }
}
