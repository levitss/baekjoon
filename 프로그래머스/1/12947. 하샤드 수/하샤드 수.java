class Solution {
    public boolean solution(int x) {
        int temp=x;
   int value=0;
        int aa = (int) Math.log10(x) + 1;
        for (int i = 0; i <aa ; ) {
            value += x %10;
            x/= 10;
            i++;

        }
        if (temp % value == 0) {
            return true;
        }





        return false;
    }
}