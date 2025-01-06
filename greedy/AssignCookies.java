// package greedy;

public class AssignCookies {
    public static void main(String[] args) {
        int g[] = {1,2,3};
        int s[]= {1,1};
        int gn = g.length;
        int sn = s.length;

        int l =0;
        int r = 0;


        while(l<gn && r<sn){
            if(g[l]<=s[r]){
                l++;
            }
            r++;
            
        }

        System.out.println(l);
    }
}