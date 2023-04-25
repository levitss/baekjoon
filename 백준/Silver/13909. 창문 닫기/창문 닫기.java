import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main {

    public static int sifter(int n) {
        int cnt=0;
        for (int i = 1; i*i <=n; i++) {
            cnt++;
//열려 있으면 닫고 닫혀 있으면 연다.
            //열고 닫고 .. 짝수이면 닫힘
            //소인수의 개수가 홀수가 되는 수=제곱수
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//        sb.append(sifter(Integer.parseInt(br.readLine())));
        int n = Integer.parseInt(br.readLine());
        sb.append((int)Math.floor(Math.sqrt(n)));
        System.out.println(sb);
    }
}
//메모리 부족