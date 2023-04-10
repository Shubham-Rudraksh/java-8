package SupplierFunctionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierImpl{
	public static void main(String[] args) {
		
		Supplier supplier=  new Supplier<String>() {	
		@Override
		public String get()
		{ 
			return "Hii i am supplying "; 
		}
		};
		System.out.println(supplier.get());
		
		Supplier supplier1= ()-> "i am unstoppable today!";
		System.out.println(supplier1.get());
		
		List<String> list = Arrays.asList("Shubham", "Swapnil","pankaj");
		String str=list.stream().findAny().orElseGet(supplier1);
		System.out.println(str);
	}

	
}
