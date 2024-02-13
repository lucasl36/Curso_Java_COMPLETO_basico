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
    
    private static int defaultRoomQuantity = 10;
    private Rooms boardingHouseRooms;
    
    public Exercise_10_93_1() {
        super("Exercise mod. 10 lesson 93 num. 1 - Boarding House Challenge");
    }
    
    @Override
    public void execute() {
        try {
            this.boardingHouseRooms = new Rooms(defaultRoomQuantity);
        } catch(Exception e) {
            System.out.println("Invalid room quantity!");
        }
        int option;
        do {
            System.out.println("Welcome to the Cherry Blossom Boarding House!");
            System.out.println("Choose an option:");
            System.out.println("1. Rent a room");
            System.out.println("2. Checkout from room");
            System.out.println("3. Check for any room availability");
            System.out.println("4. Check for specific room avaiability");
            System.out.println("5. List rooms");
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
                    checkForAnyRoomAvaiability();
                    break;
                }
                case 4: {
                    checkForSpecificRoomAvaiability();
                    break;
                }
                case 5: {
                    listRooms();
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
        do {
            System.out.println("Any room will do? (Y/N)");
            
            List<Room> avaiableRooms = this.boardingHouseRooms.listFilteredRooms(true);
            System.out.print("Avaible rooms: ");
            avaiableRooms.stream().forEach(room -> System.out.printf("%d ", room.getNumber()));
        }while(true);
    }
    
    
    private void checkoutFromRoom() {
        
    }
    
    private void checkForAnyRoomAvaiability() {
        
    }
    
    private void checkForSpecificRoomAvaiability() {
        
    }
    
    private void listRooms() {
        
    }
    
}
