package com.lucasl36.cursojavacompleto.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Lopes
 */
public abstract class ExercisesList {

    protected final String name;
    protected final String packagePath;
    protected List<Exercise> exercisesList;
    
    protected ExercisesList(String name, String packagePath) {
        this.name = name;
        this.packagePath = packagePath;
        this.exercisesList = new ArrayList<Exercise>();
    }
    
    public String toString() {
        return this.name;
    } 
    
    public String getName() {
        return this.name;
    }
    
    public String getPackagePath() {
        return this.packagePath;
    }
    
    public List<Exercise> getExerciseList() {
        return this.exercisesList;
    }
    
    public void setExerciseList(List<Exercise> exercisesList) {
        this.exercisesList = exercisesList;
    }
    
    public abstract void initialize() throws ReflectiveOperationException;
    
}
