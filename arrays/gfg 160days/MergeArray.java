import java.util.ArrayList;

public class MergeArray {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30 };
        int b[] = { 40, 50, 60, 70, 80 };


        // List
        ArrayList <Integer> list = new ArrayList<>();

        for(int i=0; i<a.length; i++){
            list.add(a[i]);
        }

        for(int i=0; i<b.length; i++){
            list.add(b[i]);
        }

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
