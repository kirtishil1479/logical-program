package Arrayelements;

public class missingnoinarray {

	public static void main(String[] args) {
	               
		int a[]= {1,2,3,4,6,7,8,9,10};
		
		int sum1=0;
		
		for(int i=0;i<=a.length-1;i++) 
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of element of array:"+sum1);
		
		int sum2=0;
		
		for(int i=1;i<=10;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("sum of range of element in array:"+sum2);
		int sum3=sum2-sum1;
		System.out.println(sum3+" this is Missing number in array ");
		
 
	}

}
