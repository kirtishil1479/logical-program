package reversenumber;

import java.util.Scanner;

public class usingstringbuffer {

	public static void main(String[] args) {
	
			  Scanner sc=new Scanner(System.in);
		       System.out.println("Enter a Number");   
		       int num=sc.nextInt();
		       
		       StringBuffer sb=new StringBuffer(String.valueOf (num));
		       StringBuffer rev=sb.reverse();
		       
		       System.out.println("Reverse numberis :"+rev);
		       

	}
	}

