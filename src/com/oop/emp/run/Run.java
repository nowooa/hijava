package com.oop.emp.run;

import com.oop.emp.model.Employee03;

public class Run {

	public static void main(String[] args) {
		//�⺻ �����ڸ� ���� ��ü ����
		Employee03 emp1 = new Employee03();
		//4���� ��������� �޴� �����ڸ� ���� ��ü ����
		Employee03 emp2 = new Employee03(1, "ȫ�浿", '��', "010-1234-5678");
		//7���� ��������� �޴� �����ڸ� ���� ��ü ����
		Employee03 emp3 = new Employee03(2, "������", '��', "010-3131-3131", "������", 3_000_000, 0.15);
		 
		//�⺻������ ��ü�� ���� ���
		emp1.printEmployee();
		//4�� ��������� �޴� �����ڸ� ���� ������ ��ü ���� ���
		emp2.printEmployee();
		//7�� ��������� �޴� �����ڸ� ���� ������ ��ü ���� ���
		emp3.printEmployee();
	}

}
