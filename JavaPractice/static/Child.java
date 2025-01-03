public class Child extends Parent{

    public static void getName(){
        System.out.println("Child static method");
    }



    @Override
    public void something(){
        System.out.println("something in child");
    }




    static class ChildA{


        static {
            System.out.println("ChildA static method");
        }
    }


}


class ChildB{

}