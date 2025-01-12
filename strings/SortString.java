
// import java.lang.reflect.Array;
import java.util.*;

// package strings;

public class SortString {
    public static void main(String[] args) {
        String str = "tanishq";

        char chars[] = str.toCharArray();


        Arrays.sort(chars);


        String result = new String(chars);

        System.out.println(result);


    }
}
