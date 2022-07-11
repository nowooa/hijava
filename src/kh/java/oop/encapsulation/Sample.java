package kh.java.oop.encapsulation;

import java.util.Random;

/**
 * 
 * �ʱ�ȭ��
 * - ���������� �ʱⰪ�� ������ �� �ִ� �ڵ��. ������ �����ÿ� �����ϴ�.
 * - ��������� �ʱ�ȭ�� {}
 * - Ŭ���������� �ʱ�ȭ�� static{}
 * 
 * �ʵ��� �����Լ���
 * 1. Ÿ�Ժ� �⺻��
 * 2. ����� �ʱⰪ
 * 3. �ʱ�ȭ�� ó����
 * 4. ������ ó����(���������)
 */
public class Sample {
	
	int a = 100;
	static int s = 3;
	int[] arr; // ���� 10�� 
	
	static {
		System.out.println("------- static �ʱ�ȭ �� ���� -------");
		System.out.println(s);
		s = 33;
		System.out.println("------- static �ʱ�ȭ �� �� -------");
	}
	
	//��������� �ʱ�ȭ��
	{
		System.out.println("------- �ʱ�ȭ �� ���� -------");
		System.out.println(a);
		a = 200;
		
		//���� 10�� ���� & arr�� ����
		arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100);
		}
		
		System.out.println("------- �ʱ�ȭ �� �� -------");
	}
	
	/**
	 * ������ �޼ҵ� - ��ü ����
	 * - Ŭ������� �����ڸ޼ҵ��� �̸��� ����.
	 * - ����Ÿ���� �ۼ����� �ʴ´�.
	 */
	public Sample() {
		System.out.println("====== ������ ���� =======");
		System.out.println(a);
		a = 300;
		System.out.println("====== ������ �� =======");
	}
	
	
}
