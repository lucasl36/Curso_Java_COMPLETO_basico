package com.lucasl36.cursojavacompleto.entities.boardinghouse;

/**
 *
 * @author Lucas Lopes
 */
public class Room {

    private Integer number;
    private Student student;
        
    public Room(int number) {
        this.number = number;
        this.student = null;
    }
        
    public void occupyRoom(Student student) {
        this.student = student;
        student.setRoom(this.number);
    }
        
    public void emptyRoom() {
        student.setRoom(null);
        this.student = null;
    }
        
    public boolean isRoomOccupied() {
        return this.student != null;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    
}
