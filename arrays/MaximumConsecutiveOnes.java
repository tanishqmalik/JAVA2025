// public class MaximumConsecutiveOnes {
//     public static void main(String[] args) {
//         int prices[] = {1, 1, 0, 1, 1, 1};

//         int count=0;
//         int max1 =0;
//         for(int i=0; i<prices.length; i++){
//             if(prices[i]==1){
//                 count++;
//             }
//             else{
//                 count=0;
//             }

//             max1 = Math.max(max1,count);
//         }

//         System.out.println(max1);
//     }
// }



public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int prices[] = {1, 1, 0, 1, 1, 1};

        int max1 =0;
        int count = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i]==1){
                count++;
            }
            else{
                count=0;
            }

            max1 = Math.max(max1,count);
        }

        System.err.println(max1);
    }
}