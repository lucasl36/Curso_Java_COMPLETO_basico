package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.entities.mod13.shop.*;
import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.services.ShopMockDataCreator;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_13_152_1 extends OOJavaExercise {

    private int DEFAULT_MOCK_DATA_LIST_SIZE = 10;
    private int DEFAULT_MOCK_ORDER_QTDY_PER_CLIENT = 5;
    private int DEFAULT_MOCK_ORDER_ITEMS_QTDY_PER_ORDER = 3;
    
    private List<Product> products;
    private List<Client>  clients;
    private List<Order> orders;
    
    public Exercise_13_152_1() {
        super("Exercise mod. 13 lesson 152 num. 1 - Hardware Shop");
        
        this.products = ShopMockDataCreator.createProducts(DEFAULT_MOCK_DATA_LIST_SIZE);
        this.clients = ShopMockDataCreator.createClients(DEFAULT_MOCK_DATA_LIST_SIZE);
        this.orders = new ArrayList<>();
        for(Client client : clients) {
            this.orders.addAll(ShopMockDataCreator.createOrders(DEFAULT_MOCK_ORDER_QTDY_PER_CLIENT, DEFAULT_MOCK_ORDER_ITEMS_QTDY_PER_ORDER, client, products));
        }
    }

    @Override
    public void execute() {
        printData();
    }
    
    private void printData() {
        System.out.println("HARDWARE SHOP DATA:");
        System.out.println("- Products");
        for(Product product : products) {
            System.out.println(product.toString());
        }
        System.out.println("- Clients");
        for(Client client : clients) {
            System.out.println(client.toString());
        }
        System.out.println("- Orders");
        for(Order order : orders) {
            System.out.println(order.toString());
        }
    }
    
}
