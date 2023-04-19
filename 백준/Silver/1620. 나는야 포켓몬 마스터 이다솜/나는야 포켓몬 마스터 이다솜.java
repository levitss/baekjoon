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
        Map<Integer,String> map = new HashMap();
        Map<String, Integer> reversemap = new HashMap();
        String sstr;
        for (int i = 0; i < n; i++) {
            sstr = br.readLine();
            map.put(i + 1, sstr);
            reversemap.put(sstr,i+1);
        }
        //입력끝
        StringBuilder sb = new StringBuilder();
        String str = null;
        int a;
        for (int i = 0; i < n2; i++) {
            str = br.readLine();
            try {
                a=Integer.parseInt(str);
                sb.append(map.get(a)).append("\n");
            } catch (NumberFormatException e) {
                sb.append(reversemap.get(str)).append(("\n"));
            }
        }
        System.out.println(sb);

    }

}