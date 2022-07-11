package kh.java.oop.encapsulation;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		//계좌객체 생성 및 관리
//		Account honggd = new Account();
//		honggd.setName("홍길동");
//		honggd.setBalance(1_000_000);
//		honggd.printAccountInfo();
//		
//		//입금
//		honggd.deposit(100_000); //입금메소드 호출
//		honggd.printAccountInfo();
//		
//		//출금
//		honggd.withdraw(300_000); // 출금메소드 호출
//		honggd.printAccountInfo();
		
		Account guest1 = new Account();
		Scanner sc = new Scanner(System.in);
		long money = 0;
		
		//내가 입금해보기
		END : 
			while(true) {
				guest1.printMenu();
				int choice=sc.nextInt();
				switch(choice) {
				case 1 : 
					System.out.print("이름: ");
					guest1.setName(sc.next());
					break;
				case 2 : 
					guest1.printAccountInfo();
					break;
				case 3 : 
					System.out.print("예금: ");
					guest1.deposit(sc.nextLong());
					break;
				case 4 : 
					System.out.print("출금: ");
					guest1.withdraw(sc.nextLong());
					break;
				case 0 :
					System.out.println("종료합니다.");
					break END;
				default :
					System.out.println("0~5번만 선택해 주세요.");
					break;
				}
			}
	}
}
