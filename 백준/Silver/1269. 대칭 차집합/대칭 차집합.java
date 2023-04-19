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
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");

        Set set = new HashSet();
        for (int i = 0; i < n; i++) {
            set.add(st2.nextToken());
        }
String str;
        for (int i = 0; i < n2; i++) {
            str = st3.nextToken();
            if (set.contains(str)) {
                set.remove(str);
                continue;
            }
            set.add(str);
        }

        System.out.println(
                set.size());
    }
}