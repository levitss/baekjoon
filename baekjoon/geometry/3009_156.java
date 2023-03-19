import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a,b;
        Set y = new HashSet();
        Set x = new HashSet();
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(st.nextToken());
            b= Integer.parseInt(st.nextToken());

            if (!x.add(a)) {//입력이 안되면 false
                x.remove(a); //중복되는거 제거
            }
            if (!y.add(b)) {//입력이 안되면 false
                y.remove(b); //중복되는거 제거
            }
        }

        System.out.println(x.iterator().next() + " " + y.iterator().next());


    }

}




