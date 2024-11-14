package HospitalManagementSystem;

public class Patient {
    private String name = "No Name";
    private int age = 0;
    private String disease = "Not Defined";
    private Gender genderType;
    private Doctor docAssigned;
    private String ward;
    private int bedNumber;

    public Patient(String name, int age, Gender gender,String disease, Doctor docAssigned, String ward, int bedNumber) {
        setName(name);
        setAge(age);
        setGenderType(gender);
        setDocAssigned(docAssigned);
        setWard(ward);
        setBedNumber(bedNumber);
    };


    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null)
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
        this.age = age;
    }



    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Gender getGenderType() {
        return genderType;
    }

    public void setGenderType(Gender genderType) {
        this.genderType = genderType;
    }

    public Doctor getDocAssigned() {
        return docAssigned;
    }

    public void setDocAssigned(Doctor docAssigned) {
        this.docAssigned = docAssigned;
    }


    public Patient[] manage(Patient[] patients, Wards[] wards) {
        System.out.println("Patient Management Menu");
        System.out.printf("""
                1)Add Patient
                2)view all Patients
                3)Discard Patient
                """);
        return patients;
    }

    public void displayPatientInfo() {
        System.out.printf("""
                --------------------------------------------
                Patient Information:
                    Name         :       %s
                    Age          :       %d
                    Gender       :       %s
                    Doc Assigned :       %s
                    Disease      :       %s
                    Ward         :       %s
                    Bed Number   :       %d
                --------------------------------------------
                    
                """,getName(),getAge(),getGenderType().type,getDocAssigned().getName(),getDisease(),getWard(),getBedNumber());
    }
}
