package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_10_90_1 extends OOJavaExercise {
    
    public Exercise_10_90_1() {
        super("Exercise mod. 10 lesson 90 num. 1");
    }
    
    @Override
    public void execute() {
        System.out.print("Enter how many integers you'll inform: ");
        int numbersQty = Main.sc.nextInt();
        Main.sc.nextLine();
        
        int[] numbers = new int[numbersQty]; 
        for(int i = 0; i < numbersQty; i++) {
            System.out.print("Enter an integer: ");
            numbers[i] = Main.sc.nextInt();
            Main.sc.nextLine();
        }
        
        System.out.print("NEGATIVE INTEGERS: \n");
        for(int i = 0; i < numbersQty; i++) {
            if(numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }
    }

}
