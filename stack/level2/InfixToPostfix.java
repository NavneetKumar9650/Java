package stack.level2;

import java.util.*;

public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) { // If it's a digit
                String s = "" + ch;
                val.push(s);
            } else if (ch == '(') { // Handle opening parenthesis
                op.push(ch);
            } else if (ch == ')') { // Handle closing parenthesis
                // Process until '(' is found
                while (!op.isEmpty() && op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = v1 + v2 + o;
                    val.push(t);
                }
                if (!op.isEmpty() && op.peek() == '(') {
                    op.pop(); // Remove '(' from stack
                }
            } else { // Handle operators +, -, *, /
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    char operator = op.pop();
                    String v2 = val.pop();
                    String v1 = val.pop();
                    String t = v1 + v2 + operator;
                    val.push(t);
                }
                op.push(ch); // Push current operator to stack
            }
        }

        // Final evaluation of remaining operators in the stack
        while (!op.isEmpty()) {
            char operator = op.pop();
            String v2 = val.pop();
            String v1 = val.pop();
            String t = v1 + v2 + operator;
            val.push(t);
        }

        System.out.println("Postfix Expression: " + val.peek()); // Print the final postfix expression
    }

    // Method to define operator precedence
    public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return -1; // For non-operators
    }

    // Method to apply an operation on two operands (not used in this context)
    public static int applyOperation(int v1, int v2, char operator) {
        switch (operator) {
            case '+':
                return v1 + v2;
            case '-':
                return v1 - v2;
            case '*':
                return v1 * v2;
            case '/':
                if (v2 == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return v1 / v2;
            default:
                return 0;
        }
    }
}
