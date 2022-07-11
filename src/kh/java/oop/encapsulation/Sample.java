package kh.java.oop.encapsulation;

import java.util.Random;

/**
 * 
 * 초기화블럭
 * - 전역변수의 초기값을 설정할 수 있는 코드블럭. 복잡한 값세팅에 적합하다.
 * - 멤버변수용 초기화블럭 {}
 * - 클래스변수용 초기화블럭 static{}
 * 
 * 필드의 값대입순서
 * 1. 타입별 기본값
 * 2. 명시한 초기값
 * 3. 초기화블럭 처리값
 * 4. 생성자 처리값(멤버변수만)
 */
public class Sample {
	
	int a = 100;
	static int s = 3;
	int[] arr; // 난수 10개 
	
	static {
		System.out.println("------- static 초기화 블럭 시작 -------");
		System.out.println(s);
		s = 33;
		System.out.println("------- static 초기화 블럭 끝 -------");
	}
	
	//멤버변수용 초기화블럭
	{
		System.out.println("------- 초기화 블럭 시작 -------");
		System.out.println(a);
		a = 200;
		
		//난수 10개 생성 & arr에 대입
		arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100);
		}
		
		System.out.println("------- 초기화 블럭 끝 -------");
	}
	
	/**
	 * 생성자 메소드 - 객체 생성
	 * - 클래스명과 생성자메소드의 이름은 같다.
	 * - 리턴타입을 작성하지 않는다.
	 */
	public Sample() {
		System.out.println("====== 생성자 시작 =======");
		System.out.println(a);
		a = 300;
		System.out.println("====== 생성자 끝 =======");
	}
	
	
}
