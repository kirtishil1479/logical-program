package Arrayelements;

import java.util.Arrays;

public class sortingelement {

	public static void main(String[] args) {
		int a[]= {20,70,89,45,80,23,45,45,64,23};
		System.out.println("Before sorting of Array:"+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("After sorting og Array:"+Arrays.toString(a));

	}

}
