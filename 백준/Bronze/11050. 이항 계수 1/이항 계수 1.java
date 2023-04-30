import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());


        int facN = 1;
        for (int j = n; j > n-r; j--) {
            facN *= j;
        }
        int facR = 1;
        for (int j = r; j >0; j--) {
            facR*= j;
        }
        System.out.println(facN/facR);



//n! /r!(n-r)!


    }
}
