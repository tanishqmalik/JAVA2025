
import java.util.ArrayList;



// Input: array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }, key = 3
// Output: [9, 2, 1, 7, 2, 5]

// Input: array = { 10, 20, 10, 30, 50, 10 }, key = 10
// Output: [20, 30, 50]

public class RemoveAllOccurrencesOfAnElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 50, 10};
        int key = 10;

        ArrayList <Integer> list = new ArrayList<>();

        for(int i=0; i<arr .length; i++){
            if(key!=arr[i]){
                list.add(arr[i]);
            }
        }

        for( int x : list){
            System.out.println(x);
        }
    }
}
