package Arrayelements;

public class finfmaxandmin {

	public static void main(String[] args) {
	     
	int a[]= {100,49 ,59, 68, 370, 42 };
		int max=0;
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("maximim no in array is :"+max);    
		
	    
int min=a[0];
		
		
		for(int i=1;i<=a.length;i++);
		{
			int i=0;
			
			if(min>a[i]) 
			{
				min=a[i];
			}
		}
		System.out.println("minimum no in array is:"+min);
		
	}

}
