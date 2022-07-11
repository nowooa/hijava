package kh.java.oop.encapsulation;
//ĸ��ȭ
public class Account {
	//���������ڸ� ���� �������� ����
	//private : ���� Ŭ���� �ȿ����� ���� ����
	private String name;
	private long balance;
	
	//getter, setter�޼ҵ带 ���� ��ȸ����
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
	
	//�Ա� �޼ҵ�
	public void deposit(long money) {
		if(money <= 0) {
			System.out.println("�߸��� �Աݾ��Դϴ�.");
			return;
		}
		balance += money;
		System.out.println("["+ money + "]���� �ԱݵǾ����ϴ�.");
	}
	
	//��� �޼ҵ�
	public void withdraw(long money) {
		if(money <= 0) {
			System.out.println("�߸��� �ݾ��Դϴ�.");
			return;
		}
		if(money > balance) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		balance -= money;
		System.out.println("[" + money + "]���� ��ݵǾ����ϴ�.");
	}
	
	public void printAccountInfo() {
		System.out.println("---------------------------------");
		System.out.println("������ : " + name);
		System.out.println("�����ܾ� : " + balance);
		System.out.println("---------------------------------");
	}
	
	//�޴� ����Ʈ
	public void printMenu() {
	System.out.println("========= �ڹ� ���� =========");
	System.out.println("1. �̸�");
	System.out.println("2. �ܾ���ȸ");
	System.out.println("3. ����");
	System.out.println("4. ���");
	System.out.println("0. ����");
	System.out.print("�޴� ����: ");
	}
}
