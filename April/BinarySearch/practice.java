// package April.BinarySearch;

public class practice {
    public static void main(String args[]){

        int arr[]= {2,3,7,7,11,15,25};
        int target = 11;

        int n = arr.length;

        // int mid = arr.length/2;
        int high = n-1;
        int low = 0;

        while(low<=high){
            int mid= (high + low)/2;

            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }

            if(arr[mid]<target){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
    }
}


// public class practice{
//     public static void main(String[] args) {
//         int arr[] = {2,3,7,7,11,15,25};
//         int target =7;

//         int left = 0;
//         int right = arr.length-1;


//         boolean found = false;


//         while(left<=right){
//             int mid = (left+right)/2;

//             if(arr[mid] == target){
//                 System.out.println(mid);
//                 found=true;
//                 break;
//             }
//             if(arr[mid]<target){
//                 left = mid+1;
//             }
//             else{
//                 right = mid-1;
//             }
//         }

//         if(!found){
//             System.out.println("-1");
//         }

//     }
// }
