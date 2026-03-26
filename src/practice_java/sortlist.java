package practice_java;

import java.util.*;

public class sortlist {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(10);
		list.add(40);

		System.out.println("before sort: " + list);

		int index = Collections.binarySearch(list, 20);

		System.out.println("searching index: " + index);

		Collections.sort(list);

		System.out.println("after sorting: " + list);
		
		int index1 = Collections.binarySearch(list, 20);

		System.out.println("searching index: " + index1);

	}

}
