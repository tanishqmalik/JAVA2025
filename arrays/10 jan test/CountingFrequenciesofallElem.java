// package 10 jan test;

import java.util.*;

public class CountingFrequenciesofallElem {
    public static void main(String[] args) {

        int arr[] = {1,1,1,1,13,3,33,3,33,12,2,2,21,12,33};

        boolean visited[] = new boolean[arr.length];

        Arrays.fill(visited, false);

        for(int i=0; i<arr.length; i++){
            

            if(visited[i]==true){
                continue;
            }
            int count =1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }

            System.out.println(arr[i] +" "+count);
        }
    }
}
