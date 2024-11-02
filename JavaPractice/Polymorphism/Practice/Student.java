// package Practice;

public class Student extends Person{
    private int age;

    public Student(int age){
        super(20);
        this.age = age;
    }

    public Student(){
        super(20);
    }

    @Override
    public void age(){
        System.out.println("Student  age : " + age);
    }
}
