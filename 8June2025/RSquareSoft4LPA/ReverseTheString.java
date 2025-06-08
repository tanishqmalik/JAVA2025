// package 8June2025.RSquareSoft4LPA;

import java.util.*;
// import javax.sound.midi.SysexMessage;

public class ReverseTheString {

    public static void main(String args[]){
        
    
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    String[] words = input.split(" ");

    StringBuilder reversed = new StringBuilder();

    for(int i = words.length-1; i>=0; i--){
        reversed.append(words[i]);

        if(i!=0){
            reversed.append(" ");
        }

    }

    System.out.println(reversed);
    }
}