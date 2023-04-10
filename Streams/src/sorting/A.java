package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class A {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(8,5,10,1,7,2,4,3,6,9);

	List <Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
	System.out.println("sorting "+ sortedList);
	
	List <Integer> reverseSortedList=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println("sorting "+ reverseSortedList);
}
}
