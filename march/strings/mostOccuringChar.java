

// emicon company ques
import java.util.HashMap;

// public package march.strings;

public class mostOccuringChar {

    // public static void main(String[] args) {
    //     HashMap<Character,Integer> freqMap = new HashMap<>();


    //     String heelo12 = "banana";

    //     char hello = ' ';
    //     int number = 0;

    //     for(char ch : heelo12.toCharArray()){
    //         freqMap.put(ch,freqMap.getOrDefault(ch, 0)+1);

    //         if(freqMap.get(ch)>number){
    //             number = freqMap.get(ch);
    //             hello = ch;
    //         }
    //     }

    //     System.out.println(hello);
    // }   


    public static void main(String[] args) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        char Schar = ' ';
        int maxCount = 0;

        String hello = "banana";

    
        for(char ch : hello.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);

            if(freqMap.get(ch)>maxCount){
                maxCount = freqMap.get(ch);
                Schar = ch;
            }
        }

        System.out.println(Schar);

    }
}


