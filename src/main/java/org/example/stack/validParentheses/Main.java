package org.example.stack.validParentheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

    }

    public boolean solution(String s) {
        // all character need to have a pair. So total count should be even
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // push all opening brackets to stack and compare them with closed ones later.
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // if top element in stack is the closing then remove that pair.
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                // if there are cases like }}, ]], )), ([}}]) this will return false
                /*
                Detail of this case: ([}}]) will become valid
                Iteration 1:
                    c = '{'
                    It meets the condition c == '(' || c == '{' || c == '[', so it pushes '{' to the stack.
                Iteration 2:
                    c = '['
                    It meets the condition c == '(' || c == '{' || c == '[', so it pushes '[' to the stack.
                Iteration 3:
                    c = '}'
                    The conditions for ')' and ']' are not met. The condition c == '}' && !stack.isEmpty() && stack.peek() == '{' is checked. Since the top element of the stack is '[', this condition is false, and nothing is popped from the stack.
                Iteration 4:
                    c = '}'
                    The conditions for ')' and ']' are not met. The condition c == '}' && !stack.isEmpty() && stack.peek() == '{' is checked. Now, the top element of the stack is still '[', this condition is false, and nothing is popped from the stack.
                Iteration 5:
                    c = ']'
                    The conditions for ')' and '}' are not met. The condition c == ']' && !stack.isEmpty() && stack.peek() == '[' is checked. Since the top element of the stack is '[', this condition is true, so '[' is popped from the stack.
                Iteration 6:
                    c = '}'
                    The conditions for ')' and ']' are not met. The condition c == '}' && !stack.isEmpty() && stack.peek() == '{' is checked. Now, the top element of the stack is '{', this condition is true, so '{' is popped from the stack.
                    At the end of the loop, the stack is empty, so the function would return true without the last else block. However, this is incorrect, as the input string is not valid. The last else block is necessary to catch cases like this where the string contains a closing bracket without a corresponding opening bracket in the correct order.
                 */
                return false;
            }
        }
        return stack.isEmpty();
    }
}
