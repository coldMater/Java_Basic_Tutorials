package com.WriteJXL;

public class Info {
	private String department;
	private String name;
	private String level;
	private String salary;
	
	public Info(String department, String name, String level, String salary) {
		this.department = department;
		this.name = name;
		this.level = level;
		this.salary = salary;
	}
	
	public String getDepartment() {
		return department;
	}
	public String getName() {
		return name;
	}
	public String getLevel() {
		return level;
	}
	public String getSalary() {
		return salary;
	}
}
