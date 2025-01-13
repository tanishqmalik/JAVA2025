
// import java.lang.reflect.Array;
import java.util.*;



public class frequencyofallelements {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,3,5,5,5,1,2};
        boolean visited[] = new boolean[arr.length];

        Arrays.fill(visited, false);


        for(int i=0; i<arr.length; i++){
            
            

            if(visited[i] == true){
                continue;
            }


            int count = 1;

            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }

            System.out.println(arr[i]+" " +count);
        }

        
    }
}
