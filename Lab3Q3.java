import java.util.Stack;

/**
 * Created by TGC on 19/03/2022.

public class Lab3Q3 {
    static int pres(char Char) {
        if (Char == '+' || Char == '-')
            return 1;
        if (Char == '*' || Char == '/')
            return 2;
        if (Char == '^')
            return 3;
        return 0;
    }

    static String Expression(String example) {
        String Result = new String("");
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < example.length(); i++) {
            char x = example.charAt(i);
            if (Character.isLetterOrDigit(x))
                Result += x;
            else if (x == '(')
                stack.push(x);
            else if (x == ')') {
                while (!stack.isEmpty() && stack.top() != '(')
                    Result += stack.pop();
                stack.pop();
            } else {
                while (!stack.isEmpty() && pres(x) <= pres(stack.top())) {
                    Result += stack.pop();
                }
                stack.push(x);
            }
            while (!stack.isEmpty())
                if (stack.top() == '(')
                    return "";
                Result += stack.pop();
            }
            return Result;
        }

    public static void main(String[] args) {
        String example = "((5+2)*(8-3))/4";
        System.out.println(Expression(example));
    }
}
 */