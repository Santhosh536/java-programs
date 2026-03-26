package practice_java;

public class MaxProfit {
	
	public static int maximum (int[] price) {
		
		int maximum = 0;
		
		for (int i = 0; i < price.length; i++ ) {
			
			for (int j = i; j < price.length; j++) {
				
				int profit = price[j] - price[i];
				
				if (profit > maximum) {
					maximum = profit;
				}
				
				
			}
		}
		
		return maximum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {7,1,5,3,6,4};
		System.out.println(maximum(arr));
	}

}
