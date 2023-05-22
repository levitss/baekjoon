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
        int a;
        int b;
        int num=0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            a = Integer.parseInt(br.readLine());
            if (a == 0) break;
            a *= 3;

            if (a % 2 == 0) {
                sb.append(++num + ". even ");
                a = (((a)/2)*3)/9;
                sb.append(a).append("\n");
            } else {
                sb.append(++num + ". odd ");
                a = (((a + 1)/2)*3)/9;
                sb.append(a).append("\n");
            }
        }
        System.out.println(sb);
    }
}