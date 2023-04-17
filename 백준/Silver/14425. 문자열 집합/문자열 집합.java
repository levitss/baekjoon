import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        int count=0;
        Set<String> set2 = new HashSet();
        for (int i = 0; i < n2; i++) {
            if (set.contains(br.readLine())) {
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();
            sb.append(count);

        System.out.println(sb);
    }

}