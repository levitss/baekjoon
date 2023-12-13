class Solution {private static boolean check(int lotto, int[] win_nums) {
        for (int i = 0; i < win_nums.length; i++) {
            if (lotto == win_nums[i]) {
                return true;
            }
        }
        return false;

    }
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        //맞는 수 체크
        int count_atari = 0;
        int count_x = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                count_x++;
                continue;
            }
            if (check(lottos[i],win_nums)) {
                count_atari++;
            }
        }

        answer = new int[2];

        answer[0] = 7-(count_x+count_atari);
        answer[1] = 7-(count_atari);  
        if (count_atari ==0 ) {
            answer[1] = 6;
        }
        if(7-(count_x+count_atari)>6) answer[0] = 6;


        return answer;
    }
}