package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest02 {
	//�����޼ҵ忡�� ����� �� �ֵ��� ��������� ����
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		EmpTest t = new EmpTest();
		t.mainMenu();
		
	}

	public void mainMenu() {
		Employee e = null;
		String menu = "******* ��� ���� ���� ���α׷� **********\n"
				    + "1. �� ��� ���� �Է�\n"
				    + "2. ��� ���� ����\n"
				    + "3. ��� ���� ����\n"
				    + "4. ������� ���\n"
				    + "9. ������\n"
				    + "*************************************\n"
				    + "�����ϼ��� =>";
		
		int selected = 0;
		while(true){
			System.out.print(menu);
			selected = sc.nextInt();
			switch (selected) {
				case 1:
					e = new Employee();
					e.empInput();
					break;
				case 2: modifyMenu(e);break;
				case 3: 
					//������������� �����ּҰ��� �����Ѵ�.
					//���� heap������ ��ü ������ garbage collector�� ���.
					e = null; 
					break;
				case 4: 
					//������� ���Է½� ������� �ʵ�����.
					//NullPointerException ����
					if(e==null) {
						System.out.println(">>���� ��������� �Է��ϼ���.");
						break;
					}	
					e.empOutput();
					break;
			}
			if(selected==9) break;
		}

	}

	private void modifyMenu(Employee e) {
		//���޵� e��ü�� null�� ���
		if(e == null){
			System.out.println("���� ��������� �Է��ϼ���.");
			return;
		}
			
		String menu = "******* ��� ���� ���� �޴� **********\n"
			    + "1. �̸� ����\n"
			    + "2. �޿� ����\n"
			    + "3. �μ� ����\n"
			    + "4. ���� ����\n"
			    + "9. �����޴��� �̵�\n"
			    + "*************************************";
		
		int selected = 0;
		while(true){
			System.out.println(menu);
			selected = sc.nextInt();
			switch (selected) {
				case 1:
					System.out.print("�̸� : ");
					e.setEmpName(sc.next());
					break;
				case 2:
					System.out.print("�޿� : ");
					e.setSalary(sc.nextInt());
					break;
				case 3: 
					System.out.print("�μ� : ");
					e.setDept(sc.next());
					break;
				case 4: 
					System.out.print("���� : ");
					e.setJob(sc.next());
					break;
			}
			if(selected==9) return;
		}
	}

}

