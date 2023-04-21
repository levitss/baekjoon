import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
//두 분모의 최소공배수를 구하고 몇배인지 구하고 곱하고 더하기
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int i1 = Integer.parseInt(st2.nextToken());
        int i2 = Integer.parseInt(st2.nextToken());//분모
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int i3 = Integer.parseInt(st1.nextToken());
        int i4 = Integer.parseInt(st1.nextToken());//분모

        int ii = lcm(i2, i4);
        int i = (ii / i2)*i1+(lcm(i2, i4) / i4)*i3;
//더한 분모 분자 공약수가 존재하면 나누기
            int x = gcd(ii, i);
            ii/=x;
            i/=x;


        StringBuilder sb = new StringBuilder();
        sb.append(i+" ").append(ii);
        System.out.println(sb);

    }
}
