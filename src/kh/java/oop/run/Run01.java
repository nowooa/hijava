package kh.java.oop.run;

import java.util.Scanner;

import kh.java.oop.encapsulation.StaticMethod;
import kh.java.oop.encapsulation.StaticMethod02;

public class Run01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod02 sm = new StaticMethod02();
		System.out.println(sm.toUpper("abdfgsg"));
		System.out.println(sm.setChar("apple",2,'b'));
		System.out.println(sm.getAlphabetLength("staticMethod"));
		System.out.println(sm.concat("apple ","banana"));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڿ��� ��� �빮�ڷ� �ٲٴ� static �޼ҵ�");
		System.out.print("�빮�ڷ� �ٲٴ� �޼ҵ� : ");
		System.out.println(sm.toUpper(sc.next()));
		
		System.out.println("���ڿ�(1)���� ���޹��� �ε���(2)�� ���ڸ� ���޹��� ����(3)�� �����ϴ� static �޼ҵ�");
		System.out.print("���ڿ�1 : ");
		String str1 = sc.next();
		System.out.print("�ε��� : ");
		int num = sc.nextInt();
		System.out.print("���ڿ�2 : ");
		char cha = sc.next().charAt(0);
		System.out.println(sm.setChar(str1, num, cha));
		
		System.out.println("������ ���ڿ����� �������� ������ �����ϴ� static �޼ҵ�");
		System.out.print("�������� ������ ���� : ");
		System.out.println(sm.getAlphabetLength(sc.next()));
		
		System.out.println("������ ���ڿ����� �ϳ��� ���ļ� ���� ");
		System.out.print("���ڿ�1 : ");
		String str2 = sc.next();
		System.out.print("���ڿ�2 : ");
		String str3 = sc.next();
		System.out.println(sm.concat(str2, str3));
		
	}

}