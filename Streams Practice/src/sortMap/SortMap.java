package sortMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMap {
	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<>();
		map.put(4, "rahul");
		map.put(3, "shubham");
		map.put(6, "pankaj");
		map.put(2, "ajay");
		map.put(5, "yash");
		map.put(1, "chetan");
		Map<Integer, String> sortedMap= map
				.entrySet().stream()
//				.sorted(Comparator.comparingInt(Entry::getKey))
				.sorted(Entry.comparingByKey())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue));
		System.out.println(sortedMap);
		
	}

}
