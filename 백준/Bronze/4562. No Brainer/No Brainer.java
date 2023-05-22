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
        int i1 = Integer.parseInt(br.readLine());
        int i;
        int g;
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < i1; j++) {
            st = new StringTokenizer(br.readLine(), " ");
            i = Integer.parseInt(st.nextToken());
            g = Integer.parseInt(st.nextToken());
            sb.append((i < g) ? "NO BRAINS\n" : "MMM BRAINS\n");
        }
        System.out.println(sb);

    }
}