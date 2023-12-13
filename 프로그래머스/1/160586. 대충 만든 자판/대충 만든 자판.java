class Solution {
     private static int check(String[] keymap, char ch) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        ret :for (int i = 0; i < keymap.length; i++) {
            String s = keymap[i];
            for (int j = 0; j <s.length() ; j++) {
                result++;
                if (s.charAt(j) == ch) {
                    if (min > result) {
                        min = result;
                        result = 0;
                        continue ret;
                    }
                }
            }
            result = 0;
        }
        if (min==Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
    public int[] solution(String[] keymap, String[] targets) {
       
        int[] answer = new int[targets.length];
        int index = 0;
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            for (int j = 0; j < target.length(); j++) {
                int check = check(keymap, target.charAt(j));
                if (check == -1) {
                    index = -1;
                    break;
                }
                index += check;

            }
            answer[i] = index;
            index = 0;
        }

        return answer;
    }
}