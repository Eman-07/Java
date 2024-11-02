import java.util.*;
public class pyramid {
    public static void main(String[] args) {
        System.out.print("Enter Length of pyramid : ");
        Scanner sc = new Scanner(System.in);
        int len =  sc.nextInt();

        for (int i = 1; i <= len; i++) {
            for (int j = i; j <= len; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
