
import java.util.Scanner;

public class SecondLargest {
    public static void main(String args[]){
        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        int arr[] = new int[1000000];

        for(int i=0; i<limit; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<limit; i++){
            if(arr[i]>largest){
                SecondLargest = largest;
                largest = arr[i];
            }
            if(arr[i]> SecondLargest && arr[i]!=largest){
                SecondLargest = arr[i];
            }
        }

        System.out.println(SecondLargest);
    }
}