import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int a= Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());



        StringBuffer sb = new StringBuffer();
        sb.append("<");
        List<Integer> list=new LinkedList<>();
        for (int i = 0; i <a; i++) {
            list.add(i+1);
        }
        int idx = list.size();
        while (!list.isEmpty()) {
            idx = (idx + (b - 1)) % list.size();
            sb.append(list.remove(idx)).append(", ");

        }
        sb.delete(sb.length()-2,sb.length());
        sb.append(">");

        System.out.println(sb);
    }

}
