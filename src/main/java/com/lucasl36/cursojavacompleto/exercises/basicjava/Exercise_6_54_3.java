package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.exercises.BasicJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_54_3 extends BasicJavaExercise {
        
    public Exercise_6_54_3() {
        super("Exercise mod. 6 lesson 54 num. 3");
    }

    @Override
    public void execute() {
        System.out.println("* Weighted average calculation"); 
        System.out.println("* Value 1: Weight 2");
        System.out.println("* Value 2: Weight 3");
        System.out.println("* Value 3: Weight 5");
        System.out.println("Enter the number of test cases:");
        int testCases = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("Now for each case enter 3 real numbers \nwith single decimal precision.\n"); 
        for(int i = 0; i < testCases; i++) {
            System.out.printf("Caso %d: ", i+1);
            float val1 = Main.sc.nextFloat();
            float val2 = Main.sc.nextFloat();
            float val3 = Main.sc.nextFloat();
            float average = (val1*2f+val2*3f+val3*5f)/10f;
            System.out.printf("Numbers weighted average: %.1f%n%n", average);
        }
    }
    
}
