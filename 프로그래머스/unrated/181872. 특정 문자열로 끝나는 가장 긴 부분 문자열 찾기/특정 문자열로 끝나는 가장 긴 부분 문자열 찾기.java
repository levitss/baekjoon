class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        //for 뒤에서 
        //substring
        for(int i=myString.length();i>=0;i--){
            
            String str=myString.substring(i-pat.length(),i);
            if(str.equals(pat)){
                return myString.substring(0,i);
            }
        }
        
        return answer;
    }
}