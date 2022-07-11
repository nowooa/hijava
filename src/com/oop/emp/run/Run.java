package com.oop.emp.run;

import com.oop.emp.model.Employee03;

public class Run {

	public static void main(String[] args) {
		//기본 생성자를 통한 객체 생성
		Employee03 emp1 = new Employee03();
		//4개의 멤버변수를 받는 생성자를 통해 객체 생성
		Employee03 emp2 = new Employee03(1, "홍길동", '남', "010-1234-5678");
		//7개의 멤버변수를 받는 생성자를 통해 객체 생성
		Employee03 emp3 = new Employee03(2, "유관순", '여', "010-3131-3131", "영업부", 3_000_000, 0.15);
		 
		//기본생성자 객체의 정보 출력
		emp1.printEmployee();
		//4개 멤버변수를 받는 생성자를 통해 생성된 객체 정보 출력
		emp2.printEmployee();
		//7개 멤버변수를 받는 생성자를 통해 생성된 객체 정보 출력
		emp3.printEmployee();
	}

}
