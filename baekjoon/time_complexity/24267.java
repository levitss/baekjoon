import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        long re = ((n-2)*(n-1)*n)/6;
        System.out.println(re);
        System.out.println(3);

    }
}
