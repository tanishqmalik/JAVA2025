public class ThirdSmallest {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        int thirdsmallest = Integer.MAX_VALUE;

        int arr[] = {-1,5,6,1,-2,7,8,4,3};

        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                thirdsmallest=secondsmallest;
                secondsmallest = smallest;
                smallest=arr[i];
            }

            if(arr[i]<secondsmallest && arr[i]!= smallest){
                thirdsmallest = secondsmallest;
                secondsmallest=arr[i];
            }
            if(arr[i]<thirdsmallest && arr[i]!=secondsmallest && arr[i]!=smallest){
                thirdsmallest = arr[i];
            }
        }

        System.out.println(smallest + " " + secondsmallest + " " + thirdsmallest);
    }
}


