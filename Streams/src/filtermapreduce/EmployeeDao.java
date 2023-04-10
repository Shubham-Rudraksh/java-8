package filtermapreduce;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	public static List<Employee> getAllEmployees(){
		List < Employee> list= new ArrayList<>();
		list.add(new Employee(1, "shubham", "hr", 24000,"A"));
		list.add(new Employee(2, "devil", "prod", 25000,"B"));
		list.add(new Employee(3, "ankush", "dev", 24000,"B"));
		list.add(new Employee(4, "ramu", "hr", 18000,"C"));
		list.add(new Employee(5, "pravin", "testing", 13000, "A"));
		list.add(new Employee(6, "binod", "prod", 19000,"A"));
		list.add(new Employee(7, "karan", "dev", 10000,"C"));
		list.add(new Employee(8, "chetan", "hr", 16000,"C"));
		list.add(new Employee(9, "tanvi", "hr", 11000,"B"));
		
		return list;
	}

}
