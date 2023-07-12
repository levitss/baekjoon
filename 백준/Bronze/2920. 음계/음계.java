import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//8개 입력 순서대로 ascending, 역순 descending, 이도저도 아니면 mixed
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        System.out.println(extracted(st));

    }

    private static String extracted(StringTokenizer st) {
        int a, b = 0;

        a = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 7; i++) {

            b = Integer.parseInt(st.nextToken());
            if (a - b > 1 | a - b < -1) {
                return "mixed";
            }
            a = b;

        }
        if (b == 1) {
            return "descending";
        } else {
            return "ascending";
        }

    }
}
