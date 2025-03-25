
// import java.security.DrbgParameters;
import java.util.Scanner;
// package march.arrays;

public class secondLargest {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        Scanner sc = new Scanner(System.in);

        int limit=  sc.nextInt();
        int arr[] = new int[limit];
    

        for(int i=0; i<limit; i++){
            arr[i]= sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }

            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }

        System.out.println("largest" + largest);
        System.out.println("second largest" + secondLargest);
    }
}