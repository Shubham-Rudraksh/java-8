package Stream1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamBasic {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.stream().forEach(System.out:: println);
		list.stream().filter(t-> t%2==0).forEach(t-> System.out.println(t));
		
		Map< Integer, String > map= new HashMap<>();
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");
		map.put(4, "ddd");
		map.entrySet().forEach(obj-> System.out.println(obj));
		System.out.println("print even key value");
		map.entrySet().stream().filter(t-> t.getKey()%2==0).forEach(System.out::println);
		
	}

}
