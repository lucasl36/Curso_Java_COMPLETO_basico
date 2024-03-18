package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.helpers.StringHelper;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_10_90_9 extends OOJavaExercise {

    public Exercise_10_90_9() {
        super("Exercise mod. 10 lesson 90 num. 9");
    }
    
    @Override
    public void execute() {
        System.out.print("How many persons' name and age will you enter? ");
        int arraySize = Main.sc.nextInt();
        Main.sc.nextLine();
        
        int oldestIndex = 0;
        String[] names = new String[arraySize];
        int[] ages = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            String pos = StringHelper.getPositionWithSuffix(i+1);
            System.out.println(pos + " person data:");
            System.out.print("Name: ");
            names[i] = Main.sc.nextLine();
            System.out.print("Age: ");
            ages[i] = Main.sc.nextInt();
            Main.sc.nextLine();
            if(ages[i] > ages[oldestIndex]) {
                oldestIndex = i;
            }
        }
        System.out.println("OLDEST PERSON: " + names[oldestIndex]);       
    }
    
}
