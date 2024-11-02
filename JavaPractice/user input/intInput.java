import java.util.Scanner;
public class intInput{
    public static void main(String[] args){
        Scanner ip = new   Scanner(System.in);
        System.out.print("Enter an integer number:");
        int num = ip.nextInt();
        System.out.println("You have entered : " +num);
    }
}