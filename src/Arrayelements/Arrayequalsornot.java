package Arrayelements;

import java.lang.reflect.Array;

public class Arrayequalsornot {

	public static void main(String[] args) {
	    
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		
		boolean status=true;
		
	 if(a1.length==a2.length)
	 {
		 for(int i=0;i<a1.length;i++)
		 {
		   if (a1[i]!=0)
		   {
			   status=false;
		   }
		 }
	 }
	 else
       {     status=false;
       }
    	   
    		   if(status==true)
    		   {
    			  System.out.println("Array is equal");
    		   }
    		   else {
    			   System.out.println("Array is not equal");
    		   }
    	   }
       
	}


