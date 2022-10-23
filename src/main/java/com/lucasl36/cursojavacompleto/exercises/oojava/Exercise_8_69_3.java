package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.entities.Student;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_8_69_3 extends OOJavaExercise {
    
    private final static double minimumGrade = 60.0;
    
    public Exercise_8_69_3() {
        super("Exercise mod. 8 lesson 69 num. 3");
    }
    
    @Override
    public void execute() {
        System.out.println("** Student Grades Calculation");
        System.out.println("Enter below student's name, first, second & third trimester grades respectively:");
        String name = Main.sc.nextLine();
        double _1stTriGrade = Main.sc.nextDouble();
        Main.sc.nextLine();
        double _2ndTriGrade = Main.sc.nextDouble();
        Main.sc.nextLine();
        double _3rdTriGrade = Main.sc.nextDouble();
        Main.sc.nextLine();
        Student student = new Student(name, _1stTriGrade, _2ndTriGrade, _3rdTriGrade);
        System.out.println("FINAL GRADE: " + String.format("%.2f", student.getFinalGrade()));
        if(student.passed(minimumGrade)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", student.missingPoints(minimumGrade)) + " POINTS");
        }
    }
    
}
