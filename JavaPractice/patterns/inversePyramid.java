import java.util.Scanner;

public class inversePyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Inverse Pyramid : ");
        int len = sc.nextInt();
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= len; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}