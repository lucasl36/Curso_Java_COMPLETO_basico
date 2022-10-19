package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_54_3 extends Exercise {
        
    public Exercise_6_54_3() {
        super("Exercício mód. 6 aula 54 nro. 3");
    }

    @Override
    public void execute() {
        System.out.println("* Cálculo de média ponderada"); 
        System.out.println("* Valor 1: Peso 2");
        System.out.println("* Valor 2: Peso 3");
        System.out.println("* Valor 3: Peso 5");
        System.out.println("Digite o número de casos de teste: ");
        int casosTeste = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("Agora para cada caso digite três valores reais \ncom apenas uma casa decimal.\n"); 
        for(int i = 0; i < casosTeste; i++) {
            System.out.printf("Caso %d: ", i+1);
            float val1 = Main.sc.nextFloat();
            float val2 = Main.sc.nextFloat();
            float val3 = Main.sc.nextFloat();
            float media = (val1*2f+val2*3f+val3*5f)/10f;
            System.out.printf("Média ponderada dos valores: %.1f%n%n", media);
        }
    }
    
}
