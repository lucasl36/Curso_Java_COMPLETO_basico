package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_10_103_1 extends OOJavaExercise {

    public Exercise_10_103_1() {
        super("Exercise mod. 10 lesson 103 num. 1");
    }
    
    @Override
    public void execute() {
        System.out.println("Enter 2 integers, they're gonna be the quantity of lines and columns of a matrix respectively:");
        Integer lines = Main.sc.nextInt();
        Integer columns = Main.sc.nextInt();
        Integer[][] matrix = new Integer[lines][columns];
        Main.sc.nextLine();
        
        System.out.println("Now populate the matrix, enter " + lines*columns + " integers:");
        for(int index = 0; index < lines; index++) {
            for(int order = 0; order < columns; order++) {
                matrix[index][order] = Main.sc.nextInt();
            }
        }
        Main.sc.nextLine();
        
        System.out.println("Now enter an integer that belongs to the matrix: ");
        Integer innerInteger = Main.sc.nextInt();
        Main.sc.nextLine();
        
        Integer countNegatives = 0;
        for(int index = 0; index < lines; index++) {
            for(int order = 0; order < columns; order++) {
                if(matrix[index][order].equals(innerInteger)) {
                    System.out.printf("Position: Line %d Column %d\n", index, order);
                    if(checkIfPositionIsValid(matrix.length, matrix[0].length, index-1, order)) {
                        System.out.printf("Integer above: %d\n", matrix[index-1][order]);
                    }
                    if(checkIfPositionIsValid(matrix.length, matrix[0].length, index, order+1)) {
                        System.out.printf("Integer to the right: %d\n", matrix[index][order+1]);
                    }
                    if(checkIfPositionIsValid(matrix.length, matrix[0].length, index+1, order)) {
                        System.out.printf("Integer below: %d\n", matrix[index+1][order]);
                    }
                    if(checkIfPositionIsValid(matrix.length, matrix[0].length, index, order-1)) {
                        System.out.printf("Integer to the left: %d\n", matrix[index][order-1]);
                    }
                }
            }
        }
    }
    
    private boolean checkIfPositionIsValid(int lines, int columns, int index, int order) {
        if( index >= 0 && index < lines && order >= 0 && order < columns) {
            return true;
        }
        return false;
    }

}
