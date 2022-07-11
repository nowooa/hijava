package kh.java.oop.encapsulation;


public class StaticMethod {
//	������ ���ڿ��� ��� �빮�ڷ� �ٲٴ� static �޼ҵ�
	public static String toUpper(String s) {
		return s.toUpperCase();
	}

//	���ڿ�(1)���� ���޹��� �ε���(2)�� ���ڸ� ���޹��� ����(3)�� �����ϴ� static �޼ҵ�
	public static String setChar(String s, int i, char c){
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(i,c);
		return sb.toString();
	}
	
	
		//3. ������ ���ڿ����� �������� ������ �����ϴ� static �޼ҵ�
		//�޼ҵ�� : getAlphabetLength(String) : int
	public static int getAlphabetLength(String s) {
		return s.length();
	}
		//4. ������ ���ڿ����� �ϳ��� ���ļ� ���� 
		//�޼ҵ�� : concat(String, String) : String
	public String concat(String s1, String s2) {
		return s1+s2;

	}
	
	
	
	
}



