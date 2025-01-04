
import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        int arr[] = new int[limit];

        for(int i=0; i<limit; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the number");
        int num = sc.nextInt();

        for(int i=0; i<limit; i++){
            if(arr[i]==num){
                System.out.println(i);
                break;   
            }
        }
    }
}
// agar
// 5
// 1 2 3 4 1
// to , break hta do
// to output aaayega 0,4