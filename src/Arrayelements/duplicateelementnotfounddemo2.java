package Arrayelements;

public class duplicateelementnotfounddemo2 {

	public static void main(String[] args) {
		   
		
		
	String s[]= {"java","c","c++","python","java"};
		
		boolean flag=false;
		
		for(String s1:s)
		{
			
			if(flag==true) {
				System.out.println("Found duplicate element");
				flag=true;
			}
		}
		
                  if(flag==false)
                  {
                	  System.out.println("duplicate number not found");
                  }
	}

}
