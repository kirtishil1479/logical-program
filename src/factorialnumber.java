import java.util.Scanner;

public class factorialnumber {

	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter the number");
	      int a=sc.nextInt();
		int num=a;
		 long factorial=1;
		 for(int i=1;i<=num;i++) {
			 factorial=factorial*i;
			 
		 }
             System.out.println("factorial of a number is:"+factorial);
             
             int k=1*2*3*4*5*6;
             System.out.println(k);
	}

}
