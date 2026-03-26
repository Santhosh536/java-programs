package practice_java;

public class sortarraymanual {

	public static void main(String[] args) {

		int[] arr = { 20, 10, 50, 30, 40 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.print("sorted array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}
}
