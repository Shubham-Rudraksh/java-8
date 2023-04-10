package IntegerStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class B {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(10,1,25,5,6,8,10,6,95,87,2,2,4,1,6,55,66,54,87,9);
		
//		Create list of square of all distinct nos
		List<Integer> squareList= list.stream().map(i->i*i).distinct().collect(Collectors.toList());
		System.out.println(squareList);
		
//		print number in reversed order with distinct
		List<Integer> reverseOrder= list.stream().sorted(Collections.reverseOrder()).distinct().collect(Collectors.toList());
		System.out.println(reverseOrder);
//		num start with a 5
		List<String> str= list.stream().map(x->x+"").filter(x-> x.startsWith("5")).collect(Collectors.toList());
		System.out.println(str);
		
//		duplicate number count in the list
		Map<Integer, Long> duplicateCount= list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); 
		System.out.println(duplicateCount);
		
//		remove duplicate element from list
		List<Integer> i= list.stream().distinct().collect(Collectors.toList());
		System.out.println(i);
		
		IntSummaryStatistics summary =list.stream().mapToInt(x->x).summaryStatistics();
		System.out.println(summary.getAverage()+" & sum = "+ summary.getSum());
		System.out.println(summary.getCount());
		System.out.println(summary.getMax() + "-" + summary.getMin());
		
		
		
		
	}
}
