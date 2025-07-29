package challenging;

import java.util.Stack;
import java.util.HashMap;


public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char c : s.toCharArray()) {
            if (map.containsValue(c)) {
                stack.push(c);
            } else if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Is valid? " + isValid("{[()]}"));    // true
        System.out.println("Is valid? " + isValid("([)]"));      // false
        System.out.println("Is valid? " + isValid("()[]{}"));    // true
        System.out.println("Is valid? " + isValid("((("));       // false
    }
}
