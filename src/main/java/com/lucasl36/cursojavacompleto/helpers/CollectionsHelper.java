package com.lucasl36.cursojavacompleto.helpers;

import com.lucasl36.cursojavacompleto.exercises.Exercise;
import com.lucasl36.cursojavacompleto.exercises.ExercisesList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Lucas Lopes
 */
public class CollectionsHelper {

    public static void orderExercisesListListByName(List<ExercisesList> exercisesLists) {
        Collections.sort(exercisesLists, new AlphabetExercisesListsComparator());
    }
    
    private static class AlphabetExercisesListsComparator implements Comparator<ExercisesList> {
        @Override
        public int compare(ExercisesList o1, ExercisesList o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    
    public static void orderExercisesListByName(List<Exercise> exercisesList) {
        Collections.sort(exercisesList, new ExerciseNumberExercisesListsComparator());
    }
    
    private static class AlphabetExercisesListComparator implements Comparator<Exercise> {
        @Override
        public int compare(Exercise o1, Exercise o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    
    private static class ExerciseNumberExercisesListsComparator implements Comparator<Exercise> {
        @Override
        public int compare(Exercise o1, Exercise o2) {
            Integer[] exerciseNumberArr1 = extractExerciseNumberArray(o1);
            Integer[] exerciseNumberArr2 = extractExerciseNumberArray(o2);
            for(int i = 0; i < 3; i++) {
                if(exerciseNumberArr1[i] != exerciseNumberArr2[i]) {                   
                    return Integer.compare(exerciseNumberArr1[i], exerciseNumberArr2[i]);
                }
            }            
            return 0;
        }
    } 
 
    private static Integer[] extractExerciseNumberArray(Exercise exercise) {
        String[] exerciseClassNameArr =  exercise.getClass().getSimpleName().split("_");
        Integer[] exerciseNumberIntArr = new Integer[3];
        for(int index = 0; index < exerciseNumberIntArr.length; index++) {
            exerciseNumberIntArr[index] = Integer.parseInt(exerciseClassNameArr[index+1]);
        }
        return exerciseNumberIntArr;
    }
    
}
