package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {
	public static void main(String[] args) {
		EmpTest empt = new EmpTest();
		empt.mainMenu();
	}
	
	public void modifyMenu(Employee e) {
		//setter �̿��ؼ� Ű����� �Է¹��� �� ��ü �ʵ忡 ���
		Scanner sc = new Scanner(System.in);
		System.out.print("********** ��� ���� ���� �޴� **********\n"
				+ "	1. �̸� ����\n"
				+ "	2. �޿� ����\n"
				+ "	3. �μ� ����\n"
				+ "	4. ���� ����\n"
				+ "	5. ���� �޴��� �̵�\n"
				+ "********************************************\n"
				+ "�θ޴� �Է� > ");
		int Mmenu = sc.nextInt();
		sc.nextLine();
		System.out.println("���� �� : ");
		String set = sc.nextLine();
		
		switch(Mmenu) {
			case 1 : 
				System.out.println("�̸� �Է� : ");
				e.setEmpName(set);
				break;
			case 2 : 
				System.out.println("�޿� �Է� : ");
				e.setSalary(Integer.parseInt(set));
				break;
			case 3 : 
				System.out.println("�μ� �Է� : ");
				e.setDept(set);
				break;
			case 4 : 
				System.out.println("���� �Է� : ");
				e.setJob(set);
				break;
			case 5 : 
				return;
			default : 
				break;
		}
	}
	
	public void mainMenu() {
		Employee emp = null;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int menu;
			System.out.println("******* ��� ���� ���� ���α׷� ************");
			System.out.println("1. �� ��� ���� �Է�");
			System.out.println("2. ��� ���� ����");
			System.out.println("3. ��� ���� ����");
			System.out.println("4. ������� ���");
			System.out.println("9. ������");
			System.out.println("********************************************");
			System.out.print("�޴� �Է� > ");
			menu = sc.nextInt();
			if(menu == 1) {
				if(emp == null) {
					emp = new Employee();
					emp.empInput();
				}else {
					System.out.println("�̹� ����� ���� �ֽ��ϴ�.");
				}
			}else if(menu == 2) {
				if(emp == null) {
					System.out.println("����� ȸ�� ������ �����ϴ�. ȸ�� ������ �Է��ϼ���.");
				}else {
					modifyMenu(emp);
				}
			}else if(menu == 3) {
				if(emp == null) {
					System.out.println("����� ȸ�� ������ �����ϴ�. ȸ�� ������ �Է��ϼ���.");
				}else {
					emp = null;
				}
			}else if(menu == 4) {
				if(emp == null) {
					System.out.println("����� ȸ�� ������ �����ϴ�. ȸ�� ������ �Է��ϼ���.");
				}else {
					emp.empOutput();
				}
			}else if(menu == 9) {
				System.out.println("���α׷��� �����մϴ�.");
				break; 
			}else {
				System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���.\n");
			}
		}
	}
}
