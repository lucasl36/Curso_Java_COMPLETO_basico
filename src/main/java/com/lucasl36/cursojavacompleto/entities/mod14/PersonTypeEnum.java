package com.lucasl36.cursojavacompleto.entities.mod14;

import java.util.*;

/**
 *
 * @author Lucas Lopes
 */
public enum PersonTypeEnum {

    NATURAL("N", "Natural"),
    LEGAL("L", "Legal");
    
    private final String code;
    private final String type;
    
    PersonTypeEnum(String code, String type) {
        this.code = code;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public static PersonTypeEnum findByCode(String filteredCode) {
        Optional<PersonTypeEnum> personTypeEnum = Arrays.stream(PersonTypeEnum.values())
                .filter(personType -> personType.getCode().equals(filteredCode.toUpperCase()))
                .findFirst();
        if(personTypeEnum.isPresent()) {
            return personTypeEnum.get();
        } 
        return null;
    }
    
}
