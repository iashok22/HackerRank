package hackerrank.algo;

import java.util.Scanner;

public class SherlockAndSquares {
	
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int i=0;i<t;i++){
			long a = in.nextLong();
			long b = in.nextLong();
			Double x = Math.sqrt(a);
			Double y = Math.sqrt(b);
			long xL = x.longValue();
			long xY = y.longValue();
			long count = 0;
			for(long j = xL; j<=xY; j++) {
				if((j * j) >=a && (j * j) <=b ){
					count++;
				}
			}
			System.out.println(count);
		}
		in.close();
	}
}
