package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_54_4 extends Exercise {
        
    public Exercise_6_54_4() {
        super("Exercício mód. 6 aula 54 nro. 4");
    }

    @Override
    public void execute() {
        System.out.println("* Divisão em pares");
        System.out.println("Digite o número de casos de teste: ");
        int casosTeste = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("Para cada caso informe dois números inteiros,\no resultado da divisão do primeiro pelo segundo algarismo\nserá exibido logo em seguida.");
        for(int i = 0; i < casosTeste; i++) {
            System.out.printf("Caso %d: ", i+1);
            int val1 = Main.sc.nextInt();
            int val2 = Main.sc.nextInt();
            Main.sc.nextLine();
            if(val2 != 0) {
                float resultado = (float) val1/val2;
                System.out.printf("Resultado: %.1f%n%n", resultado);
            } else {
                System.out.println("Impossível dividir por zero!\n");
            }
        }
    }
    
}
