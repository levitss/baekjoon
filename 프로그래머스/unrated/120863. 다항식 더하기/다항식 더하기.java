class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int constant=0;
        int x_value=0;
        String [] arr=polynomial.split("\\+");
        for(String a: arr){
            a=a.trim();
            if(a.equals("x")){
                x_value++;
                continue;
            }
            char c=a.charAt(a.length()-1);
            if(c=='x'){
                x_value+=Integer.parseInt(a.substring(0,a.length()-1));
                continue;
            }
            constant+=Integer.parseInt(a);
            
        }
        StringBuffer sb=new StringBuffer();
        if(constant==0){
            if(x_value==0){
                return "0";
            }
            if(x_value==1){
                return sb.append("x").toString();
            }
            return sb.append(x_value).append("x").toString();    
        }else if(x_value==0){
            sb.append(constant);
        }else if(x_value==1){
            sb.append("x + ").append(constant);
        }
        
        
        else{
            sb.append(x_value).append("x + ").append(constant);
            
        }
        return sb.toString();
    }
}