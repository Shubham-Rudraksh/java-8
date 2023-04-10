package optional;

import java.util.Optional;

public class MainClass {
	public static void main(String[] args) {
		Customer customer= new Customer(1, "pratik", null, "415255585");
		Optional<String> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		Optional<String> optionalof = Optional.of(customer.getName());
		System.out.println(optionalof.get());
		
//		Optional<String> optionalof1 = Optional.of(customer.getEmailId());
//		System.out.println(optionalof1.get());
		
		Optional<String> optionalofNullable= Optional.ofNullable(customer.getEmailId());
		System.out.println(optionalofNullable.orElse("tuzi layki nay bhava"));
		
		Customer customer2= new Customer(2, "shubham", "shubham@gmail.com", "415255585");
		Optional<String> exceptionOptional = Optional.ofNullable(customer2.getEmailId());
		
//		it will throw custom Exception
//		exceptionOptional.orElseThrow(()-> new IllegalArgumentException("email is not present"));
		System.out.println(exceptionOptional.map(String::toUpperCase).orElseGet(()-> "default@gmail.com"));

	}

}
