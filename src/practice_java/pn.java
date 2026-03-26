package practice_java;

public class pn {

	public static void main(String[] args) {
		
		int n = 121;
		int o =n;
		int r = 0 ;
		
		
		while(n>0) {
			int digit = n %10;
			r = r *10 + digit;
			n = n/10;
		}
		
		if (o == r) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
	

	}

}
