package StringStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String3 {
	public static void main(String[] args) {
		List<String> str= Arrays.asList("shubham","kishor","amol","chetan",
						"deepak", "pawan","mayur","swapnil", "tanmay",
						"shubham","kishor","amol","kishor","mayur","mayur","amol" );
				
//		find the duplicate element in list
		Set<String> duplicate= str.stream()
									.filter(x-> Collections.frequency(str, x)>1)
									.collect(Collectors.toSet());
		System.out.println(duplicate);
//		find the  duplicated element and its count 
		Map<String, Long> duplicateCount = str.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(duplicateCount);
//		print the name without mayur  
		Set<String > s=str.stream().filter(x-> !x.equalsIgnoreCase("mayur")).collect(Collectors.toSet());
		System.out.println(s);
		
//		count no of vowel present
		
		String string1= "i am precious aadmi hammerer charmer";
		long num= string1.chars().filter(x-> (x=='a'||x=='i'|| x=='o'|| x=='e'||x=='u')).count();
		System.out.println(num);
		
//	characters and its count present in string
		Map<Character, Long> countingchars=string1.chars()
				.mapToObj(x-> (char) x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(countingchars);
		

		
	}

}
