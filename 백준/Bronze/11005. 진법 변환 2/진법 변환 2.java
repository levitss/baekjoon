import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void calc(int n, int B) {
//        StringBuilder sb = new StringBuilder();
        List<Character> sb = new LinkedList<>();
        while (n>0) {
            int result = n % B;
            if (result < 10) {
                char c = (char) (result + '0');
                sb.add(0, c);
            } else {
                char c = (char) (result -10+'A');
                sb.add(0, c);
            }
            n/=B;

        }
        for (int i = 0; i < sb.size(); i++) {
            System.out.print(sb.get(i));
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        //A는 10 ~~Z는 35
        //4554654 B진법으로
        //%B 후 결과를 해당 자리수 주고 /B 반복?
        calc(n,B);
    }
}