package hackerrank.algo;

import java.util.Scanner;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for(int a0 = 0; a0 < t; a0++){
            String n = in.nextLine();
            int num = Integer.parseInt(n);
            String[] numArray = n.trim().split("");
            int count = 0;
            for(String val : numArray) {
                if(!"".equals(val) && !"0".equals(val)&& num%Integer.parseInt(val)==0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
}