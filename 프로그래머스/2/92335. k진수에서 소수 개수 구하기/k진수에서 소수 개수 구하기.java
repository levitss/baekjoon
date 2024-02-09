class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String str=convert(k,new StringBuilder(),n);
        //211020101011
        // boolean [] prime=new boolean[1000000];
        // for(int i=2;i*i<=1000000;i++){
        //     if(!prime[i]){
        //         for(int j=2;j*i<1000000;j++){
        //             prime[i*j]=true;
        //         }
        //     }
        // }
        
        String[] arr=str.split("0");
        for (String s:arr){
            if(s.length()==0) continue;
            if(check(s)){
                answer++;
            }
        }
        return answer;
    }
    public String convert(int k,StringBuilder sb,int n){
        if(n==0){
            return sb.toString();
        }
        sb.insert(0,n%k);
        convert(k,sb,n/k);
        return sb.toString();
    }
    public boolean check(String str){
        Long v=Long.parseLong(str);
        if(v==1) return false;
        for(int i=2;i<=(int)Math.sqrt(v);i++){
            if(v%i==0) return false;
        }
        return true;
        
    }
}