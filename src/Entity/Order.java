package Entity;

import Entity.enuns.OrderStatus;

import java.text.DateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Instant moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> listOrderItem = new ArrayList<OrderItem>();

    public Order(Instant moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public String getMoment() {
        return this.moment.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getListOrderItem() {
        return listOrderItem;
    }

    public void addItem(OrderItem item) {
        listOrderItem.add(item);
    }

    public void removeItem(OrderItem item){
        listOrderItem.remove(item);
    }

    public Double total(){

        Double total = 0.0;
        for (OrderItem item: listOrderItem){

            total+= item.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(getMoment()+"\n");
        sb.append("Order status: ");
        sb.append(getStatus()+"\n");
        sb.append("Client: ");
        sb.append(getClient()+"\n");
        sb.append("Order items:\n");

        for (OrderItem item: getListOrderItem()){
            sb.append(item+"\n");
        }
        sb.append("Total price: $"+total());
        return sb.toString();
    }
}
