package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.entities.mod14.*;
import com.lucasl36.cursojavacompleto.helpers.TimeHelper;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_14_136_1 extends OOJavaExercise {

    
    private List<Product> products;
    
    public Exercise_14_136_1() {
        super("Exercise mod. 14 lesson 136 num. 1 - Varieties Store");
        products = new ArrayList<>();
    }

    @Override
    public void execute() {
        int productsQty;
        System.out.print("Enter the number of products: ");
        productsQty = Main.sc.nextInt();
        for(int i = 1; i <= productsQty; i++) {
            Product newProduct;
            System.out.printf("Product #%d data: %n", i);
            System.out.print("Common, useed or import (c/u/i)?");
            
            String productType = Main.sc.next();
            Main.sc.nextLine();
            
            newProduct = buildProduct(ProductTypeEnum.findByCode(productType));
            products.add(newProduct);
        }
        System.out.println();
        for(Product p : products) {
            System.out.println(p.priceTag());
        }
    }

    private Product buildProduct(ProductTypeEnum productType) {
        String name;
        Double price;
        
        System.out.print("Name: ");
        name = Main.sc.next();
        Main.sc.nextLine();
        
        System.out.print("Price: ");
        price = Main.sc.nextDouble();
        switch(productType) {
            case USED: {
                System.out.print("Manufactured date (DD/MM/YYYY): ");
                String manufacturedDateStr = Main.sc.next();
                Main.sc.nextLine();
                LocalDate manufacturedDate = TimeHelper.convertStringToLocalDate(manufacturedDateStr);
                return new UsedProduct(manufacturedDate, name, price);
            }
            case IMPORTED: {
                System.out.print("Customs fee: ");
                Double customsFee = Main.sc.nextDouble();
                return new ImportedProduct(customsFee, name, price);
            }
            default: {
                return new Product(name, price);
            }
        }
    }
    
}
