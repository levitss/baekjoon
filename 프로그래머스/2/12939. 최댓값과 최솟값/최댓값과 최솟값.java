class Solution {
    public String solution(String s) {
        String answer = "";
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(String str:s.split(" ")){
            int a=Integer.parseInt(str);
            if(max<a) max=a;
            if(min>a) min=a;
        }
        
        return min+" "+max;
    }
}