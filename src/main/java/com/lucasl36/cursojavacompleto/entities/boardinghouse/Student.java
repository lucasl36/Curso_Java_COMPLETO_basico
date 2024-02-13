package com.lucasl36.cursojavacompleto.entities.boardinghouse;

/**
 *
 * @author Lucas Lopes
 */
public class Student {
    
    private String name;
    private String email;
    private Integer room;
        
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
        this.room = null;
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

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }
      
}
