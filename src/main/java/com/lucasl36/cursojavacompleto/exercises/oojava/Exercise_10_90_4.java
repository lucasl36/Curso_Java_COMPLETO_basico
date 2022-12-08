package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_10_90_4 extends OOJavaExercise {

    public Exercise_10_90_4() {
        super("Exercise mod. 10 lesson 90 num. 4");
    }
    
    @Override
    public void execute() {
        System.out.print("Enter how many integers you gonna inform: ");
        int numbersQty = Main.sc.nextInt();
        Main.sc.nextLine();
        
        int[] numbers = new int[numbersQty];
        int evenNumbersQty = 0;
        for(int i = 0; i < numbersQty; i++) {
            System.out.print("Enter an integer: ");
            numbers[i] = Main.sc.nextInt();
            Main.sc.nextLine();
            if(numbers[i]%2 == 0) {
                evenNumbersQty++;
            }
        }
        System.out.println("EVEN NUMBERS: ");
        for(int i = 0; i < numbersQty; i++) {
            if(numbers[i]%2 == 0) {
                System.out.print(String.valueOf(numbers[i]) + " ");
            }
        }
        System.out.println();
        System.out.println("EVEN NUMBERS QUANTITY: " + String.valueOf(evenNumbersQty));
    }
    
}
