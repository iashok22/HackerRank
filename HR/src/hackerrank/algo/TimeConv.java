package hackerrank.algo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConv {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        if(time.contains("AM")){
        	if(time.startsWith("12")){
        		time = time.replaceFirst("12", "00").substring(0,time.length()-2);
            } else {
            	time = time.replace("AM", "");
            }
        } else {
            String[] split = time.split(":");
            Integer hour = Integer.parseInt(split[0]);
            if(hour < 12) hour +=12;
            split[0] = hour.toString();
            StringBuilder builder = new StringBuilder();
            for(String a : split){
            	builder.append(a+":");
            }
            time = builder.toString().substring(0,builder.length()-3);
            
        }
        System.out.println(time);
    }
}