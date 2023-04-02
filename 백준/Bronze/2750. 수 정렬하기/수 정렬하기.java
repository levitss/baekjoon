import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean barr[] = new boolean[2001];
        int input=0;
        for (int i = 0; i < n; i++) {
            input = Integer.parseInt(br.readLine());
            barr[input+1000] = true;
        }
        for (int i = 0; i < 2001; i++) {
            if (barr[i]) {

                sb.append(i-1000);
                sb.append("\n");

            }
        }
        System.out.println(sb);

    }
}