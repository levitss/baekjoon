import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
//        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        final String E = "ENTER";
        Map<String,Boolean> map = new HashMap();
        map.put("ChongChong", true);
        String str = null;
        String str1 = null;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            str = st.nextToken();
            str1 = st.nextToken();
            if (!map.containsKey(str)) {
                map.put(str, false);
            }
            if (!map.containsKey(str1)) {
                map.put(str1, false);
            }
            if (map.get(str) | map.get(str1)) {
                map.put(str, true);
                map.put(str1, true);
            }

        }
        int cnt=0;
        for (Boolean value : map.values()) {
            if (value) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
