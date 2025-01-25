

// public class SecondLargest {
//     public static void main(String args[]){
//         int largest = Integer.MIN_VALUE;
//         int SecondLargest = Integer.MIN_VALUE;
        
//         Scanner sc = new Scanner(System.in);
//         int limit = sc.nextInt();

//         int arr[] = new int[1000000];

//         for(int i=0; i<limit; i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i=0; i<limit; i++){
//             if(arr[i]>largest){
//                 SecondLargest = largest;
//                 largest = arr[i];
//             }
//             if(arr[i]> SecondLargest && arr[i]!=largest){
//                 SecondLargest = arr[i];
//             }
//         }

//         System.out.println(SecondLargest);
//     }
// }


// public class SecondLargest{
//     public static void main(String[] args) {
//         int largest = Integer.MIN_VALUE;
//         int secondlargest = Integer.MIN_VALUE;
//         int thirdlargest = Integer.MIN_VALUE;


//         Scanner sc = new Scanner(System.in);
//         int limit = sc.nextInt();
//         int arr[] = new int[limit];

//         for(int i=0; i<limit; i++){
//             arr[i]=sc.nextInt();
//         }

//         for(int i=0; i<arr.length; i++){
//             if(arr[i]>largest){
//                 thirdlargest =secondlargest;
//                 secondlargest=largest;
//                 largest = arr[i];
//             }
//             else if(arr[i]>secondlargest && arr[i]!=largest){
//                 thirdlargest = secondlargest;
//                 secondlargest = arr[i];
//             }
//             else if(arr[i]>thirdlargest && arr[i]!= largest && arr[i]!=secondlargest){
//                 thirdlargest = arr[i];
//             }
//         }

//         System.out.println(thirdlargest);

//     }
// }


// public class SecondLargest{
//     public static void main(String[] args) {
//         int largest = Integer.MIN_VALUE;
//         int secondlargest = Integer.MAX_VALUE;

//         int arr[] = {5,6,7,8,4,1,2,3,};

//         for(int i=0; i<arr.length; i++){
//             if(arr[i]>largest){
//                 secondlargest=largest;
//                 largest=arr[i];
//             }
            
//             if(arr[i]>secondlargest && arr[i] != largest){
//                 secondlargest = arr[i];
//             }
//         }

//         System.out.println(secondlargest);
//     }
// }


// public class SecondLargest{
//     public static void main(String[] args) {
        
//     }
// }