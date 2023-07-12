import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        StringBuffer sb = new StringBuffer();
        while (true) {
            str = br.readLine();
            if (str.equals("0")) {
                break;
            }
            sb.append(check(str, sb) ? "yes\n" : "no\n");
        }
        System.out.println(sb);
        br.close();
   }

    private static boolean check(String str, StringBuffer sb) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        }
        return true;
    }
}
