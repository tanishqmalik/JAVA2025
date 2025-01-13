
// import java.util.Scanner;

// // package strings;

// public class reverse {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();

//         for(int i=str.length()-1; i>=0; i--){
//             System.out.print(str.charAt(i));
//         }
//         System.err.println();

//     }
// }

public class reverse {
    public static void main(String[] args) {
        String str = "tanishq";
        String r = "";
        char ch;

        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);

            r= r + ch;
        }

        System.out.println(r);
    }
}