package Stream3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;



public class SortMap {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("ddd", 5);
		map.put("aaa", 3);
		map.put("eee", 2);
		map.put("ccc", 4);
		map.put("bbb", 1);
		System.out.println("Sort by key");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	System.out.println("Sort by value");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		Map<Employee, Integer> empMap= new TreeMap<Employee,Integer >((o1,o2)-> o1.getSalary()-o2.getSalary());
		empMap.put(new Employee(1, "shubham", "hr", 24000), 60);
		empMap.put(new Employee(2, "devil", "prod", 25000),30);
		empMap.put(new Employee(3, "ankush", "dev", 24000),40);
		empMap.put(new Employee(4, "ramu", "hr", 18000),10);
		empMap.put(new Employee(5, "pravin", "testing", 13000),70);
		empMap.put(new Employee(6, "binod", "prod", 19000),20);
		empMap.put(new Employee(7, "karan", "dev", 10000),90);
		empMap.put(new Employee(8, "chetan", "hr", 16000),80);
		empMap.put(new Employee(9, "tanvi", "hr", 11000),50); 
		
		
	Map<Employee, Integer>m= empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1,o2)-> o1,LinkedHashMap::new));
	System.out.println(m);	
		
	}

}
