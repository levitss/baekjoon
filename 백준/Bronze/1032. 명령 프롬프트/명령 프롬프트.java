import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sar = new String[n];
        boolean check = false;
        String standard = null;
        for (int i = 0; i < n; i++) {
            sar[i] = br.readLine();
            if (i == 0) {
                standard = sar[0];
            } else {
                standard=check(sar[i], standard);
            }
        }
        System.out.println(standard);
        //첫번째 입력값을 기준으로 잡는다



        //검색 결과가 먼저 주어졌을 때, 패턴으로 뭘 쳐야 그 결과가 나오는지를 출력하는 문제
        //1.문자열 비교해서 charAt이 다르면 ?
        //2.다 같으면 그 문자열 출력
    }

    public static String check(String str, String stan) {
        if (str.equals(stan)) {
            return str;
        }
        char[] stanc = stan.toCharArray();
        for (int i = 0; i < stan.length(); i++) {
            if (str.charAt(i) != stanc[i]) {
                stanc[i]='?';
            }
        }

        return String.valueOf(stanc);


    }
}



