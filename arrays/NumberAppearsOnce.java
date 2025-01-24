
//     public static void main(String[] args) {
//         int arr[] = {4,1,2,1,2};

//         boolean visited[] = new boolean[arr.length];

//         Arrays.fill(visited, false);

//         int result = 0;

//         for(int i=0; i<arr.length; i++){

//             if(visited[i]==true){
//                 continue;
//             }

//             int count =1;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i]==arr[j]){
//                     visited[j] = true;
//                     count++;
//                 }
//             }

//             if(count==1){
//                 result = arr[i];
//             }
            
//         }

//         System.out.println(result);
        
//     }
// }

import java.util.*;


// 22jan
public class NumberAppearsOnce {
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};

        int result =0;

        boolean visited[] = new boolean[arr.length];

        ArrayList <Integer> list = new ArrayList<>();

        Arrays.fill(visited, false);

        for(int i=0; i<arr.length; i++){
            if(visited[i]==true){
                continue;
            }

            int count =1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    visited[j] = true;
                    count++;
                }
            }

            // list.add(count);

            if(count==1){
                result = arr[i];
            }
        }

        System.out.println(result);
    }
}