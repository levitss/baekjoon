import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Integer> a = new ArrayList();
        for (int i = 0; i < 3; i++) {
            a.add(Integer.valueOf(st.nextToken()));
        }
        Collections.sort(a);

        for (int j = 0; j < a.size(); j++) {
            System.out.print(a.get(j) + " ");
        }




    }
}