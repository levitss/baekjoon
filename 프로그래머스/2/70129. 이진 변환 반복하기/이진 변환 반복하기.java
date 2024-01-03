class Solution {
    public int[] solution(String s) {
        
        int answer1=0;
        int answer2=0;
        int count=0;
        while (true){
            if(s.equals("1"))break;
            answer2++;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='0'){
                    answer1++;
                    continue;
                }
                count++;
            }
            
            
            s=Integer.toBinaryString(count);
            count=0;
            
            
            
        }
        return new int[] {answer2,answer1};
    }
  
}