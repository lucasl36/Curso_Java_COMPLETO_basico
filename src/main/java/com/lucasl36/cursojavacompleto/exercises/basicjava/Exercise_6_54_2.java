package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_54_2 extends Exercise {
    
    private static final int minValue = 10;
    private static final int maxValue = 20;
    
    public Exercise_6_54_2() {
        super("Exercício mód. 6 aula 54 nro. 2");
    }

    @Override
    public void execute() {
        int in = 0;
        int out = 0;
        System.out.println("Digite um valor inteiro:");
        int n = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.printf("Agora informe %d valores inteiros: %n", n);
        int val = 0;
        for(int i = 0; i < n; i++) {
            val = Main.sc.nextInt();
            if(val >= minValue && val <= maxValue) {
                in++;
            } else {
                out++;
            }
        }
        System.out.printf("Destes valores %d estão dentro e %d estão fora do intervalo %d - %d %n", in, out, minValue, maxValue);
    }
    
}
