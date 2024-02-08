package com.lucasl36.cursojavacompleto;

import com.lucasl36.cursojavacompleto.exercises.Exercise;
import com.lucasl36.cursojavacompleto.exercises.ExercisesList;
import com.lucasl36.cursojavacompleto.helpers.CollectionsHelper;
import com.lucasl36.cursojavacompleto.helpers.ReflectionsHelper;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lucas Lopes
 */
public class Main {

    public static Scanner sc;
    private static List<ExercisesList> exercisesLists;
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        sc = new Scanner(System.in);
        initializeExercises();
        System.out.println("Exercises resolution for the course \"Java COMPLETO Programação Orientada a Objetos + Projetos by Nelio Alves\"");
        try {
            boolean repeat = true;
            while(repeat) {
                ExercisesList currentExercisesList = selectExercisesList();
                currentExercisesList.initialize();
                if(!currentExercisesList.getExerciseList().isEmpty()) {
                    CollectionsHelper.orderExercisesListByName(currentExercisesList.getExerciseList());
                    selectExercise(currentExercisesList.getExerciseList()).execute();
                } else {
                    System.out.println("There is no exercises in this list...");
                }
                System.out.print("Do you want to repeat execution (Y/N)? ");
                char sn = sc.next().toUpperCase().charAt(0);
                sc.nextLine();
                if(sn == 'N') {
                    System.out.println("Exiting...");
                    repeat = false;
                } else {
                    System.out.println();
                }
            }
        }catch(ReflectiveOperationException e) {
            System.out.println("Failed to instantiate exercises classes.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }   
    
    private static void initializeExercises() {
        try {
            exercisesLists = ReflectionsHelper.initializeExerciseListsUsingReflection();
            CollectionsHelper.orderExercisesListListByName(exercisesLists);
        } catch(Exception e) {
            System.out.println("Exercises instantiation failed! Error: " + e.getClass().getSimpleName());
            e.printStackTrace();
        }
    }
    
    private static ExercisesList selectExercisesList() {
        int selectedExercisesList = 0;
        do {
            int index = 1;
            System.out.println("There are different exercises lists avaiable, see below:");
            for(ExercisesList exercisesList : exercisesLists) {
                System.out.println(String.valueOf(index) + ". " + exercisesList.toString());
                index++;
            }
            System.out.println(String.valueOf(index) + ". Exit");
            System.out.print("Which one do you want to execute? ");
            selectedExercisesList = sc.nextInt();
            sc.nextLine();
            if(selectedExercisesList == index) {
                System.exit(0);
            }
            if(selectedExercisesList <= 0 || selectedExercisesList > exercisesLists.size()) {
                System.out.println("There is no such exercises list. Please try again...");
            }
        } while(selectedExercisesList <= 0 || selectedExercisesList > exercisesLists.size());
        return exercisesLists.get(selectedExercisesList-1);
    }
    
    private static Exercise selectExercise(List<Exercise> exercises) {
        int selectedExercise = 0;
        do {
            int index = 0;
            System.out.println("Exercises avaible for execution: ");
            for(Exercise exercise : exercises) {
                System.out.println(String.valueOf(index+1) + ". " + exercise.toString());
                index++;
            }
            System.out.print("Enter number for the desired exercise: ");
            selectedExercise = sc.nextInt();
            sc.nextLine();            
            if(selectedExercise <= 0 || selectedExercise > exercises.size()) {
                System.out.println("Invalid exercise! Please try again.\n");
            }else {
                System.out.println("Executing exercise...\n");
            }
        } while(selectedExercise <= 0 || selectedExercise > exercises.size());
        return exercises.get(selectedExercise-1);
    }
    
}
