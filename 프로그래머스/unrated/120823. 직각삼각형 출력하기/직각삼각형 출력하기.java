import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<n;i++){
            sb.append("*".repeat(i+1)+"\n");
        }
        System.out.print(sb);
    }
}