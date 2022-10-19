package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_4_31_6 extends Exercise {

    public Exercise_4_31_6() {
        super("Exercício mód. 4 aula 31 nro. 6");
    }
    
    @Override
    public void execute() {
        double pi = 3.14159;
        System.out.println("Digite 3 valores decimais de no máximo dupla precisão separados por espaço:");
        float a = Main.sc.nextFloat();
        float b = Main.sc.nextFloat();
        float c = Main.sc.nextFloat();
        Main.sc.nextLine();
        double areaTriangulo = a*c/2;
        double areaCirculo = pi*Math.pow(c, 2);
        double areaTrapezio = (a+b)*c/2;
        double areaQuadrado = Math.pow(b, 2);
        double areaRetangulo = a*b;
        System.out.println("Estas são as áreas das respectivas figuras geométricas:");
        System.out.printf("Triângulo: %.3f%n", areaTriangulo);
        System.out.printf("Círculo: %.3f%n", areaCirculo);
        System.out.printf("Trapézio: %.3f%n", areaTrapezio);
        System.out.printf("Quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Retângulo: %.3f%n", areaRetangulo);
    }
    
}
