package kh.java.oop.encapsulation;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		//���°�ü ���� �� ����
//		Account honggd = new Account();
//		honggd.setName("ȫ�浿");
//		honggd.setBalance(1_000_000);
//		honggd.printAccountInfo();
//		
//		//�Ա�
//		honggd.deposit(100_000); //�Աݸ޼ҵ� ȣ��
//		honggd.printAccountInfo();
//		
//		//���
//		honggd.withdraw(300_000); // ��ݸ޼ҵ� ȣ��
//		honggd.printAccountInfo();
		
		Account guest1 = new Account();
		Scanner sc = new Scanner(System.in);
		long money = 0;
		
		//���� �Ա��غ���
		END : 
			while(true) {
				guest1.printMenu();
				int choice=sc.nextInt();
				switch(choice) {
				case 1 : 
					System.out.print("�̸�: ");
					guest1.setName(sc.next());
					break;
				case 2 : 
					guest1.printAccountInfo();
					break;
				case 3 : 
					System.out.print("����: ");
					guest1.deposit(sc.nextLong());
					break;
				case 4 : 
					System.out.print("���: ");
					guest1.withdraw(sc.nextLong());
					break;
				case 0 :
					System.out.println("�����մϴ�.");
					break END;
				default :
					System.out.println("0~5���� ������ �ּ���.");
					break;
				}
			}
	}
}
