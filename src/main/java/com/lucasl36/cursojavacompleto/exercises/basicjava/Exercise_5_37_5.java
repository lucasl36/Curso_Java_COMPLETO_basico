package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_5 extends BasicJavaExercise {

    List<menuItem> items; 
    
    public Exercise_5_37_5() {
        super("Exercise mod. 5 lesson 37 num. 5");
        initializeMenu();
    }
    
    @Override
    public void execute() {
        boolean repeat = true;
        int code = 0;
        int quantity = 0;
        do {
            System.out.println("Menu:");
            showMenuItems();
            System.out.print("Please enter the code and amount of desired items\n"
                    + "separated by space:");
            code = Main.sc.nextInt();
            quantity = Main.sc.nextInt();
            Main.sc.nextLine();
            if(code >= items.size() || code < 0) {
                System.out.println("Invalid Item! Try again...");
            } else if(quantity <= 0) {
                System.out.println("Invalid amount! Try again...");
            } else {
                System.out.printf("Order total: R$ %.2f\n", (quantity*items.get(code-1).value));
                repeat = false;
            }
        }while(repeat);
    }
    
    private class menuItem {
        public int code;
        public String product;
        public double value;
        
        menuItem(int code, String product, double value) {
            this.code = code;
            this.product = product;
            this.value = value;
        }
    }

    private void initializeMenu() {
        this.items = new ArrayList<menuItem>();
        this.items.add(new menuItem(1, "Hot dog", 4.0));
        this.items.add(new menuItem(2, "X-Salad", 4.5));
        this.items.add(new menuItem(3, "X-Bacon", 5.0));
        this.items.add(new menuItem(4, "Simple Toast", 2.0));
        this.items.add(new menuItem(5, "Soda", 1.5));
    }
    
    private void showMenuItems() {
        System.out.println("Code - Product, R$ Price");
        for(menuItem item : items) {
            System.out.printf("%d - %s, R$ %.2f\n", item.code, item.product, item.value);
        }
    }
    
}

