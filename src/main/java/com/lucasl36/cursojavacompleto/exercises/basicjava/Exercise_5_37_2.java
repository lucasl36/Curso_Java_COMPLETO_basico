package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_2 extends Exercise {
    
    public Exercise_5_37_2() {
        super("Exercício mód. 5 aula 37 nro. 2");
    }
    
    @Override
    public void execute() {
        System.out.print("Digite um número inteiro: ");
        int nro = Main.sc.nextInt();
        Main.sc.nextLine();
        if(nro % 2 == 0) {
            System.out.println("Este número é PAR");
        } else {
            System.out.println("Este número é IMPAR");
        }
    }
    
}
