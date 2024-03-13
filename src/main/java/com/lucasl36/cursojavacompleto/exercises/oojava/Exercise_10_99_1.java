package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.entities.mod10.Employee;
import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_10_99_1 extends OOJavaExercise {
      
    List<Employee> employees;
    
    public Exercise_10_99_1() {
        super("Exercise mod. 10 lesson 99 num. 1");
        this.employees = new ArrayList<>();
    }
    
    @Override
    public void execute() {
        System.out.println("How many employees will be registered?");
        int employeesQuantity = Main.sc.nextInt();
        Main.sc.nextLine();
        int index = 1;
        do {
            System.out.printf("Employee #%d\n", index);
            System.out.print("Enter ID: ");
            final Integer id = Main.sc.nextInt();
            Main.sc.nextLine();
            System.out.print("Enter Name: ");
            String name = Main.sc.nextLine();
            System.out.print("Enter Salary: ");
            Double salary = Main.sc.nextDouble();
            Main.sc.nextLine();
            if(employees.stream().anyMatch(e -> e.getId().equals(id))) {
                System.out.println("ID duplicado não permitido! Tente novamente...");
            } else {
                this.employees.add(new Employee(id, name, salary));
                index++;
            }
        }while(index <= employeesQuantity);
            
        System.out.print("Enter the ID of the employee that will receive a salary raise: "); 
        final Integer idRaise = Main.sc.nextInt();
        Main.sc.nextLine();
            
        Employee employeeToReceiveRaise = employees.stream().filter(e -> e.getId().equals(idRaise)).findFirst().orElse(null);
            
        if(employeeToReceiveRaise == null) {
            System.out.println("There is no such ID!");
        } else {
            System.out.print("Enter the percentage of the raise: ");
            Double raisePercentage = Main.sc.nextDouble();
            Main.sc.nextLine();
            employeeToReceiveRaise.increaseSalary(raisePercentage);
        }
            
        System.out.println("Employees List: ");
        for(Employee e : employees) {
            System.out.println(e.toString());
        }
    }
}
