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

    public static int sifter(int n,int cnt) {
        boolean prime[] = new boolean[2*n+1];
        //소수면 false
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i*i <=2* n; i++) {
            if (!prime[i]) {//소수일때
                //j+=i 는 i의 배수
                //i*i인건 그 전것들은 이전 작업에서 지워지기 때문
                for (int j = i * i; j <=2* n; j += i) {
                    prime[j] = true;
                }
                
                
                //2n 까지 소수 구하기
            }
        }
        for (int i = n+1; i <= 2*n; i++) {
            if (!prime[i]) {
                cnt++;
            }
        }
        return cnt;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i1;
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            i1 = Integer.parseInt(br.readLine());
            if (i1 == 0) {
                break;
            }
            sb.append(sifter(i1, cnt)).append("\n");
        }
        System.out.println(sb);




    }
}
