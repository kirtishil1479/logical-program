package palindrome;

import java.util.Scanner;

public class palindrimenumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	
	int num=sc.nextInt();
	int onum=num;
	int rev=0;
	while(num!=0)
	{
		rev=rev*10+num%100;
		num=num/10;
		
	}	
   if(onum==rev)
   {
	   System.out.println(onum+"polindrime number");
   }
   else {
	   System.out.println(onum+"   not polindrime");
   }
	
	}

}
