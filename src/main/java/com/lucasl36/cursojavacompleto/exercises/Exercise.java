package com.lucasl36.cursojavacompleto.exercises;

/**
 *
 * @author Lucas Lopes
 */
public abstract class Exercise {

    protected String name;
    
    public Exercise(String name) {
        this.name = name;
    }
    
    public String toString() {
        return this.name;
    }
    
    public String getName() {
        return this.name;
    }
    
    abstract public void execute();
    
}
