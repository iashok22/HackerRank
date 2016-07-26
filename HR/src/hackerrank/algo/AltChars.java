package hackerrank.algo;

import java.util.Scanner;

public class AltChars {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		for(int k=0;k<n;k++){
			int count = 0;
			String[] str = in.nextLine().trim().split("");
			for(int i =1;i<str.length-1;i++ ){
				if(str[i].equals(str[i+1])){
					count++;
					
				}
				
			}
			System.out.println(count);
			
		}
		in.close();
	}

}
