package Primenumber;



public class demo1 {

	public static void main(String[] args) {
	
		
		int [] num= {2,3,5,7,11,13,17,19,23,29};
		
		int count = 0;
		
				for(int i=0;i<=num.length;i ++)
				{
					if(num%1==0)
						count++;
				}
				if(count==2) {
				System.out.println("prime number");
				}
			
			else
			{
				System.out.println("Not prime number");
			}
			}
			
		
		

	}

}
