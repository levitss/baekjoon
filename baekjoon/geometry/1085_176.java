import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int result1,result2;
        if (w - x > x) {
            result1=x;
        }else result1=w-x;

        if (h - y > y) {
            result2=y;
        }else result2=h-y;
        if (result1 > result2) {
            System.out.println(result2);
        } else {
            System.out.println(result1);
        }







    }

}




