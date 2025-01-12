
import java.util.Stack;

// package strings;

public class reverseByStack {
    public static void main(String[] args) {
        String str = "tanishq";

        Stack <Character> st = new Stack<>();


        for(int i=0; i<str.length(); i++){
            st.push(str.charAt(i));
        }

        for(int i=0; i<str.length(); i++){
            System.out.println(st.pop()); 
        }
    }
}
