class Solution {
    public int solution(int n) {
        int answer = 0;
        int count1=0;
        int count2=0;
        int temp=n+1;
        koko:while(true){
            String a=Integer.toBinaryString(temp);
            String b=Integer.toBinaryString(n);
            
            
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)=='1') count1++;
            }
            for(int i=0;i<b.length();i++){             
                if(b.charAt(i)=='1') count2++;
            }
            
            if(count1==count2) break;
            
            count1=0;
            count2=0;
            temp++;
        }
        return temp;
    }
}