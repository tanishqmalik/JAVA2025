// package arrays.11 jan test;

// left rotate
// 5
// 1 2 3 4 5
// 2 3 4 5 1 

public class RotateByOne {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int first = arr[0];

        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = first;

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
