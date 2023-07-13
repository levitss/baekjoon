import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int n1 = Integer.parseInt(st.nextToken());

        System.out.println(gcd(n, n1));
        System.out.println(lcm(n, n1));


    }
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else return gcd(b, a % b);

    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
