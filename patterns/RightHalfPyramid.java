
import java.util.Scanner;

// package patterns;

// *
// **
// ***
// ****
// *****

public class RightHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<n+1; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();   
        }

    }
}