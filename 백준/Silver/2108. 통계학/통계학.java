import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];
        //-4000~4000
        //counting sort
        /*
        구해야 하는 것
        평균->합계
        max
        min
        mid
        최빈값
         */
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int mid=100000;
        int mode=10000;
        int count=0;
        int mode_max=0;//최빈값 중 두 번째로 작은 값을 출력한다.
        boolean flag = false; //최빈값이 1번만 등장하면 true//????

        for (int i = 0; i < n; i++) {
            int inp=Integer.parseInt(br.readLine());
            sum+=inp;
            arr[inp+4000]++;
            if (max < inp) {
                max=inp;
            }
            if (min > inp) {
                min=inp;
            }
        }
        for (int i = min + 4000; i <= max + 4000; i++) {
            if (arr[i] > 0) {
                //중앙값 찾기
                if (count < (n + 1) / 2) {//전체의 반까지 카운트
                    count += arr[i];//+1+1+1
                    mid=i-4000;
                }
                //최빈값 찾기
                if (mode_max < arr[i]) {//111311111 에서 3
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag=true;
                } else if(mode_max==arr[i]&&flag==true){//두번째 최빈값
                    flag = false;
                    mode=i-4000;
                }
            }
        }
        System.out.println((int) Math.round(((double) sum / n)));// 소수점 이하 첫째 자리에서 반올림한 값을 출력   강제 캐스팅하면서 반올림
        System.out.println(mid);//중앙값
        System.out.println(mode);//최빈값
        System.out.println(max - min);//범위




    }
}
