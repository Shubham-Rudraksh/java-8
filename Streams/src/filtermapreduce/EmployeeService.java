package filtermapreduce;

import java.util.Optional;
import java.util.function.Function;

public class EmployeeService {
public static void main(String[] args) {
	double avgSalary = new EmployeeDao().getAllEmployees().stream()
									.filter(x-> x.getGrade().equals("A"))
									.map(emp-> emp.getSalary())
									.mapToInt(x->(int) x)
									.average().getAsDouble();
	System.out.println(avgSalary);
	
}
}
