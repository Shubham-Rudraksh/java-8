package filtermapreduce;

public class Employee {
	private int id;
	 private String name;
	 private String department;
	 private int salary;
	 private String grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", grade=" + grade + "]";
	}
	

	public Employee(int id, String name, String department, int salary, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.grade = grade;
	}
	
}
