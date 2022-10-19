package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.ExercisesList;
import com.lucasl36.cursojavacompleto.helpers.ReflectionHelper;

/**
 *
 * @author Lucas Lopes
 */
public class OOJavaExerciseList extends ExercisesList {

    public OOJavaExerciseList() {
        super("Object Oriented Java Exercises", "com.lucasl36.cursojavacompleto.exercises.oojava");
    }

    @Override
    public void initialize() throws ReflectiveOperationException {
        this.setExerciseList(ReflectionHelper.initializeExercisesUsingReflection(this.packagePath));
    }
    
}
