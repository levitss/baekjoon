import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<b;j++){
            for(int i=0;i<a;i++){
                sb.append("*");
            }
            if(j==b) continue;
            sb.append("\n");
        }
        System.out.println(sb);
    }
}