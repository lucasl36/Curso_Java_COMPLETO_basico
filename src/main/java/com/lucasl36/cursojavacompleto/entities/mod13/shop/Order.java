package com.lucasl36.cursojavacompleto.entities.mod13.shop;

import com.lucasl36.cursojavacompleto.helpers.TimeHelper;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Lopes
 */
public class Order {

    private Integer id;
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items;

    public Order(Integer id, LocalDateTime moment, Client client) {
        this.id = id;
        this.moment = moment;
        this.status = OrderStatus.PENDING_PAYMENT;
        this.client = client;
        this.items = new ArrayList<>();
    }

    public Order(Integer id, LocalDateTime moment, OrderStatus status, Client client, List<OrderItem> items) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.client = client;
        this.items = items;
    }

    public String toString() {
        return "Order #" + id + " at " + TimeHelper.dtfBrazilianWithTime.format(moment) + " by " + client.getName() + " - " + status.toString();
    }
    
    public Integer getId() {
        return id;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public Client getClient() {
        return client;
    }
    
    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    
    public void addItem(OrderItem item) {
        this.items.add(item);
    }
    
    public void removeItem(OrderItem item) {
        this.items.remove(item);
    }
    
    public Double total() {
        Double total = 0.0;
        for(OrderItem item : items) {
            total += item.subTotal();
        }
        return total;
    }
    
}
