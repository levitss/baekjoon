import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static int calc(int n) {
        int n3=0;
        int n5=n/5;
        for (; n5 >= 0; n5--) {//n5를 내리면서
            if ((n - 5 * n5) % 3 == 0) {
                n3 = (n - 5 * n5) / 3;
                return n5 + n3;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //N키로 배달해야 할 때 3n 5n    n을 최소화
        //5n을 최대한 채운 다음 하나씩 줄이면서 %3==0인 값을 찾기
        System.out.println(calc(n));
    }
}


