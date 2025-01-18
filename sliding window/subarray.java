// package sliding window;

public class subarray {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7};
        int arr[] = {5,4,-1,7,8};
        int k=3;
        

        
        for(int i=0; i<arr.length; i++){

            int sum=0;
            for(int j=i; j<i+k; j++){
                sum = sum +arr[j];
                System.out.print(arr[j]);
            }
            System.out.println(" "+sum);
        }
    }
}
