//leetcode
// import java.lang.reflect.Array;
import  java.util.*;

// package bitwise;

public class BitwiseXorAllPairs {
    public static void main(String[] args) {
        // int arr1[] = {2,1,3};
        // int arr2[] = {10,2,5,0};

        int arr1[] = {1,2};
        int arr2[] = {3,4};

        ArrayList <Integer> list = new ArrayList<>();

        

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                int x = arr1[i]^arr2[j];
                list.add(x);
            }
        }

        for( int x : list){
            System.out.print(x+ " ");
        }
        System.out.println();

        int xor = 0;
        for(int i=0; i<list.size(); i++){
            xor = xor^list.get(i);
        }


        System.out.println(xor);


    }
}
