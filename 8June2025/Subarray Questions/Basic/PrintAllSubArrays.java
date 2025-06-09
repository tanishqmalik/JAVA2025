
import java.util.Scanner;

public class PrintAllSubArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int arr[] = new int[limit];

        for(int i=0; i<limit; i++){
            arr[i] = sc.nextInt();
        }

        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr.length; j++){
        //         System.out.print(arr[j] + " ");
        //     }
        //     System.out.println();
        // }

        // for(int i = 0; i<arr.length; i++){
        //     for(int j = i; j<arr.length; j ++){
        //         for(int k  = i; k<=j; k++){
        //             System.out.print(arr[k]);
        //         }
        //         System.out.println();
        //     }
        // }


        // for(int i=0; i<arr.length; i++){
        //     for(int j=i; j<arr.length; j++){
        //         for(int k=i; k<=j; k++){
        //             System.out.print(arr[k]);
        //         }
        //         System.out.println();
        //     }
            
        // }


        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
}