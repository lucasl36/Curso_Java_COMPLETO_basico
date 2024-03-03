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
            System.out.println("Warning! Invalid room quantity.");
        }
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
        do {
            System.out.println("Any room will do?");
            // Get first empty room
            System.out.println("Choose a room from the list:");
            // List empty rooms
            System.out.println("Which is the number of the room you want?");
            // Check if the room informed is occupied (In case the user inputed it without checking the list)
            // If not occupy the room it has chosen
        }while(true);
    }
    
    
    private void checkoutFromRoom() {
        
    }
   
    private void listRooms() {
        
    }
    
    private void listStudents() {
        
    }
    
}
