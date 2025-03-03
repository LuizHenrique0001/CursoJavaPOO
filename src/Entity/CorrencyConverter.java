package Entity;

public class CorrencyConverter {

    public static final double IOF = 0.06;

    public static double calcConverter( double princeDollar, double dollarBought){

        double convert = princeDollar * dollarBought;

        return convert + (convert * IOF);
    }
}
