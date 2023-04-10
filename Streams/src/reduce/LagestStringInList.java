package reduce;

import java.util.Arrays;
import java.util.List;

public class LagestStringInList {
	public static void main(String[] args) {
		List<String> strList= Arrays.asList("Shubham", "java", "unstoppable", "important", "sycho");
		String LargestString= strList.stream().reduce((w1, w2)-> (w1.length()>w2.length()) ? w1: w2 ).get();
		System.out.println(LargestString);
	}

}
