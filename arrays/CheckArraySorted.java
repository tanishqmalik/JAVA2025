import java.util.Scanner;

public class CheckArraySorted {


    public static boolean Check(int[] arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i]< arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int limit=sc.nextInt();

        int arr[] = new  int[limit];


        for(int i=0; i<limit; i++){
            arr[i] = sc.nextInt();
        }

        boolean checking = Check(arr);

        System.out.println(checking);
    }
}
