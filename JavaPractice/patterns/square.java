
import java.util.*;
public class square {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the length of square : ");
       int len = sc.nextInt();
       for (int i = 1; i <= len; i++) {
        for (int j = 1; j <= len+2; j++) {
        System.out.print("*");            
        }
        System.out.println();
       }
            
    }
}
