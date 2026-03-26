package practice_java;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		
		int [] arr = {30,20,10,50,40};
		
		System.out.println("before sorting: ");
		
		for (int num : arr) {
			
			System.out.print(num+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		
		System.out.println("after sorting: ");
		
		for (int num : arr ) {
			System.out.print(num +" ");
		}
		

	}

}
