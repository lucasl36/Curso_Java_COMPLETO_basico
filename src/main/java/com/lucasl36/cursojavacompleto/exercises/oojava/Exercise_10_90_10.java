package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.helpers.StringHelper;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_10_90_10 extends OOJavaExercise {

    private final double gradePassAvg = 6.0; 
    
    public Exercise_10_90_10() {
        super("Exercise mod. 10 lesson 90 num. 10");
    }
    
    @Override
    public void execute() {
        System.out.println("**School semester approval checker");
        System.out.print("How many students will you enter? ");
        int arraySize = Main.sc.nextInt();
        Main.sc.nextLine();
        
        String[] studentsNames = new String[arraySize];
        double[] firstSemesterGrades = new double[arraySize];
        double[] secondSemesterGrades = new double[arraySize];
        double[] gradesAverage = new double[arraySize];
        for(int i = 0; i < arraySize; i++) {
            String pos = StringHelper.getPositionWithSuffix(i+1);
            System.out.println("Enter the name, first and second semester grades respectively for the " + pos + " student:");
            studentsNames[i] = Main.sc.nextLine();
            firstSemesterGrades[i] = Main.sc.nextDouble();
            Main.sc.nextLine();
            secondSemesterGrades[i] = Main.sc.nextDouble();
            Main.sc.nextLine();
            gradesAverage[i] = ((firstSemesterGrades[i]+secondSemesterGrades[i])/2);
        }
        System.out.println("Approved students: ");
        for(int i = 0; i < arraySize; i++) {
            if(gradesAverage[i] >= gradePassAvg) {
                System.out.println(studentsNames[i]);
            }
        }
        
    }
    
}
