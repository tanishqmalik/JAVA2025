// package arrays.11 jan test;

// input :- 1,2,3,4,5,6,7   k=2
// 6 7 1 2 3 4 5  right
// 3 4 5 6 7 1 2 left 

public class RotateByKEle {


    public static  void reverse(int arr[], int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }


    public static void right(int arr[], int k){
        reverse(arr, 0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void left(int arr[], int k){
        reverse(arr, 0, k-1); 
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,3,4,5,6,7};

        int k=4;

        System.out.println("right");
        // right(arr,2);
        right(arr, k);
    }
}



// 5 6 7 3 4 5 6 7

