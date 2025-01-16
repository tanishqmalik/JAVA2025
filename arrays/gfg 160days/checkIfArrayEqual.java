public class checkIfArrayEqual {


    public static boolean identical(int a[], int b[]){

        boolean checker = false;
        for(int i=0; i<a.length; i++){
            if(a[i]==b[i]){
                checker=true;
            }
        }

        return checker;
    }

    public static void check(int a[], int b[]){
        if(a.length==b.length && identical(a, b)){
            System.out.println("Equal");
        }
        else{
            System.out.println("unequal");
        }

        
    }

    public static void main(String[] args) {
        int c[] = { 10, 20, 30 };
        int d[] = { 45, 50, 55, 60, 65 };



        check(c, d);

    }
}
