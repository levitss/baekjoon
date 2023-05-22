import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
//    static int gdc(int a, int b) {//최대공약수
//        while (a % b != 0) {
//            int i = a % b;
//            a = b;
//            b = i;
//        }
//        return b;
//    }
//    static int lcm(int a, int b) {//최소공배수
//        return a * b / gdc(a, b);
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n;
        int min=Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int j = 0; j < i; j++) {
            n = Integer.parseInt(st.nextToken());
            max = (n > max) ? n : max;
            min = (n < min) ? n : min;
        }
        System.out.println(min * max);

    }
}