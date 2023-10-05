import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb= new StringBuffer();
        String a = sc.next();
        for(int i=0;i<a.length();i++){
            if(Character.isLowerCase(a.charAt(i))){
                sb.append(Character.toUpperCase(a.charAt(i)));
            }else{
                sb.append(Character.toLowerCase(a.charAt(i)));
            }
        }
        System.out.println(sb);
    }
}