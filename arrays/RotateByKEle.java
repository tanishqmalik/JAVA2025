
//     public static void reverse( int arr[], int start, int end){

//         while(start<end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end]= temp;
//             start++;
//             end--;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int limit = sc.nextInt();

//         int arr[] = new int[limit];

//         for(int i=0; i<limit; i++){
//             arr[i] = sc.nextInt();
//         }

//         int k = sc.nextInt();

//         reverse(arr, 0, arr.length-k-1);
//         reverse(arr, arr.length-k, arr.length-1);
//         reverse(arr, 0, arr.length-1);

//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }


public class RotateByKEle {

    static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void right(int arr[],int k){
        reverse(arr, 0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        reverse(arr, 0, arr.length-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-k-1);
        
    }


    static void left(int arr[],int k){
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
       

        reverse(arr, 0, arr.length-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-k-1);
        
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};

        int k=2;

        right(arr,k);
        System.err.println();
        left(arr,k);
        
    }
}