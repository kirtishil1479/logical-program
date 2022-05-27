package Arrayelements;

public class othrdemo {

	public static void main(String[] args) {
	       
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println("even number of array is: "+ value);
			}
		}
		
       for(int value:a)
       {
    	   if(value%2!=0)
    	   {
    		   System.out.println("odd number of array is: "+value);
    	   }
       }
	}

}
