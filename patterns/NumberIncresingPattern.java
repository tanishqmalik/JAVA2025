
import java.util.Scanner;

// package patterns;

public class NumberIncresingPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < n+1; i++) {
            // System.out.println(i);
            for(int j=i; j<n+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}