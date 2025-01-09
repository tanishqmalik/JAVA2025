
import java.util.Scanner;

// package frequency questions;

public class FreqofanElementInAnArray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int limit = sc.nextInt();
    int arr[] = new int[limit];

    int count=0;

    int x = sc.nextInt();

    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }

    for(int i=0; i<arr.length; i++){
        if(arr[i]==x){
            count++;
        }
    }
    System.err.println(count);
}
}
