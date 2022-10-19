package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_49_2 extends Exercise {
    
    public Exercise_6_49_2() {
        super("Exercise mod. 6 lesson 49 num. 2");
    }
    
    @Override
    public void execute() {
        System.out.println("Enter two integer numbers separated by space.");
        System.out.println("These numbers represent coordinates on a cartesian plane.");
        System.out.println("The system will stop when any of these numbers is 0.");
        int x = 0, y = 0;
        do {
           x = Main.sc.nextInt();
           y = Main.sc.nextInt();
           Main.sc.nextLine();
           if(x > 0 && y > 0) {
               System.out.println("The coordinates are located in the 1st quadrant");
           } else if(x > 0 && y < 0) {
               System.out.println("The coordinates are located in the 4th quadrant");
           } else if(x < 0 && y > 0) {
               System.out.println("The coordinates are located in the 2nd quadrant");
           } else if(x < 0 && y < 0) {
               System.out.println("The coordinates are located in the 3rd quadrant");
           }
           if(x == 0 || y == 0) {
               System.out.println("Exiting...");
           }
        }while(x != 0 && y != 0);
    }
}
