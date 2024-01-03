import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack=new Stack();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                stack.push(c);
            }
            if(c==')'){
                if(stack.size()==0)return false;
                
                char target=stack.pop();
                if(target=='c')return false;
            }
            
        }
        if(stack.size()!=0)return false;
        return true;
    }
}