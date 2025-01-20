package com.lucasl36.cursojavacompleto.entities.mod14;

import com.lucasl36.cursojavacompleto.helpers.TimeHelper;
import java.time.LocalDate;

/**
 *
 * @author Lucas Lopes
 */
public class UsedProduct extends Product {
    
    private LocalDate manufacturedDate;

    public UsedProduct(LocalDate manufacturedDate, String name, Double price) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public String priceTag() {
        return String.format("%s $ %.2f (Manufactured on %s)", this.name, this.price, TimeHelper.convertLocalDateToString(this.manufacturedDate));
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

}
