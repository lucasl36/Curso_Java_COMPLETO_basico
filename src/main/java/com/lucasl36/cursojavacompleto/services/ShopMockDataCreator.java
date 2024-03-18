package com.lucasl36.cursojavacompleto.services;

import com.lucasl36.cursojavacompleto.entities.mod13.shop.Client;
import com.lucasl36.cursojavacompleto.entities.mod13.shop.Order;
import com.lucasl36.cursojavacompleto.entities.mod13.shop.OrderItem;
import com.lucasl36.cursojavacompleto.entities.mod13.shop.OrderStatus;
import com.lucasl36.cursojavacompleto.entities.mod13.shop.Product;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Map.entry("Screwdriver", 89.99),
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
        return null;
    }
    
    private static Integer getRandomOrderId() {
        return null;
    }
    
    private static LocalDateTime getRandomOrderTime() {
        return null;
    }
    
    private static OrderStatus getRandomStatus() {
        return null;
    }
    
    public static List<Client> createClients(int qtdy) {
        return null;
    }
    
    public static List<Product> createProducts(int qtdy) {
        return null;
    }
    
    public static List<Order> createOrders(int qtdy, Client client) {
        return null;
    }
    
    public static List<OrderItem> createOrderItems(int qtdy, List<Product> products) {
        return null;
    }
    
}
