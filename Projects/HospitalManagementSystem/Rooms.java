package HospitalManagementSystem;
import java.util.Scanner;

public class Rooms {
    private String roomID;
    private Beds beds[] = new Beds[2];
    public static int roomCounter = 0;

    public Rooms(String roomID) {
        this.roomID = roomID;
        for (int i = 0; i < 2; i++) {
            beds[i] = new Beds(i);
        }
        roomCounter++;
    }



    public String getRoomID() {
        return roomID;
    }

    public void displayRooms(){
        System.out.println("\tRoom ID: " + roomID);
    }
    public void displayRoomsBeds(){
//        displayRooms();
        for (int i = 0; i < 2; i++) {
            beds[i].display();
        }
    }

}
