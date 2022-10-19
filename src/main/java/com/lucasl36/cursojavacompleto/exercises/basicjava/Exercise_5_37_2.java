package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_2 extends BasicJavaExercise {
    
    public Exercise_5_37_2() {
        super("Exercise mod. 5 lesson 37 num. 2");
    }
    
    @Override
    public void execute() {
        System.out.print("Enter an integer number: ");
        int num = Main.sc.nextInt();
        Main.sc.nextLine();
        if(num % 2 == 0) {
            System.out.println("This number is EVEN");
        } else {
            System.out.println("This number is ODD");
        }
    }
    
}
