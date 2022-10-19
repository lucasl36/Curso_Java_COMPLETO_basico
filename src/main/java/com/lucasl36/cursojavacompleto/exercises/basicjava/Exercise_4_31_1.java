package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_4_31_1 extends Exercise {

    public Exercise_4_31_1() {
        super("Exercício mód. 4 aula 31 nro. 1");
    }
    
    @Override
    public void execute() {
        System.out.println("Digite um valor inteiro A:");                
        int a = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("Digite o valor inteiro B:");
        int b = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("A soma dos valores A e B é: " + (a + b));
    }
    
}
