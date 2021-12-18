package com.example;

public class Employee implements Comparable {

	private Integer id;
	private String name;
	private String role;
	private Double salary;
	public Employee(Integer id, String name, String role,double salary) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary=salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.getId().compareTo(((Employee) o).getId());
	}
}
