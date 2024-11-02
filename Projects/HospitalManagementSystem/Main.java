package HospitalManagementSystem;

import com.sun.source.doctree.DocCommentTree;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
//        Hospital Abc = new Hospital("Abc",5,10);
//        Abc.hospitalManagement();

        Doctor d = new Doctor("Umar", 40, Gender.MALE,"Surgeon","Abs@gmail.com");
        Patient p = new Patient("Ali", 40, Gender.MALE,"Fever",d,"MMA",12);

        p.displayPatientInfo();
    }
}
