public class rotate {

    // Rotate Right

    static void reverse(int arr[], int start, int end){
        // int start = 0;
        // int end = arr.length-1;

        while(start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};

        int k =2;
        
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);


        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        
    }

}
