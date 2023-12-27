class Solution {
    public String[] solution(String my_str, int n) {
        int k=0;
        int length=my_str.length();
        if(my_str.length()%n!=0) k=1;
        String[] answer = new String [my_str.length()/n+k];
        for(int i=0;i<length/n+1;i++){
            if(my_str.length()<=n) {
                answer[i]=my_str;
                break;
            }
            answer[i]=my_str.substring(0,n);
            my_str=my_str.substring(n,my_str.length());
        }
        return answer;
    }
}