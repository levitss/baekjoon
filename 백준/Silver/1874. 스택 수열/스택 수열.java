import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        int idx = 0; //맨 위에 있는 숫자
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine());
            //입력된 숫자가 맨 위에 있는 숫자보다 크면 push
            while (val > idx) {
                stack.push(++idx);
                sb.append("+").append("\n");
                if (idx > n) {
                    System.out.println("NO");
                    return;
                }
            }
            if (val >= stack.peek()) {
                try {
                    while (val == stack.peek()) {
                        stack.pop();
                        sb.append("-").append("\n");

                    }

                } catch (EmptyStackException e) {
                    continue;
                }

            }else {
                System.out.println("NO");
                return;
            }

        }
        System.out.println(sb);
    }



}