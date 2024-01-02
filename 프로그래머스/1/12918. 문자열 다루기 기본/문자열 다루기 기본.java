class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        //길이 체크도
        if((s.length()!=4&&s.length()!=6)) return false;
        
        
        for(char c:s.toCharArray()){
            if(Character.isAlphabetic(c)) return answer=false;
        }
        return answer;
    }
}