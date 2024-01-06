class Solution {
    public int solution(int[] arr) {
        int a=arr[0];
        
        for(int i=1;i<arr.length;i++){
            a=lcm(a,arr[i]);
        }
        
        return a;
    }
    int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    int gcd(int a, int b){
        if(b==0)return a;
        
        return gcd(b,a%b);
            
        
    }
    
}