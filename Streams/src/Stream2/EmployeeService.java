package Stream2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
	
	public List<Employee> sortByslary(String str){
		
		return (str.equalsIgnoreCase("less"))?EmployeeDao.getAllEmployees().stream().filter(x-> x.getSalary()< 15000).collect(Collectors.toList()):
			(str.equalsIgnoreCase("high"))?EmployeeDao.getAllEmployees().stream().filter(x-> x.getSalary()> 15000).collect(Collectors.toList()):
				null;
	
	} 
	
	public List <Employee> sortBySalary(){
		return EmployeeDao.getAllEmployees().stream().sorted(((o1,o2)->o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
		
	}
	
	public List <Employee> sortBySalary1(){
		return EmployeeDao.getAllEmployees().stream().sorted(Comparator.comparingInt(emp-> emp.getSalary())).collect(Collectors.toList());
		
	}
	
	public List <Employee> sortByDepartment(){
		return EmployeeDao.getAllEmployees().stream().sorted(Comparator.comparing(Employee::getDepartment).reversed()).collect(Collectors.toList());
		
	}
	public static void main(String[] args) {
		System.out.println(new EmployeeService().sortByslary("high"));
		System.out.println("sort by salary");
		System.out.println(new EmployeeService().sortBySalary());
	
		System.out.println("sort by salary1 ");
		System.out.println(new EmployeeService().sortBySalary1());
		
		System.out.println("sort by department descending ");
		System.out.println(new EmployeeService().sortByDepartment());
	}

}
