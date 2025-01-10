
        
//         Scanner sc = new Scanner(System.in);

//         int limit = sc.nextInt();

//         int arr[]= new int[limit];

//         for(int i=0; i<limit; i++){
//             arr[i]= sc.nextInt();
//         }

//         for(int i=0; i<arr.length; i++){
//             if(arr[i]!=0){
//                 list.add(arr[i]);
//             }
//         }

//         int size = list.size();

//         // System.out.println(list.get(0));

//         for(int i=0; i<size; i++){
//             arr[i] = list.get(i);
//         }

//         for(int i=size; i<limit; i++){
//             arr[i]=0;
//         }

//         for(int i=0; i<limit; i++){
//             System.out.println(arr[i]);
//         }

//     }
// }



// public class MoveZerosToEnd {
//     public static void main(String[] args) {
//         ArrayList <Integer> list = new ArrayList<>();
//         Scanner sc = new Scanner(System.in);
        
//         int limit = sc.nextInt();

//         int arr[] = new int[limit];

//         for(int i=0; i<limit; i++){
//             arr[i]=sc.nextInt();
//         }

//         for(int i=0; i<limit; i++){
//             if(arr[i]!=0){
//                 list.add(arr[i]);
//             }
//         }

//         int size = list.size();

//         // System.out.println(list.get(0));

//         for(int i=0; i<size; i++){
//             arr[i] = list.get(i);
//         }

//         for(int i=size; i<limit; i++){
//             arr[i]=0;
//         }

//         for(int i=0; i<limit; i++){
//             System.out.println(arr[i]);
//         }

        
//     }
// }

// public class MoveZerosToEnd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ArrayList <Integer> list = new ArrayList<>();

//         int limit = sc.nextInt();

//         int arr[] = new int[limit];

//         for(int i=0; i<limit; i++){
//             arr[i]=sc.nextInt();
//         }

//         for(int i=0; i<limit; i++){
//             if(arr[i]!=0){
//                 list.add(arr[i]);
//             }
//         }

//         int k = list.size();

//         for(int i=0; i<k; i++){
//             arr[i]=list.get(i);
//         }

//         for(int i = k; i<limit; i++){
//             arr[i] = 0;
//         }

//         for(int i=0; i<limit; i++){
//             System.out.println(arr[i]);
//         }
        
//     }
// }



// 6 jan

// public class MoveZerosToEnd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);


//         ArrayList <Integer> list = new ArrayList<>();

//         int limit = sc.nextInt();

//         int arr[] = new int[limit];

//         for(int i=0; i<limit; i++){
//             arr[i]=sc.nextInt();
//         }

//         for(int i=0; i<arr.length; i++){
//             if(arr[i]!=0){
//                 list.add(arr[i]);
//             }
//         }

//         int k = list.size();

//         for(int i=0; i<k; i++){
//             arr[i] = list.get(i);
//         }

//         for(int i=k; i<limit; i++){
//             arr[i]=0;
//         }

//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
        
//     }
// }

// 9 jan 0 se pehle vaale saare sorted //made task by own   bus bubble sort lgado k tak

// import java.util.ArrayList;

// public class MoveZerosToEnd {
//     public static void main(String[] args) {
//         int arr[] = {0,3,3,43,1,0,0,2,2,0,0,4,4};

//         ArrayList <Integer> list = new ArrayList<>();

//         for(int i=0; i<arr.length; i++){
//             if(arr[i]!=0){
//                 list.add(arr[i]);
//             }
//         }

//         int k = list.size();

//         for(int i=0; i<k; i++){
//             arr[i]=list.get(i);
//         }

//         for(int i=0; i<k; i++){
//             for(int j=i+1; j<k; j++){
//                 if(arr[i]>arr[j]){
//                     int temp = arr[i];
//                     arr[i]=arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }

//         for(int i=k; i<arr.length; i++){
//             arr[i] = 0;
//         }

//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }


//     }
// }