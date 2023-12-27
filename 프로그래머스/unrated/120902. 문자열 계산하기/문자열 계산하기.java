class Solution {
    public int solution(String my_string) {
        String[] arr=my_string.split(" ");
        
        long an=0;
        
        an=Integer.parseInt(arr[0]);
        
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            if(str.equals("+")){
                an+=Integer.parseInt(arr[i+1]);
            }else if(str.equals("-")){
                an-=Integer.parseInt(arr[i+1]);
            }
                
        }
        
        return (int)an;
        
        
        
    }
}