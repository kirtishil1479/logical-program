package Reversestring;

import java.util.Scanner;

public class usingstringbuffer {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a String");   
	       String s=sc.next();
	       
	      
	       StringBuffer sb=new StringBuffer(s);
	       
	      
	       System.out.println("Reverse string is:"+sb.reverse());

	}

}
