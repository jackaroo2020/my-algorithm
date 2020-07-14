package c01;

import java.util.Stack;

/**
 * @author LT
 * @description 描述
 * @date 2020/7/12
 */
public class StackDemo {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack);
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
