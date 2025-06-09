import java.util.ArrayList;

public class SubarrayWithMaxSum {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        ArrayList<Integer> list = new ArrayList<>();

        int target = 6;

        int l =0;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;

                for(int k=i; k<=j; k++){
                    sum = sum+arr[k];
                }

                if(sum==target){
                    for(int k=i; k<=j; k++){
                        System.out.print(arr[k]);
                        if(k<j) System.out.print(",");
                    }
                    System.out.println();
                }
                
            }
            
        }
    }
}