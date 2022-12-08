package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.exercises.BasicJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_54_4 extends BasicJavaExercise {
        
    public Exercise_6_54_4() {
        super("Exercise mod. 6 lesson 54 num. 4");
    }

    @Override
    public void execute() {
        System.out.println("* Division in pairs");
        System.out.println("Enter the number os test cases: ");
        int testCases = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("For each case enter two integer numbers,\nthe quotient of the division from the first by the second number\nwill be showed next.");
        for(int i = 0; i < testCases; i++) {
            System.out.printf("Case %d: ", i+1);
            int val1 = Main.sc.nextInt();
            int val2 = Main.sc.nextInt();
            Main.sc.nextLine();
            if(val2 != 0) {
                float result = (float) val1/val2;
                System.out.printf("Result: %.1f%n%n", result);
            } else {
                System.out.println("Divisions by zero are not possible!\n");
            }
        }
    }
    
}
