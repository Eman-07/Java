package HospitalManagementSystem;

import java.util.Scanner;

public class Wards {
    private String wardName; // every ward will be allocated 10 rooms
    private Rooms[] rooms = new Rooms[5];

    public Wards(String wardName) {
        this.wardName = wardName;
        for (int i = 0; i <5; i++) {
            rooms[i] = new Rooms(String.format(wardName+"_"+i));
        }
        System.out.println("New ward Created successfully");
    }





    public String getWardName() {
        return wardName;
    }

    public void displayWards() {
        System.out.println("-------------------");
        System.out.println("Ward Name: " + wardName);
        System.out.println("-------------------");

    }
    public void displayWardsRooms(){
            displayWards();
            System.out.println("Rooms: ");
            for (int i = 0; i < Rooms.roomCounter; i++) {
                rooms[i].displayRooms();
            }
        System.out.println("-------------------");

        }
    public void displayWardsRoomsBeds() {

        System.out.println("Ward Name: " + wardName);
        System.out.println("------------------");
        System.out.println("Rooms: ");
        for (int i = 0; i < Rooms.roomCounter; i++) {
            rooms[i].displayRooms();
            rooms[i].displayRoomsBeds();
            System.out.println("------------------");
        }


    }

}
