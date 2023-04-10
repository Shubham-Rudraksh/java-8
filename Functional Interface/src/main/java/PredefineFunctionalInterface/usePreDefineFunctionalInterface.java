package PredefineFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class usePreDefineFunctionalInterface {
	
	
	public static void main(String[] args) {
		
		User user = new User(1 ,"pawan", "Pune");
		User user1=new User(1 ,"nitin", "Pune");
//	using predicate 	
		Predicate<User> temp= (u) -> (u.getUserName().equalsIgnoreCase("pawan"));
		System.out.println(temp.test(user));	
		System.out.println(temp.test(user1));
	
//		using consumer simple
		Consumer<User> consumer= (u) ->{
			System.out.println(u.getId()+ " name: "+ u.getUserName()+ "  addr: "+ u.getAddress());
		};
		consumer.accept(user1);
		System.out.println();
		System.out.println("using consumer in stream");
		List<User> list= Arrays.asList(new User(1 ,"sagar", "Pune"), new User(2 ,"shubham", "kothrud"),new User(3 ,"swapnil", "warje"), new User(4 ,"rahul", "Baner"));
		list.stream().forEach(consumer);
		
//		using predicate with stream
		System.out.println("odd numbers");
		Predicate<Integer> predicate = t-> t%2 !=0;
		List<Integer> integerList= Arrays.asList(12,13,14,15,16,17,18,19,21,23,20,22);
		integerList.stream().filter(predicate).forEach(t-> System.out.print(t+ ", "));
		
	}

	
}
