package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.exercises.Exercise;
import com.lucasl36.cursojavacompleto.exercises.ExercisesList;
import com.lucasl36.cursojavacompleto.helpers.ReflectionHelper;

import java.util.List;

/**
 *
 * @author Lucas Lopes
 */
public class BasicJavaExerciseList extends ExercisesList {
    
    public BasicJavaExerciseList() {
        super("Basic Java Exercises", "com.lucasl36.cursojavacompleto.exercises.basicjava");
    }

    @Override
    public void initialize() throws ReflectiveOperationException {
        this.setExerciseList(ReflectionHelper.initializeBasicJavaExercisesUsingReflection(this.packagePath));
    }
    
}
