package flatmapandmap;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {
	
	public static Customer findCustomerByEmailId (String email) throws Exception {
		
		return new CustomerDao().getAllCustomer().stream().
				filter(obj-> obj.getEmailId().equals(email)).
				findAny().orElseThrow(()->new Exception("email id you entered not found in database"));
	}
	
	public static void main(String[] args) throws Exception {
		
		
		
		
		
//		using map to collect email OnetoOne connection
		System.out.println("getting list of email ID using map");
		List <String> emailList= new CustomerDao().getAllCustomer().stream().map(emp-> emp.getEmailId()).collect(Collectors.toList());
		System.out.println(emailList);
		System.out.println();
		System.out.println("getting list of mobileno OnetoMany using map");	
// 		using map to collect OnetoMany connection 		
		List<List<String>> phoneList= new CustomerDao().getAllCustomer().stream().map(emp-> emp.getMobileNo()).collect(Collectors.toList());
		System.out.println(phoneList);
		System.out.println();		
		System.out.println("getting list of mobileno OnetoMany using flatmap");	
//		using map to collect OnetoMany connection 	
		List<String > mobileList= new CustomerDao().getAllCustomer().stream().flatMap(e-> e.getMobileNo().stream()).collect(Collectors.toList());
		System.out.println(mobileList);
		
		
//		custom Exception 
		System.out.println(findCustomerByEmailId("shubh@gmail.com"));
	}

}
