
import java.util.ArrayList;

// package arrays.11 jan test;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int arr[] = {1,0,0,3,40,4,20,320,4000,0,0,0,0,3,30,0,};

        // HashSet <Integer> set = new HashSet<>();
        ArrayList <Integer> list = new ArrayList<>();


        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
            
        }

        int k = list.size();

        for (int i = 0; i < k; i++) {
            arr[i] = list.get(i);
        }

        for(int i=k; i<arr.length; i++){
            arr[i] = 0;
        }


        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}