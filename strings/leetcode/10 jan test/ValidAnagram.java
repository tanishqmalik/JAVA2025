
import java.util.*;
public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();

        Arrays.sort(schars);
        Arrays.sort(tchars);


        // for(int i=0; i<schars.length; i++){
        //     System.out.println(schars[i]);
        // }

        // boolean hello = false;

        // if(Arrays.equals(schars, tchars)){
        //     hello = true;
        // }

        System.out.println(Arrays.equals(schars, tchars));

    }
}
