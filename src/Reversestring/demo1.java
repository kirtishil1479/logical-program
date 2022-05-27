package Reversestring;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		
			  Scanner sc=new Scanner(System.in);
		       System.out.println("Enter a String");   
		       String s=sc.next();

     
     String rev="";
     
     int len=s.length();
     for(int i=len-1;i>=0;i--)
     {
    	 rev=rev+s.charAt(i);
     }
     System.out.println("Reverse String is:"+rev);

	}

}
