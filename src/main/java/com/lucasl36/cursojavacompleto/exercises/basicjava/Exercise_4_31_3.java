package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_4_31_3 extends Exercise {

    public Exercise_4_31_3() {
        super("Exercício mód. 4 aula 31 nro. 3");
    }
    
    @Override
    public void execute() {
        System.out.println("Digite 4 valores inteiros - A, B, C e D - separados por espaço:");
        int a = Main.sc.nextInt();
        int b = Main.sc.nextInt();
        int c = Main.sc.nextInt();
        int d = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + (a*b-c*d));
    }
    
}
