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
		System.out.println("전달한 문자열을 모두 대문자로 바꾸는 static 메소드");
		System.out.print("대문자로 바꾸는 메소드 : ");
		System.out.println(sm.toUpper(sc.next()));
		
		System.out.println("문자열(1)에서 전달받은 인덱스(2)의 문자를 전달받은 문자(3)로 변경하는 static 메소드");
		System.out.print("문자열1 : ");
		String str1 = sc.next();
		System.out.print("인덱수 : ");
		int num = sc.nextInt();
		System.out.print("문자열2 : ");
		char cha = sc.next().charAt(0);
		System.out.println(sm.setChar(str1, num, cha));
		
		System.out.println("전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드");
		System.out.print("영문자의 개수를 리턴 : ");
		System.out.println(sm.getAlphabetLength(sc.next()));
		
		System.out.println("전달한 문자열값을 하나로 합쳐서 리턴 ");
		System.out.print("문자열1 : ");
		String str2 = sc.next();
		System.out.print("문자열2 : ");
		String str3 = sc.next();
		System.out.println(sm.concat(str2, str3));
		
	}

}