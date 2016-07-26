package hackerrank.algo;

import java.util.Scanner;

public class MaxOr {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
        int max = 0;
        while (l != r){
            l >>= 1;
            r >>= 1;
            max = (max << 1) + 1;
        }
      return max;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}