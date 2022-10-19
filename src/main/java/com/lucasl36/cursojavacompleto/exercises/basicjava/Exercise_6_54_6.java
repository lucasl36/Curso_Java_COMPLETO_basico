package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_54_6 extends Exercise {
        
    public Exercise_6_54_6() {
        super("Exercício mód. 6 aula 54 nro. 6");
    }

    @Override
    public void execute() {
        System.out.println("* Cálculo de divisores");
        System.out.println("Digite um valor inteiro: ");
        int val = Main.sc.nextInt();
        Main.sc.nextLine();
        for(int i = 1; i <= val; i++) {
            if(val%i == 0) {
                System.out.println(i);
            }
        }
    }
    
}
