package com.lucasl36.cursojavacompleto.helpers;

import com.lucasl36.cursojavacompleto.exercises.Exercise;
import com.lucasl36.cursojavacompleto.exercises.ExercisesList;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.reflections.Reflections;

/**
 *
 * @author Lucas Lopes
 */
public class ReflectionHelper {

    public static List<ExercisesList> initializeExerciseListsUsingReflection() throws ReflectiveOperationException  {
        String defaultPackagePath = "com.lucasl36.cursojavacompleto.exercises";
        ArrayList<ExercisesList> exerciseLists = new ArrayList<ExercisesList>();
        Reflections reflections = new Reflections(defaultPackagePath);
        Set<Class<? extends ExercisesList>> classes = reflections.getSubTypesOf(ExercisesList.class);
        for(Class<? extends ExercisesList> clasz : classes) {
            ExercisesList exerciseList = clasz.getDeclaredConstructor().newInstance(null);
            exerciseLists.add(exerciseList);
        }
        return exerciseLists;
    }
    
    public static List<Exercise> initializeExercisesUsingReflection(String packagePath) throws ReflectiveOperationException {
        ArrayList<Exercise> exercises = new ArrayList<Exercise>();
        Reflections reflections = new Reflections(packagePath);
        Set<Class<? extends Exercise>> classes = reflections.getSubTypesOf(Exercise.class);
        for(Class<? extends Exercise> clasz : classes) {
            Exercise javaBasicExercise = clasz.getDeclaredConstructor().newInstance(null);
            exercises.add(javaBasicExercise);
        }
        return exercises;
    }
    
}
