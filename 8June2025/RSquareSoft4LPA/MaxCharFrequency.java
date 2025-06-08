
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.Scanner;

import java.util.*;

// package 8June2025.RSquareSoft4LPA;

public class MaxCharFrequency {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        HashMap<Character,Integer> freqMap = new HashMap<>();

        for(char c : input.toCharArray()){
            if(c==' '){
                continue;
            }
            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
        }

        int maxFreq = Collections.max(freqMap.values());

        System.out.println(maxFreq);

        for(Map.Entry<Character,Integer> entry : freqMap.entrySet()){
            if(entry.getValue() == maxFreq){
                System.out.println(entry.getKey());
                break;
            }
        }
    }

    
}
