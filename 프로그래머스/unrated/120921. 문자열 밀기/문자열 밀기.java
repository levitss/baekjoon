class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuffer sb=new StringBuffer(A);
        if(A.equals(B)){return 0;}
        
        while(true){
            sb.insert(0,sb.charAt(sb.length()-1));
            sb.delete(sb.length()-1,sb.length());
            answer++;
            if(sb.toString().equals(B)) return answer;
            
            
            if(sb.toString().equals(A)) return -1;
        }
    }
}