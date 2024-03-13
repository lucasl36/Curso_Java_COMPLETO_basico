package com.lucasl36.cursojavacompleto.entities.mod10.boardinghouse;

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
        student.enterRoom(this);
    }
        
    public void emptyRoom() {
        student.leaveRoom();
        this.student = null;
    }
        
    public boolean isRoomOccupied() {
        return this.student != null;
    }

    public Integer getNumber() {
        return number;
    }
    
    public Student getStudent() {
        return student;
    }
    
}
