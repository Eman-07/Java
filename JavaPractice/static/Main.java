public class Main {

    public static void main(String[] args) {


        System.out.println(Parent.number);
        Parent parent = new Parent();
        parent.getName();

        Child child = new Child();
        child.getName();

        Parent child2 = new Child();
        child2.getName();


        System.out.println("--------");
        parent.something();
        child.something();
        child2.something();



    }
}
