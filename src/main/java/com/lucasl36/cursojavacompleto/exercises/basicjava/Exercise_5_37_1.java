package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_1 extends Exercise {
    
    public Exercise_5_37_1() {
        super("Exercício mód. 5 aula 37 nro. 1");
    }
    
    @Override
    public void execute() {
        System.out.print("Digite um número inteiro: ");
        int nro = Main.sc.nextInt();
        Main.sc.nextLine();
        if(nro > 0) {
            System.out.println("Este número é POSITIVO");
        } else if (nro == 0) {
            System.out.println("Este número é ZERO");
        } else if (nro < 0) {
            System.out.println("Este número é NEGATIVO");
        }
    }
    
}
