// 345 leetcode

import java.util.*;

public class ReverseVowelsOfaString {
    public static void main(String[] args) {
        String str = "leetcode";

        // output :- AceCreIm

        char vowels[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E' , 'I', 'O', 'U'};

        ArrayList <Character> newchar = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            for(int j=0; j<vowels.length; j++){
                if(str.charAt(i)==vowels[j]){
                    // char new = str.charAt(i)
                    newchar.add(str.charAt(i));
                }
            }
        }

        Collections.reverse(newchar);

        // for(int i=0; i<newchar.size(); i++){
        //     System.out.println(newchar.get(i));
        // }


        StringBuilder result = new StringBuilder(str);

        // System.out.println(result);

        // Character hello = '';
        int vowelIndex = 0;
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<vowels.length; j++){
                if(result.charAt(i)==vowels[j]){
                    result.setCharAt(i, newchar.get(vowelIndex++));
                    break;
                }
            }
        }

        System.out.println(result);
    }
}