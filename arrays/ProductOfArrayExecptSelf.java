// public class ProductOfArrayExecptSelf {

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4};

//         int ans[] = new int[arr.length];
    
//         int piche = 1;
    
//         for(int i=0; i<arr.length; i++){
//             ans[i]=piche;
//             piche=piche*arr[i];
//         }

//         int aage =1;
//         for(int i=arr.length-1; i>=0; i--){
//             ans[i]=aage*ans[i];
//             aage = aage*arr[i];
//         }

//         for(int i=0; i<arr.length; i++){
//             System.out.println(ans[i]);
//         }
//     }
// }

// 13jan
public class ProductOfArrayExecptSelf {
    public static void main(String[] args) {

        int arr[]={1,2,3,4};

        int ans[] = new int[arr.length];
        int ans2[] = new int[arr.length];

        int piche =1;

        for(int i=0; i<arr.length; i++){
            ans[i] = piche;
            piche = arr[i]*piche;
        }

        int aage = 1;

        for(int i=arr.length-1; i>=0; i--){
            ans2[i] = aage;
            aage = arr[i]*aage;
        }

        for(int i=0; i<arr.length; i++){
            ans[i] = ans[i]*ans2[i];
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(ans[i]);
        }




    }
}