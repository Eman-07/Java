import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    // JFrame for the calculator window
    private JFrame frame;

    // Textfield to display the input and result
    private JTextField textField;

    // Variables to store the operands and operator
    private double num1 = 0, num2 = 0;
    private String operator = "";
    private boolean isNewOperation = true;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Calculator window = new Calculator();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Calculator() {
        initialize();
    }

    private void initialize() {
        // Setup frame
        frame = new JFrame();
        frame.setBounds(100, 100, 400, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");

        // Panel for the layout
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        // Textfield for input/output
        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.PLAIN, 30));
        frame.getContentPane().add(textField, BorderLayout.NORTH);
        textField.setColumns(10);

        // Buttons for digits and operations
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "Exit"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            // Handle the clear button
            if (command.equals("C")) {
                textField.setText("");
                num1 = num2 = 0;
                operator = "";
                isNewOperation = true;
            }
            // Handle the exit button
            else if (command.equals("Exit")) {
                System.exit(0);
            }
            // Handle the equal button
            else if (command.equals("=")) {
                if (!operator.isEmpty() && !textField.getText().isEmpty()) {
                    num2 = Double.parseDouble(textField.getText());
                    double result = calculate(num1, num2, operator);
                    textField.setText(String.valueOf(result));
                    num1 = result; // store result for potential next operation
                    operator = "";
                    isNewOperation = true;
                }
            }
            // Handle operator buttons (+, -, *, /)
            else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
                if (!textField.getText().isEmpty()) {
                    num1 = Double.parseDouble(textField.getText());
                }
                operator = command;
                textField.setText("");
                isNewOperation = false;
            }
            // Handle number or decimal point buttons
            else {
                if (isNewOperation) {
                    textField.setText(command);
                    isNewOperation = false;
                } else {
                    textField.setText(textField.getText() + command);
                }
            }
        }
    }

    // Method to perform the calculation based on operator
    private double calculate(double num1, double num2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero!");
                    result = 0;
                }
                break;
            default:
                break;
        }
        return result;
    }
}