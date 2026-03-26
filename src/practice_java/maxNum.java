package practice_java;

public class maxNum {
	
	public static void main(String[] args) {
	
	int arr[] = {1, 3, 26, 15, 18};

	int max = arr[0];

	for(int i=1;i<arr.length;i++)
	{
	    if(arr[i] > max)
	    {
	    	
	        max = arr[i];
	    }
	}

	System.out.println(max);
	}

}
