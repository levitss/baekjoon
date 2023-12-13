import java.io.IOException;
import java.util.*;

class Solution {
      private static int[][] getInts(int[][] data, int selectValue, Map<Integer, int[]> map) {
        int[][] answer;
        List<Map.Entry<Integer, int[]>> entries = new LinkedList<>(map.entrySet());
        entries.sort(new Comparator<Map.Entry<Integer, int[]>>() {
            @Override
            public int compare(Map.Entry<Integer, int[]> o1, Map.Entry<Integer, int[]> o2) {
                return o1.getValue()[selectValue] - o2.getValue()[selectValue];
            }
        });
        answer = new int[entries.size()][data[0].length];
        for (int i = 0; i < entries.size(); i++) {
            answer[i] = entries.get(i).getValue();
        }

        for (int[] arr :
                answer) {
            System.out.println(Arrays.toString(arr));
        }
        return answer;
    }
   public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};

        Map<Integer,int[]> map = new HashMap();
        Map<String, Integer> ref = new HashMap();
        ref.put("code", 0);
        ref.put("date", 1);
        ref.put("maximum", 2);
        ref.put("remain", 3);


               //val_ext 2000 01 01 ~ 2999 12 31
                for (int i = 0; i < data.length; i++) {
                    if (data[i][ref.get(ext)] < val_ext) {
                        map.put(i, data[i]);
                    }
                }

                answer = getInts(data, ref.get(sort_by), map);





        return answer;
    }
}