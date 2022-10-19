package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_54_7 extends Exercise {
        
    public Exercise_6_54_7() {
        super("Exercício mód. 6 aula 54 nro. 7");
    }

    @Override
    public void execute() {
        System.out.println("* Cálculo quadrático e cúbico");
        System.out.println("Digite um valor inteiro: ");
        int val = Main.sc.nextInt();
        Main.sc.nextLine();
        for(int i = 1; i <= val; i++) {
            int qua = (int) Math.pow(i, 2);
            int cub = (int) Math.pow(i, 3);
            System.out.printf("Linha: %d, Quadrado: %d, Cubo: %d %n", i, qua, cub);
        }
    }
    
}
