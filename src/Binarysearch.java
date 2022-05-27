import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the element");
		int k=sc.nextInt();
	
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int key=6;
		int l=0;
		int h=a.length-1;
		boolean flag = false;
		
		while(l<=h)
		{
			int m=(l+h)/2;
			if(a[m]==key)
			{
				System.out.println("element found");
				flag=true;
				break;
			}
			if(a[m]<key) 
			{
				h=m-1;
			}
		}  
		     if(flag==false)
		     {
		    	 System.out.println("element not found");
		     }
		 

	}

}
