class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb=new StringBuilder();
        
        
        while(n>3){
            sb.insert(0,n%3);
            n/=3;
        }        
        sb.insert(0,n);

        sb=sb.reverse();
        int powIndex=0;
        int index=sb.length()-1;
        while(index>=0){
            char c=sb.charAt(index--);
            answer+=(c-'0')*Math.pow(3,powIndex++);
            
        }
        return answer;
    }
}

