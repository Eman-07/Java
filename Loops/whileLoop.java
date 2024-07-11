import java.util.*;
public class whileLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 2;
        System.out.print("Enter even number to print \"hello world\" \nEnter odd number to exit the program\nSelection : ");
        while (number %2 == 0) {
            number = sc.nextInt();
            if (number %2 !=1) {
                
                System.out.println("hello world");
            }
        }

        System.out.println("Program ended");

    }
}