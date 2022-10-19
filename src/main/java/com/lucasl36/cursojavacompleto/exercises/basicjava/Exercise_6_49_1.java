package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_49_1 extends Exercise {
    
    public Exercise_6_49_1() {
        super("Exercise mod. 6 lesson 49 num. 1");
    }
    
    private final String correctPasscode = "2002"; 
    
    @Override
    public void execute() {
        String informedPasscode = "";
        do {
            System.out.print("Enter the password so you can have access to the secretive data:");
            informedPasscode = Main.sc.nextLine();
            if(!correctPasscode.equals(informedPasscode)) {
                System.out.println("Invalid password! Try again.");
            } else {
                System.out.println("Success! Access granted.");
            }
        } while(!correctPasscode.equals(informedPasscode));
    }
}
