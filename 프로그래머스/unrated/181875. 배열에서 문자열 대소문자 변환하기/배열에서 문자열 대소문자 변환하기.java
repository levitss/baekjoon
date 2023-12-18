class Solution {
    public String[] solution(String[] strArr) {
        String[] answer =new String[strArr.length];
        
        for(int i=0;i<strArr.length;i++){
            String str= strArr[i];
            if(i%2==0){
                strArr[i]=str.toLowerCase();
            }else{
                strArr[i]=str.toUpperCase();
            }
        }
        
        return strArr;
    }
}