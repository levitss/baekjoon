import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<String, Integer> map = new HashMap();
        String str;
        for (int i = 0; i < n1; i++) {
            str = st.nextToken();
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
                continue;
            }
            map.put(str,1);

        }
        StringBuilder sb = new StringBuilder();
        int n2 = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n2; i++) {
            str = st2.nextToken();
            if (!map.containsKey(str)) {
                sb.append("0").append(" ");
                continue;
            }
            sb.append(map.get(str)).append(" ");


        }


        System.out.println(sb);

    }

}