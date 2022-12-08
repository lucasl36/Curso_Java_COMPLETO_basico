package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.utils.StringUtils;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_10_90_11 extends OOJavaExercise {

    public Exercise_10_90_11() {
        super("Exercise mod. 10 lesson 90 num. 11");
    }
    
    @Override
    public void execute() {
        System.out.print("How many persons' height and birth sex (F or M) will you enter? ");
        int arraySize = Main.sc.nextInt();
        Main.sc.nextLine();
        
        double shortest = 0.0;
        double highest = 0.0;
        int femQty = 0;
        int mascQty = 0;
        double femHeightSum = 0.0;
        double femHeightAvg = 0.0;
        
        double[] heights = new double[arraySize];
        char[] birthSexes = new char[arraySize];
        for(int i = 0; i < arraySize; i++) {
            String pos = StringUtils.getPositionWithSuffix(i+1);
            System.out.print(pos + " person height: ");
            heights[i] = Main.sc.nextDouble();
            Main.sc.nextLine();
            System.out.print(pos + " person birth sex: ");
            birthSexes[i] = Main.sc.nextLine().charAt(0);
            
            if(shortest == 0.0 || heights[i] < shortest) {
                shortest = heights[i];
            }
            if(highest == 0.0 || heights[i] > highest) {
                highest = heights[i];
            }
            if(birthSexes[i] == 'F') {
                femQty++;
                femHeightSum += heights[i];
            }
            if(birthSexes[i] == 'M') {
                mascQty++;
            }
        }
        
        femHeightAvg = femHeightSum/femQty;
        System.out.println("Shortest height: " + String.valueOf(shortest));
        System.out.println("Highest height: " + String.valueOf(highest));
        System.out.println("Women average height: " + String.format("%.2f",femHeightAvg));
        System.out.println("Qty. of men: " + String.valueOf(mascQty));
    }
    
}
