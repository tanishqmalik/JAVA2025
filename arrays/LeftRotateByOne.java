
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int limit = sc.nextInt();

//         int arr[] = new int[limit];

//         for(int i=0; i<limit; i++){
//             arr[i] = sc.nextInt();
//         }

//         int first = arr[0];

//         for(int i=1; i<arr.length; i++){
//             arr[i-1] = arr[i];
//         }
//         arr[arr.length-1] = first;


//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }


// public class LeftRotateByOne {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int limit = sc.nextInt();
//         int arr[] = new int[limit];

//         for(int i=0; i<limit; i++){
//             arr[i] = sc.nextInt();
//         }

//         int first = arr[0];

//         for(int i=1; i<arr.length; i++){
//             arr[i-1] = arr[i];
//         }
//         arr[arr.length-1]=first;


//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// 5
// 1 2 3 4 5
// 2 3 4 5 1 


// public class LeftRotateByOne {
//     public static void main(String[] args) {
//         int arr[] = {2,4,5,6};

//         int first = arr[0];

//         for(int i=1; i<arr.length; i++){
//             arr[i-1]=arr[i];
//         }

//         arr[arr.length-1] = first;

//         for(int i=0; i<arr.length; i++){
//             System.err.println(arr[i]);
//         }

//     }
// }