public class reverseWordsInStrings {
    public static void main(String[] args) {

        String str = "   this is   me   ";

        String spitString[] = str.trim().split("\\s+");
        
        StringBuilder result = new StringBuilder();


        for(int i=spitString.length-1; i>=0; i--){
            result.append(spitString[i]);

            if(i!=0){
                result.append(" ");
            }
        }


        result.toString();

        System.out.println(result);
    }
}
