package StringStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String1 {
	public static void main(String[] args) {
//		counting empty string 
		List<String> str= Arrays.asList("abc", "pqr","xyz","","dssd","","bca", "shubham khusape","shubham rudraksh");
		Long emptyCount= str.stream().filter(x-> x.isEmpty()).count();
		System.out.println(emptyCount);
	
//		 counting the string having character more than 3
		str.stream().filter(x-> x.length()>3).forEach(System.out::println);
		
//		count the string start with 'a'
		System.out.println(str.stream().filter(c-> c.startsWith("a")).count());
		
//		count the string contain with 'shubham'
		System.out.println(str.stream().filter(c-> c.contains("shubham")).count());	
		
//		remove all empty String
		List<String> nonEmptyString= str.stream().filter(x-> !x.isEmpty()).collect(Collectors.toList());
		System.out.println(nonEmptyString);
		
//		convert String to uppercase and joint by ,
		String strBuild = nonEmptyString.stream().map(x-> x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(strBuild);
	}
}
