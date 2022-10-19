package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_8 extends Exercise {
    
    public Exercise_5_37_8() {
        super("Exercício mód. 5 aula 37 nro. 8");
    }
    
    @Override
    public void execute() {
        System.out.println("**Secretária da Fazenda de Lisarb");
        System.out.println("**Cálculo do valor devido em forma de Imposto de Renda");
        System.out.print("Digite o valor do seu salário com dupla precisão decimal:");
        double salario = Main.sc.nextDouble();
        Main.sc.nextLine();
        double totalIR = 0.0;
        if(salario > 4500.0) {
            totalIR += (salario-4500.0)*0.28;
            salario -= salario-4500.00;
        } 
        if(salario >= 3000.01 && salario <= 4500.0) {
            totalIR += (salario-3000.01)*0.18;
            salario -= salario-3000.01;
        } 
        if(salario >= 2000.01 && salario <= 3000.0) {
            totalIR += (salario-2000.01)*0.08;
        }        
        if(totalIR > 0.0) {
            System.out.printf("O valor devido para o imposto de renda é de R$ %.2f!", totalIR);
        } else {
            System.out.println("Você está isento de pagar o imposto de renda!");
        }
    }
}
