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

    public static int sifter(int n) {
        boolean prime[] = new boolean[n+1];
        //소수면 false
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i*i <=n; i++) {
            if (!prime[i]) {//소수일때
                //j+=i 는 i의 배수
                //i*i인건 그 전것들은 이전 작업에서 지워지기 때문
                for (int j = i * i; j <=n; j += i) {
                    prime[j] = true;
                }
            }
        }
        int cnt=0;
        for (int i = 2; i <= n-i; i++) {
            if (!prime[i]&&!prime[n-i]) {
                cnt++;
            }
        }
        return cnt;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i1;
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <n; i++) {
            i1 = Integer.parseInt(br.readLine());
            sb.append(sifter(i1)).append("\n");
        }
        System.out.println(sb);
    }
}
