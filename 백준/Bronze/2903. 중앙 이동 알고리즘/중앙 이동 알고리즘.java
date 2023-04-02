import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //n이 1일때 9
        int init=3;
        int result=0;
        for (int i = 0; i < n; i++) {
            result = (int) Math.pow(init, 2);
            init+=(init-1);
        }
        System.out.println(result);

    }
}