package com.lucasl36.cursojavacompleto.entities;

/**
 *
 * @author Lucas Lopes
 */
public class Student {
    
    private String name;
    private double firstTrimesterGrade;
    private double secondTrimesterGrade;
    private double thirdTrimesterGrade;
    private double finalGrade;

    public Student(String name, double firstTrimesterGrade, double secondTrimesterGrade, double thirdTrimesterGrade) {
        this.name = name;
        this.firstTrimesterGrade = firstTrimesterGrade;
        this.secondTrimesterGrade = secondTrimesterGrade;
        this.thirdTrimesterGrade = thirdTrimesterGrade;
        this.finalGrade = firstTrimesterGrade + secondTrimesterGrade + thirdTrimesterGrade;
    }
    
    public boolean passed(double minimumGrade) {
        return finalGrade >= minimumGrade;
    }
    
    public double missingPoints(double minimumGrade) {
        if(!passed(minimumGrade)) {
            return minimumGrade - finalGrade;
        }
        return 0.00;
    }
    
    public String toString() {
        return name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstTrimesterGrade() {
        return firstTrimesterGrade;
    }

    public void setFirstTrimesterGrade(double firstTrimesterGrade) {
        this.firstTrimesterGrade = firstTrimesterGrade;
    }

    public double getSecondTrimesterGrade() {
        return secondTrimesterGrade;
    }

    public void setSecondTrimesterGrade(double secondTrimesterGrade) {
        this.secondTrimesterGrade = secondTrimesterGrade;
    }

    public double getThirdTrimesterGrade() {
        return thirdTrimesterGrade;
    }

    public void setThirdTrimesterGrade(double thirdTrimesterGrade) {
        this.thirdTrimesterGrade = thirdTrimesterGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }
    
}
