package Entity;

public class Student {

    private String name;
    private double not1;
    private double not2;
    private double not3;

    public Student(String name, double not1, double not2, double not3) {
        this.name = name;
        this.not1 = not1;
        this.not2 = not2;
        this.not3 = not3;
    }

    public double finalNota(){
        return (not1 + not2 + not3);
    }

    public String result (){

        if (finalNota()>=60.0){
            return finalNota()
                    +", PASS";
        }else {
            return "FAILED "
                    + "MISSING "
                    + String.format("%.2f%n", finalNota())
                    + "POINTS";
        }
    }
}
