import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int calc(String n, int B) {
        int sum=0;
        boolean minus = false;
        if (n.charAt(0) == '-') {
            minus = true;
            n = n.substring(1);//1~n
            //마이너스면 일단 제거 후 나중에 처리
        }


        char[] narr = n.toCharArray();
        int a=0;
        if (B < 10 ) {
            for (int i = 0; i < narr.length; i++) {

                a=narr[narr.length-1-i]-'0';//char to int
                sum+=Math.pow(B,i)*a;
            }

            if (minus) {
                return sum *= -1;
            }
            return sum;
        } else if (B == 10) {
            return Integer.parseInt(n);
        } else {//10진법 이상인 경우 -55
            for (int i = 0; i < narr.length; i++) {

                if (narr[narr.length-1-i]-'0'<10) {
                    a=narr[narr.length-1-i]-'0';
                } else {
                    a=narr[narr.length-1-i]-55;//알파벳의 경우엔
                }
                sum+=Math.pow(B, i)*a;
            }
            if (minus) {
                return sum *= -1;
            }
//1+4+8
            return sum;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String n = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        //A는 10 ~~Z는 35
        //zzzzz 36진법
        //35**0*35+35**1*35~~~
        System.out.println(calc(n, B));
    }
}