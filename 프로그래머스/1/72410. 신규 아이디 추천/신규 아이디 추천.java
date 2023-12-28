class Solution {
    public String solution(String new_id) {
        new_id=new_id.toLowerCase();
        String id=new_id.replaceAll("[^a-z0-9\\-\\.\\_]","");
        while(true){
            String temp=new String(id);
            id=id.replace("..",".");
            if(id.equals(temp))break;
            
        }
        StringBuffer sb=new StringBuffer(id);
        while(true){
            if(sb.length()==0)break;
            if(sb.charAt(0)=='.')sb=sb.deleteCharAt(0);
            if(sb.length()==0)break;

            if(sb.charAt(sb.length()-1)=='.')sb=sb.deleteCharAt(sb.length()-1);
            if(sb.charAt(0)!='.'&&sb.charAt(sb.length()-1)!='.')break;
        }
        if(sb.length()==0) sb.append("a");
        if(sb.length()>=16){
            sb.delete(15,sb.length());
        }
        while(true){
            if(sb.length()==0)break;
            if(sb.charAt(0)=='.')sb=sb.deleteCharAt(0);
                        if(sb.length()==0)break;

            if(sb.charAt(sb.length()-1)=='.')sb=sb.deleteCharAt(sb.length()-1);
            if(sb.charAt(0)!='.'&&sb.charAt(sb.length()-1)!='.')break;
        }
        if(sb.length()<=2){
            while(sb.length()<3){
                sb.append(sb.charAt(sb.length()-1));
            }
        }
        
        
        return sb.toString();
    }
}