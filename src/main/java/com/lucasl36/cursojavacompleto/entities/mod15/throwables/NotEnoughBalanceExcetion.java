package com.lucasl36.cursojavacompleto.entities.mod15.throwables;

/**
 *
 * @author Lucas Lopes
 */
public class NotEnoughBalanceExcetion extends Exception {

    public NotEnoughBalanceExcetion() {
        super("Invalid value: Not enough balance!");
    }
    
}
