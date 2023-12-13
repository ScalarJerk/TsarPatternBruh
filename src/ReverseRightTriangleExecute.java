import java.util.Scanner;

public class ReverseRightTriangleExecute {
    public static void main(String[] args) {
        System.out.println("Number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n-i-1) System.out.printf(" ");
                else System.out.printf("*");
            }
            System.out.println();
        }

    }
}