package flatmapandmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDao {
	public List<Customer> getAllCustomer(){
		
		List<Customer> list =  new ArrayList<>();
		list.add(new Customer(1, "shubham", "shubham@gmail.com", Arrays.asList("3452488", "74552489")));
		list.add(new Customer(2, "snehal", "snehal@gmail.com",  Arrays.asList("1255544","96458544")));
		list.add(new Customer(3, "swapnil", "swapnil@gmail.com",  Arrays.asList("415222","5244136")));
		list.add(new Customer(4, "nikhil", "nikhil@gmail.com",  Arrays.asList("42561522","1234568")));
		list.add(new Customer(5, "nitin", "nitin@gmail.com",  Arrays.asList("85220101","521144635")));
		list.add(new Customer(6, "rahul", "rahul@gmail.com",  Arrays.asList("12523685","12520002")));

		return list;
	}

}