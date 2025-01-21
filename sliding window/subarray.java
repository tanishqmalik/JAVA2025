
import java.util.ArrayList;
import java.util.Collections;

// package sliding window;

// public class subarray {
//     public static void main(String[] args) {
//         // int arr[] = {1,2,3,4,5,6,7};
//         int arr[] = {5,4,-1,7,8};
//         int k=3;
        

        
//         for(int i=0; i<arr.length-k+1; i++){

//             int sum=0;
//             for(int j=i; j<i+k; j++){
//                 sum = sum +arr[j];
//                 System.out.print(arr[j]);
//             }
//             System.out.println(" "+sum);
//         }
//     }
// }

// import java.util.*;

public class subarray {
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};

        ArrayList <Integer> list = new ArrayList<>();

        int k = 1;

        for(int i=0; i<=arr.length-k; i++){

            int sum =0;
            for(int j=i; j<i+k; j++){
                
                sum = sum +arr[j]; 
            }
            list.add(sum);
        }
        // for(int x : list){
        //     System.out.println(x);
        // }

        Collections.sort(list);

        System.out.println(list.get(list.size()-1));
    }
}