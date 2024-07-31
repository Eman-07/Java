import java.util.Scanner;

public class cal1GPT {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        while (true) {
            System.out.println("This is a simple 4 functional calculator which uses only two operands.");
            System.out.println("Select operator: +, -, *, /");
            
            char operator;
            System.out.print("Selection: ");
            operator = ip.next().charAt(0);

            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("Invalid operator. Please select one of +, -, *, /.");
                continue; // Prompt the user again
            }

            // Taking operands
            int op1 = getOperand(ip, "Enter 1st operand: ");
            int op2 = getOperand(ip, "Enter 2nd operand: ");

            switch (operator) {
                case '+':
                    System.out.println(op1 + " + " + op2 + " = " + (op1 + op2));
                    break;
                case '-':
                    System.out.println(op1 + " - " + op2 + " = " + (op1 - op2));
                    break;
                case '*':
                    System.out.println(op1 + " * " + op2 + " = " + (op1 * op2));
                    break;
                case '/':
                    if (op2 != 0) {
                        System.out.println(op1 + " / " + op2 + " = " + (op1 / op2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = ip.next();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        ip.close();
        System.out.println("Calculator program terminated.");
    }

    private static int getOperand(Scanner scanner, String prompt) {
        int operand;
        while (true) {
            System.out.print(prompt);
            try {
                operand = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return operand;
    }
}
