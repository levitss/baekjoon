import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static Long gcd(Long a, Long b) {//최대공
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }

    public static Long lcm(Long a, Long b) {//최소
        return (a * b) / gcd(a, b);
        //a*b=L*G
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        Long i1 = Long.parseLong (st1.nextToken());
        Long i2 = Long.parseLong(st1.nextToken());

        //lcm 출력
        //큰수에 대한 변수를 Long
        //1000보다 큼
//        StringBuilder sb = new StringBuilder();
        System.out.println(lcm(i1, i2));


    }
}
