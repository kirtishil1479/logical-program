package palindrome;

import java.util.Scanner;

public class polindrimstring {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str=sc.next();
		String org_str=str;
		String  rev="";
		
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		
		{
			rev=rev+str.charAt(i);
			
		}	
	   if(org_str.equals(rev))
	   {
		   System.out.println(org_str+"  is polindrome string");
	   }
	   else {
		   System.out.println(org_str+"  is  not polindrome String ");
	   }
		
	}

}
