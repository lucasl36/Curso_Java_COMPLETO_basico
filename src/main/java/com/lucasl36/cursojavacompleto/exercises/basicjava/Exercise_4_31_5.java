package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_4_31_5 extends Exercise {

    public Exercise_4_31_5() {
        super("Exercício mód. 4 aula 31 nro. 5");
    }
    
    @Override
    public void execute() {
        System.out.println("Digite o código, a quantidade e o valor da primeira peça separados por espaço:");
        int pc1Codigo = Main.sc.nextInt();
        int pc1Quantidade = Main.sc.nextInt();
        double pc1Valor = Main.sc.nextDouble();
        Main.sc.nextLine();
        System.out.println("Digite o código, a quantidade e o valor da segunda peça separados por espaço:");
        int pc2Codigo = Main.sc.nextInt();
        int pc2Quantidade = Main.sc.nextInt();
        double pc2Valor = Main.sc.nextDouble();
        Main.sc.nextLine();
        System.out.printf("O valor a ser pago em ambas as peças de código %d e %d é de: $%.2f%n", pc1Codigo, pc2Codigo, (this.calcularValorPc(pc1Quantidade,pc1Valor) + this.calcularValorPc(pc2Quantidade,pc2Valor)));
    }
    
    private double calcularValorPc(int qtd, double vlr) {
        return (double) qtd * vlr;
    }
    
}
