import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a = 0;
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {

            String str = br.readLine();
            if (extracted(a, str)) {
                sb.append("NO").append("\n");
                continue;
            }
            sb.append("YES").append("\n");
        }
        System.out.println(sb);

    }

    private static boolean extracted(int a, String str) {
        for (int j = 0; j < str.length() ; j++) {

            if (str.charAt(j) == '(') {
                a++;
            } else {
                a--;
            }
            if (a < 0) {
                return true;
            }
        }
        if (a == 0) return false;
        else return true;





    }
}