package com.lucasl36.cursojavacompleto.entities.mod14;

import java.util.*;

/**
 *
 * @author Lucas Lopes
 */
public enum ProductTypeEnum {

    USED("U", "Used"),
    IMPORTED("I", "Imported"),
    COMMON("C", "Common");
    
    private final String code;
    private final String name;
    
    ProductTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
     
    public static ProductTypeEnum findByCode(String filteredCode) {
        Optional<ProductTypeEnum> productTypeEnum = Arrays.stream(ProductTypeEnum.values())
                .filter(productType -> productType.getCode().equals(filteredCode.toUpperCase()))
                .findFirst();
        if(productTypeEnum.isPresent()) {
            return productTypeEnum.get();
        } 
        return null;
    }
    
}
