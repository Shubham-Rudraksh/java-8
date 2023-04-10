package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceUse {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4,3,2,6,7,5,9);
		int sum =0;
		for( int no : numbers) {
			sum= sum+no;
		}
		System.out.println(sum);
		
		int sum1=numbers.stream().reduce(0, (a,b)->a+b);
		System.out.println(sum1);
		
		Optional<Integer> reducedSum = numbers.stream().reduce(Integer::sum);
		System.out.println(reducedSum.get());
		
		Integer multiply= numbers.stream().reduce(1, (a,b)-> a*b);
		System.out.println(multiply);
		
		Integer maxValue = numbers.stream().reduce(0, (a,b)-> a>b? a: b);
		System.out.println(maxValue);
		
		Integer maxValue1 = numbers.stream().reduce(Integer:: max).get();
		System.out.println(maxValue1);
		
		
		
		
		
	}

}
