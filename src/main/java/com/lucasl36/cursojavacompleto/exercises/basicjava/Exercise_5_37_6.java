package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_6 extends Exercise {
    
    public Exercise_5_37_6() {
        super("Exercício mód. 5 aula 37 nro. 6");
    }
    
    @Override
    public void execute() {
        System.out.println("Digite um valor decimal com dupla precisão:");
        double valor = Main.sc.nextDouble();
        Main.sc.nextLine();
        if(valor >= 0.0 && valor <= 25.0) {
            System.out.println("Intervalo[0,25]");
        } else if(valor > 25.0 && valor <= 50.0) {
            System.out.println("Intervalo[25,50]");
        } else if(valor > 50.0 && valor <= 75.0) {
            System.out.println("Intervalo[50,75]");
        } else if(valor > 75.0 && valor <= 100.0) {
            System.out.println("Intervalo[75,100]");
        } else {
            System.out.println("Fora do intervalo");
        }
    }
    
}
