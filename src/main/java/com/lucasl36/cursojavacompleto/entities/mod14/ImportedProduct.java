package com.lucasl36.cursojavacompleto.entities.mod14;

/**
 *
 * @author Lucas Lopes
 */
public class ImportedProduct extends Product {

    private Double customFee;

    public ImportedProduct(Double customFee, String name, Double price) {
        super(name, price);
        this.customFee = customFee;
    }

    @Override
    public String priceTag() {
        return String.format("%s $ %.2f", this.name, totalPrice());
    }    
    
    public Double totalPrice() {
        return this.price + this.customFee;
    }
    
    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }    
    
}
