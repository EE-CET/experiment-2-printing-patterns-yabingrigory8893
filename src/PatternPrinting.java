import java.util.Scanner;
public class PatternPrinting {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (i < n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.println("*");
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println("*");
            }
        }
        sc.close();
    }
}
