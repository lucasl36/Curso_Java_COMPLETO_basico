package com.lucasl36.cursojavacompleto.entities.boardinghouse;

/**
 *
 * @author Lucas Lopes
 */
public class Student {
    
    private String name;
    private String email;
    private Room room;
        
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
        this.room = null;
    }

    public void enterRoom(Room room) {
        this.room = room;
    }
    
    public void leaveRoom() {
        this.room = null;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Room getRoom() {
        return room;
    }
      
}
