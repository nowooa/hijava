package com.oop.emp.model;

import java.util.Scanner;

public class Employee02 {
	private int empNo;					//���
	private String empName;		//�̸�
	private String dept;				//�ҼӺμ�
	private String job;					//����
	private int age;						//����
	private char gender;				//����
	private int salary;					//�޿�
	private double bonusPoint;	//���ʽ�����Ʈ
	private String phone;				//�ڵ���
	private String address;			//�ּ�
	
	//Ű�����Է¿�޼ҵ�
	public void empInput(){
		Scanner sc = new Scanner(System.in);
		
		//���ʵ�� private�̹Ƿ� Ŭ�������ο��� ���ٰ���
		System.out.print("��� : ");
		this.empNo = sc.nextInt();
		System.out.print("�̸� : ");
		empName = sc.next();
		System.out.print("�ҼӺμ� : ");
		dept = sc.next();
		System.out.print("���� : ");
		job = sc.next();
		System.out.print("���� : ");
		age = sc.nextInt();
		System.out.print("���� : ");
		gender = sc.next().charAt(0);
		System.out.print("�޿� : ");
		salary = sc.nextInt();
		System.out.print("���ʽ�����Ʈ : ");
		bonusPoint = sc.nextDouble();
		System.out.print("�ڵ��� : ");
		phone = sc.next();
		sc.nextLine();//13 �������
		System.out.print("�ּ� : ");
		address = sc.nextLine();
		
	}
	
	//��¿�޼ҵ�
	public void empOutput(){
		String str = "��� : " + this.empNo; 
		str += "\n�̸� : "+this.empName;
		str += "\n�ҼӺμ� : "+this.dept;
		str += "\n���� : "+this.job;
		str += "\n���� : "+this.age;
		str += "\n���� : "+this.gender;
		str += "\n�޿� : "+this.salary;
		str += "\n���ʽ�����Ʈ : "+this.bonusPoint;
		str += "\n�ڵ��� : "+this.phone;
		str += "\n�ּ� : "+this.address;
		System.out.println(str);
	}
	
	//getter/setter ��������
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

