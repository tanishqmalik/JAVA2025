
import java.util.HashSet;
import java.util.Scanner;


// import java.util.HashSet;

// public class RemoveDuplicates {
//     public static void main(String[] args) {
//         int arr[] = {7,4,4,4,4,4,4,2,2,2};

//         HashSet <Integer> set = new HashSet<>();

//         for(int i=0; i<arr.length; i++){
//             set.add(arr[i]);
//         }

//         int k= set.size();
//         int j=0;

//         for(int x:set){
//             arr[j]=x;
//             j++;
//         }

//         for(int i=0; i<k; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

// import java.util.HashSet;

// public class RemoveDuplicates{
//     public static void main(String[] args) {
//         int arr[] = {1,1,1,2,2,2,5,5,5,9};


//         HashSet <Integer> set = new HashSet<>();

//         for(int i=0; i<arr.length; i++){
//             set.add(arr[i]);
//         }

//         int k= set.size();
//         int j=0;

//         for(int x: set){
//             arr[j] = x;
//             j++;
//         }

//         for(int i=0; i<k; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


// public class RemoveDuplicates{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         HashSet <Integer> set = new HashSet<>();

//         int limit = sc.nextInt();

//         int arr[] = new int[limit];

//         for(int i=0; i<limit; i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i=0; i<arr.length; i++){
//             set.add(arr[i]);
//         }

//         int k = set.size();
//         int j=0;

//         for(int x : set){
//             arr[j] = x;
//             j++;
//         }

//         for(int i=0; i<k; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }



public class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,1,3,2,3};

        HashSet <Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

        int k=set.size();
        int j=0;


        for(int x: set){
            arr[j] = x;
            j++;
        }

        for(int i =0; i<k; i++){
            System.out.println(arr[i]);
        }
    }
}