package hackerrank.algo;

import java.util.Scanner;

public class BulbSwitch {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		System.out.println(bulbswitch(n));
		/*int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = 1;
		}
		for(int j=2;j<=arr.length;j++) {
			if(j==1){
				for(int i=0;i<n;i++) {
					arr[i] = 1;
				}
			}
			for(int i=0;i<n;i++){
				if(j%2!=0){
					arr[j-1] = 0;
				}
			}
			
			
			//arr[n-1] = 0;
		}
		arr[n-1] = 0;
		int count = 0;
		for(int k = 0;k<arr.length;k++) {
			if(arr[k] == 1){
				count++;
			}
		}
		System.out.println(count);*/
		in.close();
	}

	private static int bulbswitch(int n) {
		return (int)Math.sqrt(n);
		
	}

}
