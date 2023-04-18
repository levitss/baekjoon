import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //동명이인이 없음
    //enter/leave
    //맵 이름이 키
    public static Map<String, String> map = new HashMap<>();


    public static void leave(String name){
        map.remove(name);
    }
    public static List maptoList(){
        List list=new ArrayList<>(map.keySet());
        Collections.sort(list);
        return list;
    }

    public static void put(String name,String stat) {
        map.put(name, stat);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String a, b;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = st.nextToken();
            b = st.nextToken();
            if (b.equals("leave")) {
                leave(a);
                continue;
            }
            put(a, b);
        }
        List<String> list=maptoList();
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);


    }
}