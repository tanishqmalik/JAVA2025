
import java.util.ArrayList;
import java.util.Collections;


// import java.lang.reflect.Array;
// import java.util.ArrayList;

// public class plusone {
//     public static void main(String[] args) {
//         int arr[] = {1,2,3};

//         ArrayList <Integer> list = new ArrayList<>();

//         int number = 0;

//         for(int digit : arr){
//             number = number *10 + digit;
//         }

//         number = number+1;

//         while(number>0){
//             int digit = number%10;
//             // System.out.println(digit);
//             list.add(digit);
//             number = number/10;
//         }

//         Collections.reverse(list);

//         int result[] = new int[list.size()];

//         int i=0;

//         for(int x : list){
//             result[i]= list.get(i);
//             i++;
//         }

//         for(int x : result){
//             System.out.print(x+" ");
//         }
//         System.out.println();

//     }
// }



public class plusone {
    public static void main(String[] args) {
        int arr[] = {1,2,3};

        ArrayList <Integer> list = new ArrayList<>();

        //array to integer

        int number=0;
        for(int digit : arr){
            number = number*10 + digit;
        }

        number = number+1;
        

        while(number>0){
            int digit = number%10;
            list.add(digit);
            number=number/10;
        }

    //    for(int i : list){
    //     System.out.println(i);
    //    }

       Collections.reverse(list);

       int result[] = new int[list.size()];

       int j=0;

       for(int x : list){
        result[j++] = x;
       }

       for(int x : result){
        System.out.println(x);
       }

    }
}