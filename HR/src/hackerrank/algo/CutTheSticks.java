package hackerrank.algo;

import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        //int x = Integer.MAX_VALUE;
        int zeroCount = 0;
        //System.out.println(small);
        while(n-zeroCount !=0){
        	int count = 0;
        	zeroCount = 0;
        	int small = findSmallest(arr);
        	for(int i = 0 ; i < arr.length ; i++) {
            	if(arr[i]!=0){
            		arr[i] -= small;
            		count++;
            		//x = count;
            	} else {
            		zeroCount++;
            	}
            	
            }
        	if(zeroCount == n) break;
        	System.out.println(count);
        }
        in.close();	
        
	}

	private static int findSmallest(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		for(int i=0; i < arr.length ; i++) {
			if(smallest > arr[i] && arr[i]!=0) {
				smallest = arr[i];
			}
		}
		return smallest;
	}
}
