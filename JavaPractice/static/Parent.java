public class Parent {



    static int number = 456;


    static {
        System.out.println("number"+number);
    }
    public void something(){
        System.out.println("something in parent");
    }

    public static void getName(){
        System.out.println("Parent static method");
    }
}
