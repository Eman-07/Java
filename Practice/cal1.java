import java.util.Scanner;

public class cal1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("This is a simple 4 functional calcuator which use only two operands");
        System.out.println("Select operator + - * / ");

        char operator;
        System.out.print("Selection : ");
        operator = ip.next().charAt(0);

        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            System.out.println("Yakki na lgao boss");
            System.exit(0);
        }
        // System.out.println("next");
        // taking operands
        System.out.print("Enter 1st operand :");
        int op1 = ip.nextInt();
        System.out.print("Enter 2nd operand :");
        int op2 = ip.nextInt();

        switch (operator) {
            case '+':
                System.out.println(op1 + "+" + op2 + "=" + (op1 + op2));
                break;
            case '-':
                System.out.println(op1 + "-" + op2 + "=" + (op1 - op2));
                break;
            case '*':
                System.out.println(op1 + "*" + op2 + "=" + (op1 * op2));
                break;
            case '/':
                System.out.println(op1 + "/" + op2 + "=" + (op1 / op2));
                break;

            default:
                System.out.println("Kuch tou garbar hai daya");
                break;
        }
    }
}
