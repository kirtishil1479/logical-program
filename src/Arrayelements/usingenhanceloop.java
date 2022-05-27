package Arrayelements;

import java.util.Scanner;

public class usingenhanceloop {

	public static void main(String[] args) {
		
		int a[]= {5,2,7,9,6};
		int sum=0;
		
		for(int value:a)
		{
			sum=sum+value;
		}
        
		System.out.println("Sum of array element is:"+sum);
	}

}
