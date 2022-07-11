package kh.java.oop.encapsulation;
//캡슐화
public class Account {
	//접근제한자를 통해 직접접근 방지
	//private : 같은 클래스 안에서만 접근 가능
	private String name;
	private long balance;
	
	//getter, setter메소드를 통해 우회접근
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	//입금 메소드
	public void deposit(long money) {
		if(money <= 0) {
			System.out.println("잘못된 입금액입니다.");
			return;
		}
		balance += money;
		System.out.println("["+ money + "]원이 입금되었습니다.");
	}
	
	//출급 메소드
	public void withdraw(long money) {
		if(money <= 0) {
			System.out.println("잘못된 금액입니다.");
			return;
		}
		if(money > balance) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= money;
		System.out.println("[" + money + "]원이 출금되었습니다.");
	}
	
	public void printAccountInfo() {
		System.out.println("---------------------------------");
		System.out.println("계좌주 : " + name);
		System.out.println("현금잔액 : " + balance);
		System.out.println("---------------------------------");
	}
	
	//메뉴 프린트
	public void printMenu() {
	System.out.println("========= 자바 은행 =========");
	System.out.println("1. 이름");
	System.out.println("2. 잔액조회");
	System.out.println("3. 예금");
	System.out.println("4. 출금");
	System.out.println("0. 종료");
	System.out.print("메뉴 선택: ");
	}
}
