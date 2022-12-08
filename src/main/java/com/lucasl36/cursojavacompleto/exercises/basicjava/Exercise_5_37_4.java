package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.exercises.BasicJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_4 extends BasicJavaExercise {
    
    public Exercise_5_37_4() {
        super("Exercise mod. 5 lesson 37 num. 4");
    }
    
    @Override
    public void execute() {
        System.out.print("Enter two integer numbers,\n"
                + "corresponding to the hours of the day (0 til 24),\n"
                + "separated by space: ");
        int hour1 = Main.sc.nextInt();
        int hour2 = Main.sc.nextInt();
        Main.sc.nextLine();
        if(hour1 == hour2) {
            System.out.println("There is a 24 hour interval between these numbers.");
        } else {
            int interval = 0;
            if(hour1 > hour2) {
                interval = (24-hour1)+hour2;
            } else {
                interval = hour2 - hour1;
            }
            String s = interval > 1 ? "hours" : "hour";
            System.out.println("There is an interval of " + interval + " " + s + " between these numbers.");
        }
    }
    
}