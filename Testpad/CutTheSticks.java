import java.util.Scanner;

// public package Testpad;

class CutTheSticks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();

        int arr[] = new int[limit];

        int smallest = Integer.MAX_VALUE;

        int count = 0;

        for(int i=0; i<limit; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }

        for(int i=0; i<limit; i++){
            if(arr[i]>=1){
                arr[i]-smallest;
                count++;
            }
        }
    }   
}