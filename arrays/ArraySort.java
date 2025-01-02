
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        int limit;
        

        Scanner sc = new Scanner(System.in);

        limit = sc.nextInt();
        int arr[] = new int[limit];


        for(int i=0; i<limit; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}