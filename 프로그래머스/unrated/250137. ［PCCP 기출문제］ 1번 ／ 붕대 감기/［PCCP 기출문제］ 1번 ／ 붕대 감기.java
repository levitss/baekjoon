class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
  int initHealth=health;
        int healTime = bandage[0];
        int healPs = bandage[1];
        int healAdd = bandage[2];
        int i = 0;
        int count = 0;
        int refTime = 0;
        int time = 1;
        while(attacks.length > i) {

            int dealTime = attacks[i][0];
            int deal = attacks[i][1];
            if (time == dealTime) {
                health -= deal;
                count = 0;
                if (health <= 0) {
                    return -1;
                }
                time++;
                i++;
                continue;
            }
            refTime = dealTime - time;
            for (int j = 0; j < refTime ; j++) {
                health += healPs;

                if (++count == healTime) {
                    health += healAdd;
                    count = 0;
                }
                if (health > initHealth) {
                    health = initHealth;
                }
                time++;

            }


        }
        return health;
    }
}