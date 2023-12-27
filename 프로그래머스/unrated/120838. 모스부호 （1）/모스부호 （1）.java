import java.util.*;
class Solution {
    public String solution(String letter) {
        Map<String,String> map=new HashMap();
        String [] arr={ ".-:a","-...:b","-.-.:c", "-..:d",".:e","..-.:f",
                "--.:g","....:h","..:i",".---:j","-.-:k",".-..:l",
                "--:m","-.:n","---:o",".--.:p","--.-:q",".-.:r",
                "...:s","-:t","..-:u","...-:v",".--:w","-..-:x",
                "-.--:y","--..:z"

        };
        for(String a: arr){
            String sa[]=a.split(":");
            map.put(sa[0],sa[1]);
        }
        StringBuffer sb=new StringBuffer();
        String[] strArr=letter.split(" ");
        for(int i=0;i<strArr.length;i++){
            sb.append(map.get(strArr[i]));
        }
        return sb.toString();
    }
}