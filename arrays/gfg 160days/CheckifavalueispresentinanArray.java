// package gfg 160days;

public class CheckifavalueispresentinanArray {

    public  static  boolean check(int arr[],int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 1, 9, 7, 2, 6, 10};

        int key = 55;

        System.out.println(check(arr,key));
        
    }
}
