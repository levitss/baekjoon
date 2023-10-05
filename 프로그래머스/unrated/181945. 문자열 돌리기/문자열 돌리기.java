import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<a.length();i++){
            sb.append(a.charAt(i)).append("\n");
        }
        System.out.print(sb);
    }
}