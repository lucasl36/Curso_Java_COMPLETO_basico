package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_7 extends Exercise {
    
    public Exercise_5_37_7() {
        super("Exercício mód. 5 aula 37 nro. 7");
    }
    
    @Override
    public void execute() {
        System.out.println("Digite dois valores decimais com dupla precisão\n"
                + "separados por um espaço:");
        double x = Main.sc.nextDouble();
        double y = Main.sc.nextDouble();
        Main.sc.nextLine();
        if(x == 0.0 && y == 0.0) {
            System.out.println("O ponto se encontra na origem");
        } else if(x == 0.0 && y > 0.0) {
            System.out.println("O ponto se encontra sobre o Eixo X entre Q1 & Q2");
        } else if(x == 0.0 && y < 0.0) {
            System.out.println("O ponto se encontra sobre o Eixo X entre Q3 & Q4");
        } else if(x > 0.0 && y == 0.0) {
            System.out.println("O ponto se encontra sobre o Eixo Y entre Q1 & Q4");
        } else if(x < 0.0 && y == 0.0) {
            System.out.println("O ponto se encontra sobre o Eixo Y entre Q2 & Q3");
        } else if(x > 0.0 && y > 0.0) {
            System.out.println("O ponto se encontra em Q1");
        } else if(x > 0.0 && y < 0.0) {
            System.out.println("O ponto se encontra em Q4");
        } else if(x < 0.0 && y > 0.0) {
            System.out.println("O ponto se encontra em Q2");
        } else if(x < 0.0 && y < 0.0) {
            System.out.println("O ponto se encontra em Q3");
        } else {
            System.out.println("Este ponto não se encontra nesta dimensão");
        }
    }
}
