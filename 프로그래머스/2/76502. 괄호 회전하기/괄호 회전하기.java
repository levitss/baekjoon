import java.util.*;
class Solution {
    public int solution(String s) {
        StringBuilder sb=new StringBuilder(s);
        int answer = 0;
        char temp;
        for(int i=0;i<sb.length();i++){
            if(check(sb.toString())){
                answer++;
            }
            temp=sb.charAt(0);
            sb=sb.delete(0,1);
            sb.append(temp);
        }
        
        return answer;
    }
    boolean check(String s){
        Stack<String>stack=new Stack();
        String[] arr=s.split("");
        for(int i=0;i<s.length();i++){
            String value=arr[i];
            if(value.equals("[")||value.equals("(")||value.equals("{")){
                stack.push(value);                
                continue;
            }else if(stack.size()>0){
                String target=stack.pop();
                if(target.equals("[")&&value.equals("]")){
                    continue;
                }
                if(target.equals("{")&&value.equals("}")){
                    continue;
                }
                if(target.equals("(")&&value.equals(")")){
                    continue;
                }
                return false;
                
            }else{
                return false;
            }
            
            
        }
        if(stack.size()!=0) return false;
        return true;
    }
}
