import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
방법 1 소수 배열 만들어서 해당되면 소수로
방법 2 매번 검사해서 소수판별
 */


public class Main {
    static boolean[] prime = new boolean[10001];
    public static void get_prime() {//소수는 false
        prime[0]=prime[1]=true;
        for (int i = 2; i <= Math.sqrt(prime.length);i++) {
            if (prime[i]) continue;//기본은 false  중복은 패스
            for (int j = i*i; j < prime.length; j += i) {//에라토스테네스의 체 i의 배수를 걸러줌    2 라면 2 제외한 4 6 8
                prime[j] = true;
            }

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int num;
        int t=2;
        get_prime();
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());
            int a=num/2;
            int b=num/2;

            while (true) {//둘다 소수일때 break
                if (!prime[a] && !prime[b]) {
                    if (a > b) {
                        sb.append(b + " " +a + "\n");
                    }
                    sb.append(a + " " + b + "\n");
                    break;
                } else {
                    a--;
                    b++;
                }

            }

        }
        System.out.println(sb);

    }
}



