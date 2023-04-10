package EmployeeStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeImpl {
	public static void main(String[] args) {
		
		List <Employee> list = new ArrayList<>();
		list.add(new Employee(110, "shubham", "sambhajinagar", 26, "male", 90000, "dev"));
		list.add(new Employee(107, "swapnil", "akole", 28, "male", 70000, "dev"));
		list.add(new Employee(103, "rahul", "malkapur", 25, "male", 82000, "hr"));
		list.add(new Employee(104, "kishor", "pune", 23, "male", 68000, "dev"));
		list.add(new Employee(109, "payal", "wardha", 29, "female", 75000, "hr"));
		list.add(new Employee(101, "snehal", "wardha", 28, "female", 62000, "dev"));
		list.add(new Employee(106, "sharad", "sambhajinagar", 31, "male", 50000, "test"));
		list.add(new Employee(108, "abhijeet", "pune", 24, "male", 67000, "test"));
		list.add(new Employee(105, "supriya", "akole", 26, "female", 86000, "test"));
		list.add(new Employee(102, "rutuja", "sambhajinagar", 22, "female", 77000, "hr"));
		
		System.out.println(list);
//		find Average age of male and female employee
		Map<String, Double> avgAgeGenderWise = list.stream().
				collect(Collectors.groupingBy(Employee:: getGender, Collectors.averagingInt(Employee:: getAge)));
		System.out.println(avgAgeGenderWise);
		
//		count the employee of each department department
		Map<String, Long> departmentCount= list.stream().
				collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(departmentCount);
		departmentCount.entrySet().stream().forEach(System.out::println);
		
//		print all the department in organization
		list.stream().map(Employee:: getDepartment).distinct().forEach(System.out::println);
		
//		no of Employee in organization as per geneder
		Map<String, Long> genderWiseCount= list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(genderWiseCount);
//		get the details of highest salaried Employee in org.
		Optional<Employee> emp=list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(emp.get());
		 
//		what is average salary of each department
		Map<String, Double> avgSalaryDepartmentMap= list.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryDepartmentMap);
		avgSalaryDepartmentMap.entrySet().stream().forEach(x-> System.out.println(x.getKey()+"-"+ x.getValue()));
		
//		get the details of youngest male employee from dev department
		Employee youngEmployee=list.stream().filter(x-> x.getDepartment().equals("dev") && x.getGender().equalsIgnoreCase("male"))
		.min(Comparator.comparingInt(Employee::getAge)).get();
		
		System.out.println(youngEmployee);
		
		
//		how many male and female employee are there in dev team
		Map<String, Long> genderCountDev =list
							.stream()
							.filter(employee -> employee.getDepartment().equalsIgnoreCase("dev"))
							.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(genderCountDev);
		
		
//		what is average salary of male and female employee
		Map<String, Double> avarageSalaryGenderWise = list.
				stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avarageSalaryGenderWise);
		
//		List down name of all employee in each department
		Map<String, List<Employee>> departmentWiseList= list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(departmentWiseList);
		departmentWiseList.entrySet().stream().forEach(System.out:: println);
//		what is average salary and a total salary paid by organlization
		
		DoubleSummaryStatistics employeeSalaryStatistics= list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("avg salary "+ employeeSalaryStatistics.getAverage());
		System.out.println(" total salary "+employeeSalaryStatistics.getSum());
		System.out.println("min salary "+employeeSalaryStatistics.getMin());
		 
//   	max salary paid by organization	
		Double maxSalary= list.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getMax();
		System.out.println(maxSalary);
		
//		 who is the oldest employee in organization ? what is his age and which department he belong to..
		Employee mostAgedEmployee= list.stream().max(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println(mostAgedEmployee);

//		create a departmentwise employee who have highest salary
		Map<String, Employee> departmentwiseHighSalary= list.stream().
							collect(Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
		System.out.println(departmentwiseHighSalary);
	
//		Employee second highest Salary
		Employee secondHighestSalaryEmployee =list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().get();
		System.out.println(secondHighestSalaryEmployee);
		
//		age and count 
		Map<String, Long> ageAndCount =list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(ageAndCount);
		
//		sort by Id
		List<Employee> sortById=list.stream().sorted(Comparator.comparingInt(Employee:: getId)).collect(Collectors.toList());
		System.out.println(sortById);
		
//	 sort By Name
		List<Employee> sortByName =list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		System.out.println(sortByName);
		
//	 sort by salary
		List<Employee> sortBysalary = list.stream().sorted(Comparator.comparingDouble(Employee:: getSalary)).collect(Collectors.toList());
		System.out.println(sortBysalary);
		
//		list of employee department wise having salary greater than 75000
		Map<String, List<Employee>> employee1=list.stream().filter(x-> x.getSalary()>75000).collect(Collectors.groupingBy(Employee:: getDepartment));
		System.out.println(employee1);
		
	}
}
