package com.lucasl36.cursojavacompleto.services;

import com.lucasl36.cursojavacompleto.entities.mod13.shop.Client;
import com.lucasl36.cursojavacompleto.entities.mod13.shop.Order;
import com.lucasl36.cursojavacompleto.entities.mod13.shop.OrderItem;
import com.lucasl36.cursojavacompleto.entities.mod13.shop.OrderStatus;
import com.lucasl36.cursojavacompleto.entities.mod13.shop.Product;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Lucas Lopes
 */
public class ShopMockDataCreator {
    
    private static Map<String, String> mockClientNamesAndEmails = Map.ofEntries(
        Map.entry("John Silva", "john.silva@example.com"),
        Map.entry("Mary Oliveira", "mary.oliveira@example.com"),
        Map.entry("Peter Santos", "peter.santos@example.com"),
        Map.entry("Anne Souza", "anne.souza@example.com"),
        Map.entry("Charles Pereira", "charles.pereira@example.com"),
        Map.entry("Juliana Fernandes", "juliana.fernandes@example.com"),
        Map.entry("Raphael Costa", "raphael.costa@example.com"),
        Map.entry("Luana Martins", "luana.martins@example.com"),
        Map.entry("Daniel Almeida", "daniel.almeida@example.com"),
        Map.entry("Fernanda Lima", "fernanda.lima@example.com"),
        Map.entry("Bruno Vieira", "bruno.vieira@example.com"),
        Map.entry("Camila Rocha", "camila.rocha@example.com"),
        Map.entry("Lucas Oliveira", "lucas.oliveira@example.com"),
        Map.entry("Amanda Santos", "amanda.santos@example.com"),
        Map.entry("Richard Silva", "richard.silva@example.com"),
        Map.entry("Patricia Goncalves", "patricia.goncalves@example.com"),
        Map.entry("Gustavo Pereira", "gustavo.pereira@example.com"),
        Map.entry("Leticia Lima", "leticia.lima@example.com"),
        Map.entry("Marcelo Alves", "marcelo.alves@example.com"),
        Map.entry("Camila Costa", "camila.costa@example.com")
    );
    
    private static Map<String, Double> mockProductNamesAndPrices = Map.ofEntries(
        Map.entry("Hammer", 39.99),
        Map.entry("Drill", 149.99),
        Map.entry("Wood drill bit", 4.99),
        Map.entry("Screwdriver", 9.99),
        Map.entry("Wrench", 14.99),
        Map.entry("Circular saw", 129.99),
        Map.entry("Sledgehammer", 49.99),
        Map.entry("Tape measure", 19.99),
        Map.entry("Concrete drill bit", 7.99),
        Map.entry("Metal drill bit", 5.99),
        Map.entry("Saw", 24.99),
        Map.entry("Laser level", 59.99),
        Map.entry("Universal pliers", 12.99),
        Map.entry("Needle-nose pliers", 8.99),
        Map.entry("Aluminum ladder", 79.99),
        Map.entry("Angle grinder", 99.99),
        Map.entry("Wood sandpaper (kit)", 6.99),
        Map.entry("Safety gloves", 4.99),
        Map.entry("Safety glasses", 7.99),
        Map.entry("Respirator mask", 9.99)
    );
    
    private static LocalDate getRandomBirth() {
        Random r = new Random();
        Integer year = (r.nextInt(125)+1900);
        Integer month = (r.nextInt(12)+1);
        LocalDate birthDate = LocalDate.of(year, month, 1);
        Integer day = (r.nextInt(birthDate.lengthOfMonth())+1);
        return birthDate.withDayOfMonth(day);
    }
    
    private static Integer getRandomOrderId() {
        return new Random().nextInt(1001);
    }
    
    private static LocalDateTime getRandomOrderTime() {
        Random r = new Random();
        
        Integer year = (r.nextInt(25)+2000);
        Integer month = (r.nextInt(12)+1);
        LocalDate orderDate = LocalDate.of(year, month, 1);
        Integer day = (r.nextInt(orderDate.lengthOfMonth())+1);
        
        Integer hour = (r.nextInt(23)+1);
        Integer min = (r.nextInt(59)+1);
        Integer sec = (r.nextInt(59)+1);
        LocalTime orderTime = LocalTime.of(hour, min, sec);
        
        LocalDateTime orderDatetime = LocalDateTime.of(orderDate.withDayOfMonth(day), orderTime);
        
        return orderDatetime;
    }
    
    private static OrderStatus getRandomStatus() {
        Integer statusCode = new Random().nextInt(OrderStatus.values().length);
        return OrderStatus.toEnum(statusCode);
    }
    
    public static List<Client> createClients(int qtdy) {
        List<Client> clients = new ArrayList<>();
        
        Random r = new Random();
        Object[] mockClientsKeysObjArr = mockClientNamesAndEmails.keySet().toArray();        
        String[] mockClientsKeys = Arrays.copyOf(mockClientsKeysObjArr, mockClientsKeysObjArr.length, String[].class);
        
        int recursion = 0;
        do {
            int index = r.nextInt(mockClientsKeys.length);
            String name = mockClientsKeys[index];
            String email = mockClientNamesAndEmails.get(mockClientsKeys[index]);
            LocalDate birth = getRandomBirth();
            clients.add(new Client(name, email, birth));
            recursion++;
        }while(recursion <= qtdy);
        
        return clients;
    }
    
    public static List<Product> createProducts(int qtdy) {
        List<Product> products = new ArrayList<>();
        
        Random r = new Random();
        Object[] mockProductsKeysObjArr = mockProductNamesAndPrices.keySet().toArray();  
        String[] mockProductsKeys = Arrays.copyOf(mockProductsKeysObjArr, mockProductsKeysObjArr.length, String[].class);
        
        int recursion = 0;
        do {
            int index = r.nextInt(mockProductsKeys.length);
            String name = mockProductsKeys[index];
            Double price = mockProductNamesAndPrices.get(mockProductsKeys[index]);
            LocalDate birth = getRandomBirth();
            products.add(new Product(name, price));
            recursion++;
        }while(recursion <= qtdy);
        
        return products;
    }
    
    public static List<Order> createOrders(int qtdy, int orderItemsQtdy, Client client, List<Product> products) {
        List<Order> orders = new ArrayList<>();
        
        int recursion = 0;
        do {
            int orderId = getRandomOrderId();            
            orders.add(new Order(orderId, getRandomOrderTime(), getRandomStatus(), client, createOrderItems(orderItemsQtdy, orderId, products)));
            recursion++;
        }while(recursion <= qtdy);
        
        return orders;
    }
    
    private static List<OrderItem> createOrderItems(int qtdy, int orderId, List<Product> products) {
        List<OrderItem> orderItems = new ArrayList<>();
        
        Random r = new Random();
        int recursion = 0;
        do {
            Product randomProduct = products.get(r.nextInt(products.size()));
            orderItems.add(new OrderItem(qtdy, randomProduct.getPrice(), orderId, randomProduct));
            recursion++;
        }while(recursion <= qtdy);
        
        return orderItems;
    }
    
}
