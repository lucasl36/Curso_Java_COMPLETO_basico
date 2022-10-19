package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_4_31_4 extends BasicJavaExercise {

    public Exercise_4_31_4() {
        super("Exercise mod. 4 lesson 31 num. 4");
    }
    
    @Override
    public void execute() {
        System.out.println("Enter the employee's number:");
        int num = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("Enter this employee's number of hours worked:");
        int workedHours = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("Enter this employee's salary per hour:");
        double salaryPerHour = Main.sc.nextDouble();
        Main.sc.nextLine();
        System.out.printf("Employee number %d must be paid a value of $%.2f as salary%n", num, (workedHours*salaryPerHour));
    }
    
}
