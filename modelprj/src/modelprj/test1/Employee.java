package modelprj.test1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	public enum Designation {
		MANAGER, DEVELOPER, TESTER
	}

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	private Designation designation;
	private long basicPay;
	private long salary;

	public Employee(String name, Designation designation, long basicPay) {
		this.name = name;
		this.designation = designation;
		this.basicPay = basicPay;
		this.salary = basicPay;
	}

	public Designation getDesignation() {
		return designation;
	}

	public long getBasicPay() {
		return basicPay;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", designation=" + designation + ", basicPay=" + basicPay
				+ ", salary=" + salary + '}';
	}
	
	public static void main(String args[]) {
		Employee employee1 = new Employee("A", Designation.MANAGER, 1000 );
		Employee employee2 = new Employee("B", Designation.DEVELOPER, 1000 );
		Employee employee3 = new Employee("C", Designation.TESTER, 1000 );
		Employee employee4 = new Employee("D", Designation.MANAGER, 1000 );
		Employee employee5 = new Employee("E", Designation.MANAGER, 1000 );
		
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(employee1);
		emplist.add(employee2);
		emplist.add(employee3);
		emplist.add(employee4);
		emplist.add(employee5);
		
		FilterEmployees filtered = new FilterEmployees() {
			
			@Override
			public boolean Filtered(Employee emp, String filterby) {
				if(emp.equals("A")){
  				return true;
			   }else {
				 return false;
			}
		}
    };
    	 makelist(filtered, emplist);
  }
	   public static void makelist(FilterEmployees empfilter, List<Employee> emplist) {
		        for(int i=0; i < emplist.size();i++) {
		        	  Employee emp = emplist.get(i);
		        	  if(empfilter.Filtered(emp, "A")){
		        		    emp.setSalary(10000);
		        	  }
		        }
	   }
}