package stack.level2;

import java.util.*;

public class infix {
      public static void main(String[] args) {
            String str = "9-(5+3)*4/6";
            Stack<Integer> val = new Stack<>();
            Stack<Character> op = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                  char ch = str.charAt(i);
                  int ascii = (int) ch;

                  if (ascii >= 48 && ascii <= 57) { // If it's a digit
                        val.push(ascii - 48); // Convert char to int and push to value stack
                  } else if (ch == '(') { // Handle opening parenthesis
                        op.push(ch);
                  } else if (ch == ')') { // Handle closing parenthesis
                        // Process until '(' is found
                        while (!op.isEmpty() && op.peek() != '(') {
                              int v2 = val.pop();
                              int v1 = val.pop();
                              char operator = op.pop();

                              if (operator == '-') {
                                    val.push(v1 - v2);
                              } else if (operator == '+') {
                                    val.push(v1 + v2);
                              } else if (operator == '*') {
                                    val.push(v1 * v2);
                              } else if (operator == '/') {
                                    val.push(v1 / v2);
                              }
                        }
                        if (!op.isEmpty() && op.peek() == '(') {
                              op.pop(); // Remove '(' from stack
                        }
                  } else { // Handle operators +, -, *, /
                        while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                              char operator = op.pop();
                              int v2 = val.pop();
                              int v1 = val.pop();
                              val.push(applyOperation(v1, v2, operator));
                        }
                        op.push(ch); // Push current operator to stack
                  }
            }

            // Final evaluation of remaining operators in the stack
            while (!op.isEmpty()) {
                  char operator = op.pop();
                  int v2 = val.pop();
                  int v1 = val.pop();
                  val.push(applyOperation(v1, v2, operator));
            }

            System.out.println(val.peek()); // Print the final result
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

      // Method to apply an operation on two operands
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
