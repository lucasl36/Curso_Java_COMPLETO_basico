package com.lucasl36.cursojavacompleto.helpers;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author Lucas Lopes
 */
public class TimeHelper {

    public static DateTimeFormatter dtfBrazilian = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static DateTimeFormatter dtfBrazilianWithTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
}
