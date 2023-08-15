import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        while (true) {
            String s = br.readLine();
            if (s.equals(".")) {
                break;
            }
            sb.append(extracted(stack, s)).append("\n");
        }
        System.out.println(sb);
    }

    private static String extracted(Stack<Character> stack, String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '['||c=='(') {
                stack.push(c);
            }

            if ( c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    stack.clear();
                    return "no";
                }
                else stack.pop();
            }


            if ( c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    stack.clear();
                    return "no";
                }
                else stack.pop();
            }



        }
        if (stack.isEmpty()) {
            return "yes";
        } else {
            stack.clear();
            return "no";
        }
    }
}

