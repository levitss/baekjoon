import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        List<Integer> list = new LinkedList();
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            list.add(Integer.parseInt(st.nextToken()));
            list.add(Integer.parseInt(st.nextToken()));
            list.add(Integer.parseInt(st.nextToken()));

            if (list.get(0) == 0 && list.get(1) == 0 && list.get(2) == 0) {
                break;
            }
            list.sort(Comparator.naturalOrder());
            if (Math.pow(list.get(2), 2) == Math.pow(list.get(1), 2) + Math.pow(list.get(0), 2)) {
                sb.append("right").append("\n");
            }else sb.append("wrong").append("\n");
            list.clear();
        }
        System.out.println(sb);
        

    }
}