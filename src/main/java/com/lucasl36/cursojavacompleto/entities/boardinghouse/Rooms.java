package com.lucasl36.cursojavacompleto.entities.boardinghouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author Lucas Lopes
 */
public class Rooms {

    private List<Room> rooms;
        
    public Rooms(int quantity) throws Exception {
        if(quantity <= 0) {
            throw new Exception("It's not possible to create an empty list of negative elements");
        }
        rooms = new ArrayList<Room>();
        for(int index = 1; index <= quantity; index++ ) {
            rooms.add(new Room(index));
        }
    }
        
    public Room getRoomByNumber(Integer number) {
        Optional<Room> findedRoom = this.rooms.stream()
                .filter(room -> room.getNumber() == number)
                .findFirst();
        if(findedRoom.isPresent()) {
            return findedRoom.get();
        } else {
            return null;
        }
    }
    
    public Room checkIfAnyRoomIsAvaiable() {
        Optional<Room> findedRoom = rooms.stream()
                .filter(room -> room.isRoomOccupied() == false)
                .findAny();
        if(findedRoom.isPresent()) {
            return findedRoom.get();
        } else {
            return null;
        }
    }
        
    public boolean checkIfSpecificRoomIsAvaiable(Integer roomNumber) {
        return rooms.stream()
                .filter(room -> room.getNumber() == roomNumber)
                .findFirst()
                .map(Room::isRoomOccupied)
                .map(occupied -> occupied == true)
                .orElse(false);
    }
        
    public List<Room> listRoomsByAvaiability(boolean avaiability) {
        List<Room> filteredRooms = this.rooms.stream()
                .filter(room -> room.isRoomOccupied() == avaiability)
                .collect(Collectors. toList());
        return filteredRooms;
    }
    
}
