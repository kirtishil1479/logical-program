import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digits");
		int num=sc.nextInt();
		
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println("Sum of digits is:"+sum);
	}

}
