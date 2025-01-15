// package gfg 160days;

public class largest {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdlargest = Integer.MIN_VALUE;

        int arr[]= {5, 1, 1, 9, 7, 2, 6, 10};

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                thirdlargest = secondLargest;
                secondLargest = largest;
                largest=arr[i];
            }

            if(arr[i]>secondLargest && arr[i]!=largest){
                thirdlargest = secondLargest;
                secondLargest=arr[i];
            }

            if(arr[i]>thirdlargest && arr[i]!=secondLargest && arr[i]!=largest){
                thirdlargest=arr[i];
            }

        }

        System.out.println(largest + " " + secondLargest + " " + thirdlargest);
    }
}
