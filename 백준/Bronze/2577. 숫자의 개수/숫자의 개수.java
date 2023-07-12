import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //곱한 값
        int result=1;
        for (int i = 0; i < 3; i++) {
            result *=Integer.parseInt(br.readLine());
        }
        //자리수
        int digits = (int) (Math.log10(result) + 1);

        int arr[] = new int[10];

        for (int i = 0; i < digits; i++) {
            int i1 = (result / (int) Math.pow(10, i)) % 10;
            arr[i1]++;
        }
        StringBuffer sb = new StringBuffer();
        for (int i:arr
             ) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);

    }
}
