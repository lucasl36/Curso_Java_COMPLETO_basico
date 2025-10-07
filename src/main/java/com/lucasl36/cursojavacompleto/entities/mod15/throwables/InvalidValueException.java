package com.lucasl36.cursojavacompleto.entities.mod15.throwables;

/**
 *
 * @author Lucas Lopes
 */
public class InvalidValueException extends Exception {

    public InvalidValueException() {
        super("Invalid value: Must be bigger than zero!");
    }

}
