package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_49_1 extends Exercise {
    
    public Exercise_6_49_1() {
        super("Exercício mód. 6 aula 49 nro. 1");
    }
    
    private final String senhaCorreta = "2002"; 
    
    @Override
    public void execute() {
        String senhaInformada = "";
        do {
            System.out.print("Informe a senha para ter acesso aos dados sigilosos:");
            senhaInformada = Main.sc.nextLine();
            if(!senhaCorreta.equals(senhaInformada)) {
                System.out.println("Senha inválida! Tente novamente.");
            } else {
                System.out.println("Senha correta! Acesso permitido.");
            }
        } while(!senhaCorreta.equals(senhaInformada));
    }
}
