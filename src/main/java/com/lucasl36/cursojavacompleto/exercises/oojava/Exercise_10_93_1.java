package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.entities.boardinghouse.*;
import java.util.List;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_10_93_1 extends OOJavaExercise {
    
    // The exercise provides a default room quantity
    private static int defaultRoomQuantity = 10;
    
    private Rooms rooms;
    private Students tenants;
    
    public Exercise_10_93_1() {
        super("Exercise mod. 10 lesson 93 num. 1 - Boarding House Challenge");
        try {
            this.tenants = new Students();
            this.rooms = new Rooms(defaultRoomQuantity);
        } catch(Exception e) {
            System.out.println("Warning! Invalid room quantity.");
        }
    }
    
    @Override
    public void execute() {
        int option;
        do {
            System.out.println("Welcome to the Cherry Blossom Boarding House!");
            System.out.println("Choose an option:");
            System.out.println("1. Rent a room");
            System.out.println("2. Checkout from room");
            System.out.println("3. List rooms by avaiability");
            System.out.println("4. List students by name or email");
            System.out.println("0. Exit");

            option = Main.sc.nextInt();
            Main.sc.nextLine();

            switch(option) {
                case 1: {
                    rentARoom();
                    break;
                }
                case 2: {
                    checkoutFromRoom();
                    break;
                }
                case 3: {
                    listRooms();
                    break;
                }
                case 4: {
                    listStudents();
                    break;
                }
                case 0: {
                    System.out.println("Thanks for your stay!");
                    break;
                }
                default: {
                    System.out.println("There is no such option! Try again...");
                    break;
                }

            }
        } while(option != 0);
        return;
    }
    
    private void rentARoom() {
        
        System.out.println("To rent a room in our boarding house we need some of your information!");
        
        System.out.print("Enter your name: ");
        String name = Main.sc.nextLine();
        System.out.print("Enter your email: ");
        String email = Main.sc.nextLine();
        Student newTenant = new Student(name, email);
        
        String opt;
        Integer num;
        System.out.println("Any room will do? (Y/N)");
        opt = Main.sc.nextLine();
        if(opt.equals("Y")) {
            Room firstEmptyRoom = this.rooms.getFirstEmptyRoom();
            firstEmptyRoom.occupyRoom(newTenant);
            this.tenants.registerStudent(newTenant);
            return;
        }
        
        boolean emptyRoomChosen = false;
        while(!emptyRoomChosen) {
            System.out.println("Choose a number from the list:");
            List<Room> avaiableRooms = this.rooms.listRoomsByAvaiability(true);
            avaiableRooms.forEach(room -> System.out.printf("-- Room #%d\n", room.getNumber()));
            System.out.println("Which is the number of the room you want?");
            num = Main.sc.nextInt();
            Main.sc.nextLine();
            if(!this.rooms.checkIfSpecificRoomIsAvaiable(num)) {
                System.out.println("Unfortunately, this room is already taken!\nPlease choose another one!");
            } else {
                Room chosenRoom = this.rooms.getRoomByNumber(num);
                chosenRoom.occupyRoom(newTenant);
                this.tenants.registerStudent(newTenant);
                emptyRoomChosen = true;
            }
        }
        return;
    }
    
    
    private void checkoutFromRoom() {
        
    }
   
    private void listRooms() {
        System.out.println("Here's a list of all the rooms:");
        List<Room> rooms = this.rooms.getRoomsImmutableList();
        rooms.forEach(room -> {
            System.out.printf("-- Room #%d", room.getNumber());
            if(!room.isRoomOccupied()) {
                System.out.println("is currently EMPTY");
            } else {
                Student roomTenant = room.getStudent();
                System.out.printf("is currently OCCUPIED by %s. Email: %s\n", roomTenant.getName(), roomTenant.getEmail());
            }   
        });
    }
    
    private void listStudents() {
        System.out.println("Here's a list of all the students:");
        List<Student> tenants = this.tenants.getStudentsImmutableList();
        tenants.forEach(tenant -> {
            System.out.printf("-- Tenant %s (Email:%s)", tenant.getName(), tenant.getEmail());
            if(!tenant.hasARoom()) {
                System.out.println(" stayed with us");
            } else {
                System.out.printf(" is currently on room #%d\n", tenant.getRoom().getNumber());
            }
        }); 
    }
    
}
