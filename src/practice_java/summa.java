package practice_java;

public class summa {

	public static void main(String[] args) {
		
	String name="sabari";
	String rev="";
	int age=21;
	String gender="Male";
	int n=7;
	int [] m1= {70,40,75,63,90};
	int sum=0;
	
	System.out.println("my name is "+name);
	System.out.println("my age is "+age);
	System.out.println("my gender is "+gender);
	System.out.println();

	for(int i=name.length()-1;i>=0;i--) {
		rev=rev+name.charAt(i);
	}
	System.out.println(rev);
	}

}
