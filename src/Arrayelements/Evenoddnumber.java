package Arrayelements;

public class Evenoddnumber {

	public static void main(String[] args) {
	             
		int a[]= {1,2,3,4,5,6};
		
		// extracting even number
		
		System.out.println("Even no in array is.....");
		for(int i=0;i<a.length;i++) {
			if (a[i]%2==0) {
			System.out.println(a[i]);
			}
		}
    
		// Extracting odd number
		System.out.println("odd no in array is.....");
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
			System.out.println(a[i]);
			}
			
		}
		  
	}
	

}
