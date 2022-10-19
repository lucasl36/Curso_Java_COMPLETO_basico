package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_4_31_2 extends Exercise {

    public Exercise_4_31_2() {
        super("Exercício mód. 4 aula 31 nro. 2");
    }
    
    @Override
    public void execute() {
        double pi = 3.14159;
        System.out.println("Digite o valor do raio de um círculo:");
        double r = Main.sc.nextDouble();
        Main.sc.nextLine();
        System.out.printf("A área deste círculo é: %.4f%n", (pi*Math.pow(r, 2)));
    }
    
}
