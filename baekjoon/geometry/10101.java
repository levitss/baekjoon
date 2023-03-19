import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        while (true) {


            if (a == 60 && b == a && c == a) {
                System.out.println("Equilateral");
                break;
            }
            if (a + b + c == 180) {
                if (a == b || b == c) {
                    System.out.println("Isosceles");
                    break;
                } else if (a == c || b == c) {
                    System.out.println("Isosceles");
                    break;
                }
            }
            if (a + b + c == 180) {
                if (a != b && a != c && b != c) {
                    System.out.println("Scalene");
                    break;
                }
            }
            if (a + b + c != 180) {

                System.out.println("Error");
                break;
            }

        }


    }

}




