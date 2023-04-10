package StringStream;

import java.util.Arrays;
import java.util.List;

public class String2 {
	public static void main(String[] args) {
		
		List<String> str= Arrays.asList("shubham","kishor","amol","chetan","deepak", "pawan","mayur","swapnil", "tanmay");
//		sort name wise and convert to uppercase
		str.stream().sorted().map(x-> x.toUpperCase()).forEach(System.out:: println);
		
		str.stream().sorted((a,b)-> b.compareTo(a)).forEach(System.out::println);
	}

}
