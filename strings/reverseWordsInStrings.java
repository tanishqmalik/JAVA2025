// public class reverseWordsInStrings {
//     public static void main(String[] args) {

//         String str = "   this is   me   ";

//         String spitString[] = str.trim().split("\\s+");
        
//         StringBuilder result = new StringBuilder();


//         for(int i=spitString.length-1; i>=0; i--){
//             result.append(spitString[i]);

//             if(i!=0){
//                 result.append(" ");
//             }
//         }


//         result.toString();

//         System.out.println(result);
//     }
// }



// public class reverseWordsInStrings {
//     public static void main(String[] args) {
//         String s = "   this is   me   ";
        

//         String SplitArray[] = s.split("\\s+");

//         StringBuilder result = new StringBuilder();

//         for(int i=SplitArray.length-1; i>=0; i--){
//             result.append(SplitArray[i]);

//             if(i!=0){
//                 result.append(" ");
//             }
//         }

//         System.out.println(result);
//     }
// }


// public class reverseWordsInStrings {
//     public static void main(String[] args) {
//         String s = "   this is   me   ";

//         String SplitArray[] = s.split("\\s+");

//         StringBuilder result = new StringBuilder();

//         for(int i=SplitArray.length-1; i>=0; i--){
//             result.append(SplitArray[i]);

//             if(i!=0){
//                 result.append(" ");
//             }
//         }

//         String result1 = result.toString();

//         System.out.println(result1);
//     }
// }


// 19 jan
public class reverseWordsInStrings {
    public static void main(String[] args) {
        // String s = "   this is   me   ";
        // String s = "This is decent";

        String splitArray[] = s.split("\\s+");

        StringBuilder result = new StringBuilder();

        for(int i=splitArray.length-1; i>=0; i--){
            result.append(splitArray[i]);

            if(i!=0){
                result.append(" ");
            }
        }

        String result1 = new String(result);

        System.out.println(result1);
    }
}