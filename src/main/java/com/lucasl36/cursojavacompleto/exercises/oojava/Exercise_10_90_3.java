package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.entities.Person;
import com.lucasl36.cursojavacompleto.utils.StringUtils;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_10_90_3 extends OOJavaExercise {

    public Exercise_10_90_3() {
        super("Exercise mod. 10 lesson 90 num. 3");
    }
    
    @Override
    public void execute() {
        System.out.print("Enter how many person's data you gonna inform: ");
        int personsQty = Main.sc.nextInt();
        Main.sc.nextLine();
        
        double heightSum = 0;
        int minorsSixteenQty = 0;
        Person persons[] = new Person[personsQty];
        for(int i = 0; i < personsQty; i++) {
            String indexStr = StringUtils.getPositionWithSuffix(i+1);
            System.out.println("Data of the "+ indexStr +" person:");
            
            System.out.print("Name: ");
            String name = Main.sc.nextLine();
            
            System.out.print("Age: ");
            int age = Main.sc.nextInt();
            if(age < 16) {
                minorsSixteenQty++;
            }
            Main.sc.nextLine();
            
            System.out.print("Height: ");
            double height = Main.sc.nextDouble();
            heightSum += height;
            Main.sc.nextLine();
            
            persons[i] = new Person(name, age, height);
        }
        
        double heightAvg = (heightSum/personsQty);
        double minorsSixteenPc = (minorsSixteenQty*100/personsQty);
        
        System.out.println("Average height: " + String.format("%.2f", heightAvg));
        System.out.println("Percentage of persons minor of 16: " + String.format("%.1f", minorsSixteenPc) + "%");
        if(minorsSixteenQty > 0) {
            System.out.println("Minors of 16: ");
            for(int i = 0; i < personsQty; i++) {
                if(persons[i].getAge() < 16) {
                    System.out.println(persons[i].getName());
                }
            }
        }
    }
    
}
