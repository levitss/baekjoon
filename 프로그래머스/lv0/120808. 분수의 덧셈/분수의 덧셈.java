class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
         int[] answer = new int[2];
        int bottom=lcm(denom1,denom2);
        int top1=(bottom/denom1)*numer1;
        int top2=(bottom/denom2)*numer2;
        int result_top=top1+top2;

        while(true){
            int a=gcd(bottom,result_top);
            bottom/=a;
            result_top/=a;
                        if(a==bottom ||a==result_top||a==1) break;

        }
        answer[0]=result_top;
        answer[1]=bottom;
        
        
        return answer;
    }
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
}
