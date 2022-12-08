package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.exercises.BasicJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_4_31_1 extends BasicJavaExercise {

    public Exercise_4_31_1() {
        super("Exercise mod. 4 lesson 31 num. 1");
    }
    
    @Override
    public void execute() {
        System.out.println("Enter an integer value A:");                
        int a = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("Enter an integer value B:");
        int b = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("The sum of values A and B is: " + (a + b));
    }
    
}
