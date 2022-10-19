package com.lucasl36.cursojavacompleto.helpers;

import com.lucasl36.cursojavacompleto.exercises.Exercise;
import com.lucasl36.cursojavacompleto.exercises.ExercisesList;
import com.lucasl36.cursojavacompleto.exercises.basicjava.BasicJavaExercise;
import com.lucasl36.cursojavacompleto.exercises.oojava.OOJavaExercise;
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
    
    public static List<Exercise> initializeBasicJavaExercisesUsingReflection(String packagePath) throws ReflectiveOperationException {
        ArrayList<BasicJavaExercise> exercises = new ArrayList<BasicJavaExercise>();
        Reflections reflections = new Reflections(packagePath);
        Set<Class<? extends BasicJavaExercise>> classes = reflections.getSubTypesOf(BasicJavaExercise.class);
        for(Class<? extends BasicJavaExercise> clasz : classes) {
            BasicJavaExercise javaBasicExercise = clasz.getDeclaredConstructor().newInstance(null);
            exercises.add(javaBasicExercise);
        }
        List<Exercise> result = new ArrayList<Exercise>(exercises);
        return result;
    }
    
    public static List<Exercise> initializeOOJavaExercisesUsingReflection(String packagePath) throws ReflectiveOperationException {
        ArrayList<OOJavaExercise> exercises = new ArrayList<OOJavaExercise>();
        Reflections reflections = new Reflections(packagePath);
        Set<Class<? extends OOJavaExercise>> classes = reflections.getSubTypesOf(OOJavaExercise.class);
        for(Class<? extends OOJavaExercise> clasz : classes) {
            OOJavaExercise javaOOExercise = clasz.getDeclaredConstructor().newInstance(null);
            exercises.add(javaOOExercise);
        }
        List<Exercise> result = new ArrayList<Exercise>(exercises);
        return result;
    }
    
}
