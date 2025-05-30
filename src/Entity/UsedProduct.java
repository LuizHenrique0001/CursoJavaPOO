package Entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    private static final SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getmanufactureDate() {
        return manufactureDate;
    }

    public void setmanufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return (getName() + " (used) $" + String.format("%.2f", getPrice()) + " (Manufacture date: " + fmt.format(manufactureDate) +")");
    }
}
