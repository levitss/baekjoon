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
        Map<String, Integer> map = new HashMap();
        int cnt=0;
        Set<String> set = new HashSet();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
String str;
        List list = new ArrayList();
        for (int i = 0; i < n2; i++) {
            str = br.readLine();
            if (set.contains(str)) {
                cnt++;
                list.add(str);
            }
        }
        Collections.sort(list);
        list.forEach(m->sb.append(m).append("\n"));
        System.out.println(cnt);
        System.out.println(sb);

    }

}