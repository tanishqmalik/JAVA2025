
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        int arr[] = new int[limit];


        for(int i=0; i<limit-1; i++){
            arr[i] = sc.nextInt();
        }

        //sum of n natural numbers

        int sumNatural = ( limit * (limit+1) )/2;


        //sum of an array
        int sum =0;
        for(int x : arr){
            sum = sum + x;
        }

        //subtract the sum of array from naturalNumber sum

        int result = sumNatural-sum;

        System.out.println(result);
    }
}


