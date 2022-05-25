package com.masai;
import java.util.*;

public class Main{



   static String reversString(String input){
//write the logic
	StringBuffer sub = new StringBuffer(input);
     sub.reverse();
       return sub.toString();
//     System.out.println(sub.toString());
//	return input;
}

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	Main s = new Main();
	
	System.out.println("Enter your original String :");
	String n = scan.next();
	
	String r = reversString(n);
	System.out.println("Original string "+n);
	System.out.println("Reverse String :"+r);
}


}
