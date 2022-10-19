package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_4 extends Exercise {
    
    public Exercise_5_37_4() {
        super("Exercício mód. 5 aula 37 nro. 4");
    }
    
    @Override
    public void execute() {
        System.out.print("Digite dois números inteiros,\n"
                + "correspondentes as horas de um dia (0 até 24),\n"
                + "separados por um espaço: ");
        int hora1 = Main.sc.nextInt();
        int hora2 = Main.sc.nextInt();
        Main.sc.nextLine();
        if(hora1 == hora2) {
            System.out.println("Há um intervalo de 24 horas entre os números.");
        } else {
            int intervalo = 0;
            if(hora1 > hora2) {
                intervalo = (24-hora1)+hora2;
            } else {
                intervalo = hora2 - hora1;
            }
            String s = intervalo > 1 ? "horas" : "hora";
            System.out.println("Há um intervalo de " + intervalo + " " + s + " entre os números.");
        }
    }
    
}