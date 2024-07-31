import java.util.Scanner;
public class daimond {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Length of the daimond : ");
      int len = sc.nextInt();
    //   len/=2;
      int i;
      for ( i = 1; i <= (len/2); i++) {
        for (int j = i; j < (len/2); j++) {
            System.out.print(" ");
        }
        for (int k = 1 ; k <= i; k++) {
            System.out.print("* ");   
        }
        System.out.println();
      }
    }
}
