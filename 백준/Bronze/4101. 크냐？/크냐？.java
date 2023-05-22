import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int i;
        int g;
        StringBuilder sb = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            i = Integer.parseInt(st.nextToken());
            g = Integer.parseInt(st.nextToken());
            if (i == 0 || g == 0) {
                break;
            }
            if (i > g) {
                sb.append("Yes").append("\n");
            } else sb.append("No").append("\n");


        }
        System.out.println(sb);

    }
}