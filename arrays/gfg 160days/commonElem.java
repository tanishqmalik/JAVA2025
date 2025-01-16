
import java.util.HashSet;

// Java Program to Find Common Elements Between Two Arrays
public class commonElem {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7};
        // int arr2[] = {78,32,1,1,2,3,7,3};

        int[] arr = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 };

        // create Array 2
        int[] arr2 = { 100, 9, 64, 7, 36, 5, 16, 3, 4, 1 };


        HashSet <Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr[i]==arr2[j]){
                    set.add(arr[i]);
                }
            }
        }

        // int k = set.size();
        // int finalArray[] = new int[k];


        for(int x : set){
            System.out.print(x+" ");
        }

    }
}
