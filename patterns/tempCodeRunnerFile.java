import java.util.*;

public class inversePyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Inverse Pyramid : ");
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            for (int j = len; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = len; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}