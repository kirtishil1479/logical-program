package Arrayelements;

public class sumofarrayelement {

	public static void main(String[] args) {
		
		int a[]= {5,4,3,2,1,6};
		
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++) 
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum of array element is:"+sum);
	}

}
