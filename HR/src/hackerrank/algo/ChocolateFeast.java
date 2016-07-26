package hackerrank.algo;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(t>=1 && t<=1000){
        	for(int a0 = 0; a0 < t; a0++){
                int n = in.nextInt();
                int c = in.nextInt();
                int m = in.nextInt();
                if(n>=2 && n<=Math.pow(10, 5) && c>=1 && c<=n && m>=2 && m<=n){
                	System.out.println(caclChacolates(n,c,m));
                }
                
            }
        }
        
        in.close();
    }

	private static int caclChacolates(int n, int c, int m) {
		int chocFromMoney = n/c;
		int freeChoc = chocFromMoney/m;
		int remWrapper = chocFromMoney%m;
		int extChoc = (remWrapper+freeChoc)/m;
		return chocFromMoney+freeChoc+extChoc;
	}
}
