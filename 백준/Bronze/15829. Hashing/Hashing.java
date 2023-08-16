import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        final long M = 1234567891;
        //입력은 1~26 알파벳 소문자 한정
        long sum = 0;
        long r = 1;
        String s = br.readLine();
        for (int i = 0; i < n; i++) {
            int i1 = s.charAt(i) - 96;
            sum+=(long)(i1 * r)%M;
            r = r * 31 % M;
        }

        System.out.println(sum%M);

    }

}
