class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int q=i;q<=j;q++){
            String str=String.valueOf(q);
            for(String a:str.split("")){
                if(a.equals(String.valueOf(k))){
                    answer++;
                }
            }
        }
        return answer;
    }
}