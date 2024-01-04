import java.util.*;
class Solution
{
    public int solution(String s){
        Stack<String> stack=new Stack();
        
        String arr[]=s.split("");
            
        for(int i=0;i<s.length();i++){
            String target=arr[i];
            if(stack.size()!=0){
                if(stack.peek().equals(target)){
                    stack.pop();
                    continue;
                }
                
            }
            stack.push(target);
            
            
        }
        if(stack.size()!=0)return 0;
        return 1;
    }
}