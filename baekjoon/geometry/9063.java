import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max_x = Integer.MIN_VALUE, max_y =  Integer.MIN_VALUE;
        int min_x = Integer.MAX_VALUE ,min_y = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            StringTokenizer      st = new StringTokenizer(br.readLine(), " ");
            int            x = Integer.parseInt(st.nextToken());
            int         y = Integer.parseInt(st.nextToken());
            max_x = Math.max(max_x, x);
            max_y = Math.max(max_y, y);
            min_x = Math.min(min_x, x);
            min_y = Math.min(min_y, y);

        }

        System.out.print((max_x - min_x) * (max_y - min_y));

    }

}




