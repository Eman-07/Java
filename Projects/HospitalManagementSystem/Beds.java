package HospitalManagementSystem;

public class Beds {
    private int bedNumber;

    public Beds(int bedNumber) {
        this.bedNumber = bedNumber;
    }


    public void display(){
        System.out.println("\t\tBed Number: " + bedNumber);
    }

}
