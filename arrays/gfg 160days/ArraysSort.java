import java.util.*;

public class ArraysSort {
    public static void main(String[] args) {
        int[] a = { 2, -1, 3, 4 };
      
        // Character Array
        char[] b = { 'b', 'a', 'c', 'b' };


        Arrays.sort(a);
        Arrays.sort(b);


        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        for(int i=0; i<a.length; i++){
            System.out.print(b[i]+" ");
        }
    }
}
