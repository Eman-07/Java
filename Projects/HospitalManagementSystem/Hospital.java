package HospitalManagementSystem;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hospital {
    private String hospitalName;
    private Patient[] patients;

    private int numberOfWards;
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


    public void hospitalManagement() {
        System.out.println("Welcome to Hospital Management System");
        System.out.println("""
                1)Display Hospital Information
                2)Manage Doctors
                3)Manage Patients
                4)Manage Wards
                """);
        System.out.print("Select : ");
        int selection = (new Scanner(System.in)).nextInt();
        switch (selection) {
            case 1:
                hospitalInformation();
                break;
            case 2:
                break;

        }
    }



    public void hospitalInformation() {
        System.out.printf("""
                Hospital Name : %s
                Number of Wards : %d
                Number of Doctors : %d
                Number of Patients : %d 
                """,hospitalName,numberOfWards,numberOfDoctors);
    }

    public void managePatients() {

    }
    public void createNewWard(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Creating a new ward");
        System.out.println("Enter name for the ward : ");
        String name = sc.nextLine();
        Wards newWard = new Wards(name);
    }

}
