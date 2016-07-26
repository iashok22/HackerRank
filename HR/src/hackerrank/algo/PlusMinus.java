package hackerrank.algo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @author aiyyanar
 *
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        findFraction(arr);
    }
    
    private static void findFraction(int array[]) {
        int negCount = 0;
        int posCount = 0;
        int zeroCount = 0;
        for (int val : array) {
            if(val == 0) {
                zeroCount++;
            } else if(val > 0){
                posCount++;
            } else {
                negCount++;
            }
        }
        System.out.println((double)posCount/array.length);
        System.out.println((double)negCount/array.length);
        System.out.println((double)zeroCount/array.length);
    }
}