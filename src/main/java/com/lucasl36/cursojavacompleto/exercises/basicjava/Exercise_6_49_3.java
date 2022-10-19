package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_49_3 extends Exercise {
    
    public Exercise_6_49_3() {
        super("Exercício mód. 6 aula 49 nro. 3");
    }
    
    @Override
    public void execute() {
        int qtdAlcool = 0;
        int qtdGasolina = 0;
        int qtdDiesel = 0;
        System.out.println("Pesquisa de consumo");
        System.out.println("Digite qual produto do nosso posto utilizou no último mês:");
        System.out.println("1 para Álcool, 2 para Gasolina, 3 para Diesel e 4 para finalizar pesquisa.");
        int produto = 0;
        while(produto != 4) {
            produto = Main.sc.nextInt();
            switch(produto) {
                case 1:
                    qtdAlcool++;
                    break;
                case 2:
                    qtdGasolina++;
                    break;
                case 3:
                    qtdDiesel++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Muito obrigado por participar de nossa pesquisa!");
        System.out.println("Qtd. que consumiu álcool: "+qtdAlcool);
        System.out.println("Qtd. que consumiu álcool: "+qtdGasolina);
        System.out.println("Qtd. que consumiu álcool: "+qtdDiesel);
    }
    
}
