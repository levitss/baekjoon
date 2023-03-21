import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int cardSum(List<Integer> listOfCard,int M,int n) {
        int sum = 0;
        int temp;

        for (int i = listOfCard.size()-1; i >= 0; i--) {
            for (int l = i- 1; l >= 0; l--) {
                for (int k = l-1; k >= 0; k--) {
                    temp = listOfCard.get(i) + listOfCard.get(l) + listOfCard.get(k);
                    if (M == temp) {//같으면 리턴
                        return temp;
                    }
                    if (temp < M && sum < temp) {//M보다 작고 기존값보다 크면
                        sum = temp;
                    }
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cardN = Integer.parseInt(st.nextToken());  //카드의 개수
        int M = Integer.parseInt(st.nextToken());  //대상
        List<Integer> listOfCard = new ArrayList(cardN);
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < cardN; i++) {//카드 리스트 입력
            listOfCard.add(Integer.parseInt(st1.nextToken()));
        }
        Collections.sort(listOfCard);
        System.out.println(cardSum(listOfCard, M, cardN));





        //list 입력
// collections.sort로 정렬 후 가장 큰것들 합.
// 98 7 6 5 세번째 숫자 다 더해보고 안되면
// 97 + 8 6 5 식으로 두번째 숫자를 바꿈




    }
}

