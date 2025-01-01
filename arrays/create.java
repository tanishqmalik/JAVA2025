// package arrays;

import java.util.*;

public class create {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int arr[] = new int[limit];

        for(int i=0; i<limit; i++){
            arr[i] = sc.nextInt();
        }

        for(int val:arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
