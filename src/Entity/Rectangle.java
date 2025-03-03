package Entity;

public class Rectangle {

    private double width;
    private double heigth;

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double area (){
        return width*heigth;
    }

    public double perimeter(){
        return 2*(width+heigth);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(width, 2)+ Math.pow(heigth, 2));
    }

    @Override
    public String toString() {
        return "AREA = "
                + String.format("%.2f%n", area())
                + "PERIMETER = "
                + String.format("%.2f%n", perimeter())
                + "DIAGONAL = "
                + String.format("%.2f%n", diagonal());
    }
}
