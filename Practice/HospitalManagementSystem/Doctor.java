package HospitalManagementSystem;

public class Doctor {
    private String name;
    private int age;
    private Gender gender;
    private String speciality;
    private String mail;

    public Doctor(String name, int age, Gender gender, String speciality, String mail) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.speciality = speciality;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void displayInfo(){
        System.out.println("------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Speciality: " + speciality);
        System.out.println("Mail: " + mail);
        System.out.println("------------------");

    }
}
