import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());//응시자의 수
        int k = Integer.parseInt(st.nextToken());//상 받는 사람 수
        List<Integer> list = new ArrayList<>(n);
        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < n; i++) {//점수 입력
            list.add(Integer.parseInt(st1.nextToken()));
        }
        Collections.sort(list);

        System.out.println(list.get(list.size() - k));


    }
}


