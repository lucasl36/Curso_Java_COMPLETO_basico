package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_49_2 extends Exercise {
    
    public Exercise_6_49_2() {
        super("Exercício mód. 6 aula 49 nro. 2");
    }
    
    @Override
    public void execute() {
        System.out.println("Escreva dois inteiros separados por espaço");
        System.out.println("Que representam coordenadas num plano cartesiano:");
        System.out.println("O sistema irá parar apenas quando alguma delas for 0.");
        int x = 0, y = 0;
        do {
           x = Main.sc.nextInt();
           y = Main.sc.nextInt();
           Main.sc.nextLine();
           if(x > 0 && y > 0) {
               System.out.println("As coordenadas se encontram no 1º quadrante");
           } else if(x > 0 && y < 0) {
               System.out.println("As coordenadas se encontram no 4º quadrante");
           } else if(x < 0 && y > 0) {
               System.out.println("As coordenadas se encontram no 2º quadrante");
           } else if(x < 0 && y < 0) {
               System.out.println("As coordenadas se encontram no 3º quadrante");
           }
           if(x == 0 || y == 0) {
               System.out.println("Finalizando...");
           }
        }while(x != 0 && y != 0);
    }
}
