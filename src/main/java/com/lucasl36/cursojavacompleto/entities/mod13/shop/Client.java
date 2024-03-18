package com.lucasl36.cursojavacompleto.entities.mod13.shop;

import com.lucasl36.cursojavacompleto.helpers.TimeHelper;
import java.time.LocalDate;

/**
 *
 * @author Lucas Lopes
 */
public class Client {
    
    private String name;
    private String email;
    private LocalDate birthDate;

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String toString() {
        return name + "(" + email + ") - " + TimeHelper.dtfBrazilian.format(birthDate);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
}
