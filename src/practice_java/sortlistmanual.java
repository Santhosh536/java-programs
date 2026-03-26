package practice_java;
import java.util.*;

public class sortlistmanual {

	public static void main(String[] args) {
		
		List <Integer> list = new ArrayList<>();
		list.add(30);
		list.add(50);
		list.add(40);
		list.add(10);
		list.add(20);
		
		for (int i = 0; i<list.size()-1; i++) {
			for (int j = 0; j<list.size()-1-i; j++) {
				
				if (list.get(j)>list.get(j+1)) {
					
					int temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
					
				}
			}
		}
		
		System.out.println("sorted list: "+list);
		
		
		
	}
}
