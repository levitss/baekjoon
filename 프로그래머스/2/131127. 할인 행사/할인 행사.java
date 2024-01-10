import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> map = new LinkedHashMap<>();
        int days=0;

        koko:for (int i = 0; i < discount.length; i++) {
                map.put(discount[i], map.getOrDefault(discount[i], 0)+1);
            if (i >= 10) {
                //10일 지났으면 빼줌
                map.put(discount[i - 10], map.get(discount[i-10]) - 1);
            }
                //수량 체크
                for (int j = 0; j < want.length; j++) {
                    //수량이 안맞음                
                    if (!map.containsKey(want[j])||map.get(want[j]) < number[j]) {                        
                        continue koko;
                    }
                }
                //수량 맞음
                days++;

                // return days+1;


        }
        return days;
    }
}