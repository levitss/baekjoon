import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n ; i++) {
            while (n % i == 0) {
                n/=i;
                sb.append(i+"\n");
            }
        }
        System.out.print(sb);



        }

    }

