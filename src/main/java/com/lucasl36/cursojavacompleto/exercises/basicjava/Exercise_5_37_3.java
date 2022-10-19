package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_3 extends Exercise {
    
    public Exercise_5_37_3() {
        super("Exercício mód. 5 aula 37 nro. 3");
    }
    
    @Override
    public void execute() {
        System.out.print("Digite dois números inteiros separados por um espaço: ");
        int a = Main.sc.nextInt();
        int b = Main.sc.nextInt();
        Main.sc.nextLine();
        if(a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        if(b % a == 0) {
            System.out.println("Estes números SÃO MÚLTIPLOS!");
        } else {
            System.out.println("Estes números NÃO SÃO MÚLTIPLOS!");
        }
    }
    
}