package IntegerStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class A {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(13);
		list.add(18);
		list.add(10);
		list.add(17);
		list.add(25);
		list.add(23);
		list.add(9);
		list.add(16);
		list.add(13);
		list.add(18);
		list.add(10);
		list.add(17);
		System.out.println(list);
		System.out.println("*****************Method References**********************");
		list.forEach(System.out::println);
		System.out.println("*****************Sorted List**********************");
		List<Integer>sortedList=list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println("*****************Reversed Sorted List**********************");
		List<Integer> reverseSortedList=list.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(reverseSortedList);
		
	}

}
