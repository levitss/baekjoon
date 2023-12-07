class Solution {
    public String solution(String code) {
        StringBuffer sb=new StringBuffer();
        int mode=0;
       
        for(int i=0;i<code.length();i++){
            char ch=code.charAt(i);
            
            switch(mode){
                case 0:
                    if(ch=='1'){
                        mode=1;
                        break;
                    }   
                    if(i%2==0)  {
                        sb.append(ch);
                    }  
                    
                    break;
                case 1:
                    if(ch=='1'){
                        mode=0;
                        break;
                    }   
                    if(i%2==1)  {
                        sb.append(ch);
                    }  
                    
                    break;
                    
                    
            }
            
            
            
            
            
        }
        String result=sb.toString();
         if (result.length() == 0) {
            return "EMPTY";
        }
        return result;
    }
}