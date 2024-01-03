class Solution {
    boolean solution(String s) {
        
        int p=0;
        int y=0;
        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c)){
                if(c=='p') p++;
                if(c=='y') y++;
            }else{
                if(c=='P') p++;
                if(c=='Y') y++;
            }
        }
        if(p==y) return true;
        return false;
    }
}