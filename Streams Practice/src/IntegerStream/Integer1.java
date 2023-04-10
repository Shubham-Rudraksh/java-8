package IntegerStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Integer1 {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(10,1,25,5,6,8,5,54,87,10,6,95,87,2,2,4,1,6,55,66,54,87,9);
		
//		find the duplicate element  and its count 
		
		Set<Integer> duplicateElement= list
				.stream()
				.filter(x->Collections.frequency(list, x)>1)
				.collect(Collectors.toSet());
		System.out.println(duplicateElement);
		
//		duplicate and its count
		
		Map<Integer, Long> duplicate = list.stream()
				.filter(x-> Collections.frequency(list, x)>1)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(duplicate);
//		no and its repeatation including one
		Map<Integer, Long> repeatCount = list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(repeatCount);
		
		
	}

}
