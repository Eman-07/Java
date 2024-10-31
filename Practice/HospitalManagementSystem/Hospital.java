package HospitalManagementSystem;

import java.util.Scanner;

public class Hospital {
    private String hospitalName;
    private Wards[] wards;
    private Doctor[] doctors;
    private Patient[] patients;

    private int numberOfWards;



    private int numberOfPatients;
    private int numberOfDoctors;


    public static int wardCount = 0;

    public Hospital(String hospitalName, int numberOfWards , int numberOfDoctors) {
        this.hospitalName = hospitalName;
        this.numberOfWards = numberOfWards;
    }

    public String getHospitalName() {
        return hospitalName;
    }
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getNumberOfWards() {
        return numberOfWards;
    }

    public void setNumberOfWards(int numberOfWards) {
        this.numberOfWards = numberOfWards;
    }

    public void createNewWard(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Creating a new ward");
        System.out.println("Enter name for the ward : ");
        String name = sc.nextLine();
        Wards newWard = new Wards(name);
    }

}
