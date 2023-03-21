import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static int title(int n) {
        List<Integer> list = new ArrayList(10000);

        for (int i = 0; i < 2147483647; i++) {
            if (String.valueOf(i).contains("666")) {
                list.add(i);
            }
            if (list.size() == n) {
                return list.get(n - 1);
            }
        }
        return list.get(n - 1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //1.매번 체크하면서 666이 들어갈때 카운트 하기
        //2. 해당 리스트 만들어서 바로 조회하기
        //매번 String.valueOf로 캐스팅해야하는가?
        System.out.println(title(n));





            }
        }


