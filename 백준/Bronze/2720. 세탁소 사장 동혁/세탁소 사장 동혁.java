import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int change;
        int Q,D,N,P;
        for (int i = 0; i < n; i++) {
            change = Integer.parseInt(br.readLine());
            Q = change /25;
            D = (change % 25) / 10;
            N =  ((change % 25) % 10) / 5;
            P = ((change % 25) % 10) % 5;
            sb.append(Q).append(" ").append(D).append(" ").append(N).append(" ").append(P).append("\n");
        }
        System.out.println(sb);

    }
}