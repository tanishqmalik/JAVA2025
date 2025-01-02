
import java.util.Scanner;

public class Largest {
    public static void main(String args[]){
        int largest = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();

        int arr[] = new int[limit];

        for(int i=0; i<limit; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        System.out.println(largest);



    }
}
