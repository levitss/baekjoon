class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] starr={ "aya", "ye", "woo", "ma"};
           for(String a:babbling){
            String replace=a;
            for(int i=0;i<starr.length;i++){
                replace = replace.replace(starr[i], " ");
            }
            if(replace.replace(" ","").length()==0) answer++;
        }

        return answer;
    }
}