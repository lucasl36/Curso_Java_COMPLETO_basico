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
        Collections.sort(exercisesList, new AlphabetExercisesListComparator());
    }
    
    private static class AlphabetExercisesListComparator implements Comparator<Exercise> {
        @Override
        public int compare(Exercise o1, Exercise o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    
}
