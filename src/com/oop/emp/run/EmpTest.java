package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {
	public static void main(String[] args) {
		EmpTest empt = new EmpTest();
		empt.mainMenu();
	}
	
	public void modifyMenu(Employee e) {
		//setter 이용해서 키보드로 입력받은 값 객체 필드에 기록
		Scanner sc = new Scanner(System.in);
		System.out.print("********** 사원 정보 수정 메뉴 **********\n"
				+ "	1. 이름 변경\n"
				+ "	2. 급여 변경\n"
				+ "	3. 부서 변경\n"
				+ "	4. 직급 변경\n"
				+ "	5. 이전 메뉴로 이동\n"
				+ "********************************************\n"
				+ "부메뉴 입력 > ");
		int Mmenu = sc.nextInt();
		sc.nextLine();
		System.out.println("수정 값 : ");
		String set = sc.nextLine();
		
		switch(Mmenu) {
			case 1 : 
				System.out.println("이름 입력 : ");
				e.setEmpName(set);
				break;
			case 2 : 
				System.out.println("급여 입력 : ");
				e.setSalary(Integer.parseInt(set));
				break;
			case 3 : 
				System.out.println("부서 입력 : ");
				e.setDept(set);
				break;
			case 4 : 
				System.out.println("직급 입력 : ");
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
			System.out.println("******* 사원 정보 관리 프로그램 ************");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원정보 출력");
			System.out.println("9. 끝내기");
			System.out.println("********************************************");
			System.out.print("메뉴 입력 > ");
			menu = sc.nextInt();
			if(menu == 1) {
				if(emp == null) {
					emp = new Employee();
					emp.empInput();
				}else {
					System.out.println("이미 저장된 값이 있습니다.");
				}
			}else if(menu == 2) {
				if(emp == null) {
					System.out.println("저장된 회원 정보가 없습니다. 회원 정보를 입력하세요.");
				}else {
					modifyMenu(emp);
				}
			}else if(menu == 3) {
				if(emp == null) {
					System.out.println("저장된 회원 정보가 없습니다. 회원 정보를 입력하세요.");
				}else {
					emp = null;
				}
			}else if(menu == 4) {
				if(emp == null) {
					System.out.println("저장된 회원 정보가 없습니다. 회원 정보를 입력하세요.");
				}else {
					emp.empOutput();
				}
			}else if(menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break; 
			}else {
				System.out.println("잘못입력했습니다. 다시 입력해주세요.\n");
			}
		}
	}
}
