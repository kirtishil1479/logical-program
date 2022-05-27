package largestnumber;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter first number");
		int a=sc.nextInt();
		
		System.out.println("Enter second number");
		int b=sc.nextInt();
		
		System.out.println("Enter Third number");
		int c=sc.nextInt();
		
		
		// using ternary operator
		
		int largest1=a>b?a:b;
		
	int	largest2=largest1>c?largest1:c;
	
	System.out.println(largest2 +" is a largest number");
	
	// or
	
	int d=(a>b ?a:b)>largest1? (a>b ?a:b):largest1;
	System.out.println(d+"  is the largest number");
		

	}

}
