package Arrayelements;

public class Searchingelementinarray {

	public static void main(String[] args) {
		
		int a[]= {10,20,50,40,30};
		int search_ele=50;
		
		for(int i=0;i<a.length;i++)
		{
			if(search_ele==a[i]);{
				System.out.println("Element found at:"+i);
				break;
				
			}
		}
		 System.out.println("Element not found");
          
	}

}
