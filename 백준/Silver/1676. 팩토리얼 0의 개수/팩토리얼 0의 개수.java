import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float n = Integer.parseInt(br.readLine());
        //인수중에 5*2가 있으면 0
        int count = 0;
        while (n > 0) {
            if (n % 5 == 0) {
                count++;
            }
            if (n % 25 == 0) {
                count++;
            }
            if (n % 125 == 0) {
                count++;
            }
            n--;
        }
        System.out.println(count);

    }
    


}