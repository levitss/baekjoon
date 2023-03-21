import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main{
    public static void main(String[]args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int n=1;
        int a=1;

        List<Integer> list1 = new ArrayList();
        List list2;
        while (true) {
//        1 /1 2 /3 2 1/ 1 2 3 4/ 5 4 3 2 1/123456
//        1/ 2 1 /1 2 3/
            
            //t=1일 경우 a=1 list 1 n 1
            //t=3d      a=2 list 2 n 3
            //t=5       a=3 list 3 n 6
            list1.clear();
            for (int is = 1; is <= a; is++) {

                list1.add(is);
            }
                    //11번째는   5-(15-11) //

               // 1/3/6/10/15// 총 개수
              //  1/2/3/4/5 //n번째 및 배열의 개수
;
            if (t <= n) {
                break;
            }

            a++;

            n+=a;

        }
//홀수일때 역순
        //a=2 n=3 t=2 list= 1,2

        if (a % 2 != 0) {
            Collections.reverse(list1);
        }
        bw.append(list1.get(a-1 - (n - t)).toString()+"/");
        Collections.reverse(list1);
        bw.append(list1.get(a-1 - (n - t)).toString());
//2-1 - (3-2)=1



//t=5,n=6,a=4

        bw.flush();
        bw.close();
        br.close();
    }
}