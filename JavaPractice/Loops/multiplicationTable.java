import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number whose you want table:");
        int tab = sc.nextInt();
        System.out.print("To what extent you want table:");
        int limit = sc.nextInt();
        for (int i = 1; i <= limit ; i++) {
            System.out.println(tab+"x"+i+"="+tab*i);
        }
        

    }
}
