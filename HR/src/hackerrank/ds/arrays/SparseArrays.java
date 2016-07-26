package hackerrank.ds.arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        Map<String,Integer> al = new HashMap<>();
        for(int i=0;i<N;i++) {
            String str = in.nextLine();
            Integer ix = al.get(str);
            if(ix==null){
                ix=1;
            } else {
                ix++;
            }
            al.put(str,ix);
        }
        int Q = Integer.parseInt(in.nextLine());
        
        for(int j=0;j<Q;j++) {
            String qry = in.nextLine();
            Integer ix = al.get(qry);
            if(ix!=null){
                System.out.println(ix);
            } else {
                System.out.println("0");
            }
        }
        in.close();
    }
}