import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    // 245의 분해합은 256(=245+2+4+5) 245는 256의 생성자
    //주어진 값의 가장 작은 생성자를 구하기
    public static int solve(String str) {
        //x + a+b+c    a,b,c는 0~9의 값 x.charAt(0)
        int t = Integer.parseInt(str);
        int e=t-str.length()*9;
        int sum = 0;
        for (int i = e; i < t; i++) {
            String s=String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                sum+=s.charAt(j)-'0';
            }
            int result=i+sum;
            if (result == Integer.parseInt(str)) {
                return i;
            } else {
                sum=0;
            }
        }
return 0;
   }
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_str=br.readLine();
        System.out.println(solve(input_str));


    }
}






