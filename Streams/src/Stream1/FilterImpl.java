package Stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterImpl{
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("akash");
		list.add("mrunal");
		list.add("shreeman");
		list.add("shubham");
		list.add("nitin");
		list.add("mayur");
		list.add("prakash");
		list.add("sagar");
		
		List<String> listS=list.stream().filter(str-> str.startsWith("s")).collect(Collectors.toList());
		listS.stream().forEach(System.out::println);
	}
}