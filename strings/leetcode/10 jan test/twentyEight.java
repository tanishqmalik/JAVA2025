// package leetcode.10 jan test;

public class twentyEight {
    public static void main(String[] args) {
        // String haystack = "sadbutsad", needle = "sad";
        // String haystack = "leetcode", needle = "leeto";
        String haystack = "tanishq", needle = "ani";

        int result =0;

        String hello = "";

        for(int i=0, j=needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                result = i;
            }
        }

        System.out.println(result);
    }
}
