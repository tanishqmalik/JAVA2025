
import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();


        int arr[] ={1, 2, 2, 3, 4, 4, 4, 5, 5};


        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

        int k= set.size();
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
