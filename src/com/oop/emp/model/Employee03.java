package com.oop.emp.model;

public class Employee03 {

	int empNo;
	String name;
	char gender;
	String phone;
	String dept;
	int salary;
	double bonusPct;
	public Employee03() {
		
	}
	public Employee03(int empNo, String name, char gender,String phone, String dept, int salary, double bonusPct) {
		this(empNo,name,gender,phone);
		this.dept = dept;
		this.salary = salary;
		this.bonusPct = bonusPct;
	}
	
	public Employee03(int empNo, String name, char gender, String phone) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	
	public void printEmployee() {
		System.out.print(this.empNo + ", ");
		System.out.print(this.name + ", ");
		System.out.print(this.gender + ", ");
		System.out.print(this.phone + ", ");
		System.out.print(this.dept + ", ");
		System.out.print(this.salary + ", ");
		System.out.print(this.bonusPct + "\n");
	}
	public int getEmpNo() {
		return empNo;
	}
	public void SetEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public double getBonusPct() {
		return bonusPct;
	}
	public void setBonusPct(double bonusPct) {
		this.bonusPct = bonusPct;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}

