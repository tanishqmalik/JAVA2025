
import java.util.Arrays;


// // package frequency questions;
// import java.util.*;

// public class CountingFrequenciesOfArrayElements {
//     public static void main(String[] args) {
//         int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};

//         boolean visited[] = new boolean[arr.length];
        

//         Arrays.fill(visited, false);

//         for(int i=0; i<arr.length; i++){
//             if(visited[i]==true){
//                 continue;
//             }

//             int count =1;

//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i]==arr[j]){
//                     visited[j]=true;
//                     count++;
//                 }
//             }

//             System.out.println(arr[i]+" "+count);
//         }
//     }
// }


// public class CountingFrequenciesOfArrayElements{
//     public static void main(String[] args) {


//         int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
//         boolean visited[] = new boolean[arr.length];

//         Arrays.fill(visited, false);

//         for(int i=0; i<arr.length; i++){

//             if(visited[i]==true){
//                 continue;
//             }

//             int count = 1;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i]==arr[j]){
//                     visited[j]=true;
//                     count++;
//                 }
//             }

//             System.out.println(arr[i]+""+count);
//         }
//     }
// }