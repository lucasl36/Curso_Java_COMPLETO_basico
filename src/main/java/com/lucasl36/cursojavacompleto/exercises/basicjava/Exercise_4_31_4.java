package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_4_31_4 extends Exercise {

    public Exercise_4_31_4() {
        super("Exercício mód. 4 aula 31 nro. 4");
    }
    
    @Override
    public void execute() {
        System.out.println("Digite o número do funcionário:");
        int nro = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("Digite a quantidade de horas trabalhadas deste funcionário:");
        int horasTrabalhadas = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("Digite o salário por hora deste funcionário:");
        double salarioPorHora = Main.sc.nextDouble();
        Main.sc.nextLine();
        System.out.printf("Deve ser pago para o funcionário de número %d o valor de $%.2f como salário%n", nro, (horasTrabalhadas*salarioPorHora));
    }
    
}
