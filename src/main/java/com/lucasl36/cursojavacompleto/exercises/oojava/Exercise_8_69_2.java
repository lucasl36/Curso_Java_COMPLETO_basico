package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.entities.Employee;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_8_69_2 extends OOJavaExercise {
    
    public Exercise_8_69_2() {
        super("Exercise mod. 8 lesson 69 num. 2");
    }

    @Override
    public void execute() {
        System.out.println("** Employee Register Application");
        System.out.println("Enter the following information...");
        System.out.print("Name: ");
        String name = Main.sc.nextLine();
        System.out.print("Gross salary: ");
        double grossSalary = Main.sc.nextDouble();
        Main.sc.nextLine();
        System.out.print("Tax: ");
        double tax = Main.sc.nextDouble();
        Main.sc.nextLine();
        Employee newEmployee = new Employee(name, grossSalary, tax);
        System.out.println("Employee: " + newEmployee.toString());
        System.out.print("Which percentage to increase salary? ");
        double percentage = Main.sc.nextDouble();
        Main.sc.nextLine();
        newEmployee.increaseSalary(percentage);
        System.out.println("Updated data: " + newEmployee.toString());
    }
    
}
