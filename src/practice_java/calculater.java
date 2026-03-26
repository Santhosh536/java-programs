package practice_java;
import java.util.Scanner;

public class calculater {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		char sol = scan.next().charAt(0);
		int b = scan.nextInt();
		
		switch(sol) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			if (b == 0) {
				System.out.println("undefined");
			} else {
				System.out.println(a/b);
			}
			break;
		case 5:
			System.out.println("default");
		}
	}

}
