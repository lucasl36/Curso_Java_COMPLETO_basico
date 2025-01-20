package com.lucasl36.cursojavacompleto.helpers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Lucas Lopes
 */
public final class TimeHelper {

    public static final DateTimeFormatter dtfBrazilian = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DateTimeFormatter dtfBrazilianWithTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    public static final String convertLocalDateToString( LocalDate date ) {
        return dtfBrazilian.format(date);
    }
    
    public static final LocalDate convertStringToLocalDate ( String date ) {
        try {
            return LocalDate.parse(date, dtfBrazilian);
        } catch(DateTimeParseException e) {
            System.out.println("Data inválida");
        }
        return null;
    }
    
}
