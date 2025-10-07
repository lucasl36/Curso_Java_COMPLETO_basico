package com.lucasl36.cursojavacompleto.entities.mod15.throwables;

/**
 *
 * @author Lucas Lopes
 */
public class WithdrawLimitException extends Exception {

    public WithdrawLimitException() {
        super("Invalid value: Withdraw limit exceeded!");
    }
    
}
