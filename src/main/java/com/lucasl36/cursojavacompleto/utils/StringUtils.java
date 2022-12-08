package com.lucasl36.cursojavacompleto.utils;

/**
 *
 * @author Lucas Lopes
 */
public class StringUtils {
    
    public static String getPositionWithSuffix(int position) {
        String posSuffix = position == 1 ? "1st" 
                    : position == 2 ? "2nd" 
                    : position == 3 ? "3rd" 
                    : String.valueOf(position) + "th";
        return posSuffix;
    }
    
}
