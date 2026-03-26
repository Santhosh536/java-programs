package practice_java;

import java.util.*;

public class khokho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = {1,2,3,4,5};
		
		
		int correct = arr[0];
		int count = 1;
		
		for (int i = 1; i<arr.length;i++) {
		if (arr[i]== correct) {
			
			count ++;
	
		}
		
		
		}
		
		int wrong = arr.length-count;
		
		System.out.println("No of friend telling wrong:");
		System.out.println(wrong);

		System.out.println(count +" t shirts");
	}

}
