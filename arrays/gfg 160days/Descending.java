
// import java.lang.reflect.Array;
import java.util.*;

public class Descending {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,5,4,2,21,3};

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
