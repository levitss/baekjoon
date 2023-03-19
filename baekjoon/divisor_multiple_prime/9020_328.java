import java.io.*;
/*
방법 1 소수 배열 만들어서 해당되면 소수로    212
방법 2 매번 검사해서 소수판별               328
 */


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num;

        boolean bo = false,boo = false;
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());
            int a=num/2;
            int b=num/2;

            while (true) {//둘다 소수일때 break
                bo = false;
                boo = false;
                for (int z = 2; z <= Math.sqrt(a); z++) {
                    if (a % z == 0) {
                        bo = true;
                        break;
                    }
                }
                for (int x = 2; x <= Math.sqrt(b); x++) {
                    if (b % x == 0) {
                        boo = true;
                        break;
                    }
                }
                if (!bo && !boo) {
                    if (a > b) {
                        bw.append(b + " " + a + "\n");
                    }
                    bw.append(a + " " + b + "\n");
                    break;
                } else {
                    a--;
                    b++;
                }


            }

        }
        bw.flush();
        bw.close();
        br.close();
    }
}





