import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    //    public static int gcd(int a, int b) {
//        if (b == 0) return a;
//        if (a % b == 0) return b;
//        return gcd(b, a % b);
//    }
//
//    public static int lcm(int a, int b) {
//        return (a * b) / gcd(a, b);
//    }

//    public static List<Integer> sifter(int n) {
//        boolean prime[] = new boolean[n+1];
//        //소수면 false
//            prime[0] = true;
//            prime[1] = true;
//        for (int i = 2; i <= n; i++) {
//            //루트 n 까지만 계산해도 됨
//            //여기선 입력을 루트 n으로
//            if (!prime[i]) {//소수일때
//                //j+=i 는 i의 배수
//                //i*i인건 그 전것들은 이전 작업에서 지워지기 때문
//                for (int j = i * i; j <= n; j += i) {
//                    prime[j] = true;
//                }
//            }
//        }
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            if (!prime[i]) {
//                list.add(i);
//            }
//        }
//        return list;
//    }


//정수 n(0 ≤ n ≤ 4*109)가 주어졌을 때, n보다 크거나 같은 소수 중 가장 작은 소수 찾는 프로그램을 작성하시오.
    //소수 리스트를 만들고 해당 수 다음 소수를 출력?
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            var bi = new BigInteger(br.readLine());
            if (bi.isProbablePrime(10)) {
                sb.append(bi).append("\n");
            }else
                sb.append(bi.nextProbablePrime()).append("\n");
        }
        System.out.println(sb);
    }
}
