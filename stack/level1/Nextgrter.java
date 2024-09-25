import java.util.*;

public class Nextgrter {

       public static boolean isbalanced(String str) {
              Stack<Character> st = new Stack<>();
              int n = str.length();
              for (int i = 0; i < n; i++) {
                     char ch = str.charAt(i);
                     if (ch == '(') {
                            st.push(ch);
                     } else {
                            if (st.isEmpty()) {
                                   return false;
                            }
                            st.pop(); // Remove the matching '(' for the current ')'
                     }
              }
              // If stack is empty, all parentheses were matched
              return st.isEmpty();
       }

       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              String str = sc.nextLine();
              System.out.println(isbalanced(str)); // Fixed syntax error here
       }
}
