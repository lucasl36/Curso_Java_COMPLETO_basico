package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_54_1 extends Exercise {
    
    private static final int minValue = 1;
    private static final int maxValue = 1000;
    
    public Exercise_6_54_1() {
        super("Exercício mód. 6 aula 54 nro. 1");
    }

    @Override
    public void execute() {
        System.out.printf("Digite um valor inteiro cujo valor esteja entre %d e %d: %n", minValue, maxValue);
        int val = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.printf("Exibindo os números impares de %d até %d... %n", minValue, val);
        for(int i = minValue; i <= val; i++) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }
    }
    
}
