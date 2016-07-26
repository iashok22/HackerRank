package hackerrank.algo;

import java.util.Scanner;

public class StockMaximize {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		int n = Integer.parseInt(in.nextLine());
		String[] wot = in.nextLine().split(" ");
		int large = Integer.parseInt(wot[0]);
		for(int i=0;i<t;i++) {
			for(int j=0;j<n;j++){
				for(int k=0;k<wot.length;k++) {
					if(Integer.parseInt(wot[k]) > large) {
						System.out.println("sell"+k);
						large += large;
						System.out.println(large);
					} else {
						//System.out.println("buy"+k+":"+wot[k]);
					}
				}
			}
		}
		in.close();
	}

}
