package EmployeeTask;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Company implements ICompany {
	
	private String name;
	
	//department name -> set of departments
	private Map<String, Set<Employee>> departments;
	
	

	public Company(String name) {
		setName(name);
		departments = new HashMap<String, Set<Employee>>();
	}
	
	
	@Override
	public void addEmployee(Employee e, String department){
		if(e != null && department != null && department.length() > 0){
			if(!departments.containsKey(department)){
				departments.put(department, new HashSet<Employee>());
			}
			departments.get(department).add(e);
		}
	}
	
	@Override
	public void listAllEmployees(){
		for (String department : departments.keySet()){
			System.out.println("Department : " + department);
			Set<Employee> employeesInThisDepartmanet = departments.get(department);
			
			for(Employee e : employeesInThisDepartmanet){
				System.out.println(e);
			}
		}
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
