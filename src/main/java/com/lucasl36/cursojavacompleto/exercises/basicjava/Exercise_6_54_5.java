package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_54_5 extends Exercise {
        
    public Exercise_6_54_5() {
        super("Exercício mód. 6 aula 54 nro. 5");
    }

    @Override
    public void execute() {
        System.out.println("* Cálculo de fatorial");
        System.out.println("Digite um valor inteiro: ");
        int val = Main.sc.nextInt();
        Main.sc.nextLine();
        if(val == 0) {
            System.out.println("Fatorial de 0 é 1");
        } else {
            int fat = 1;
            for(int i = 1; i <= val; i++) {
                fat = fat*i;
            }
            System.out.printf("Fatorial de %d é %d%n", val, fat);
        }
        
    }
    
}
