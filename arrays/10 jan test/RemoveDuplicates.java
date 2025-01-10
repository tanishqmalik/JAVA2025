
import java.util.HashSet;

// package 10 jan test;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // int arr[] = {1,1,2,2,22,22,4,4,3,4,5,5,6,6,3};
        int arr[] = {1,1,3,2,3,3,3,3,4,4,4,4,1,1,1};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

        int k = set.size();
        int j=0;

        for(int x : set){
            arr[j] = x;
            j++;
        }

        for(int i=0; i<k; i++){
            System.out.println(arr[i]);
        }
    }
}