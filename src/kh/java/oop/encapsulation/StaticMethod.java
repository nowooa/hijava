package kh.java.oop.encapsulation;


public class StaticMethod {
//	전달한 문자열을 모두 대문자로 바꾸는 static 메소드
	public static String toUpper(String s) {
		return s.toUpperCase();
	}

//	문자열(1)에서 전달받은 인덱스(2)의 문자를 전달받은 문자(3)로 변경하는 static 메소드
	public static String setChar(String s, int i, char c){
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(i,c);
		return sb.toString();
	}
	
	
		//3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
		//메소드명 : getAlphabetLength(String) : int
	public static int getAlphabetLength(String s) {
		return s.length();
	}
		//4. 전달한 문자열값을 하나로 합쳐서 리턴 
		//메소드명 : concat(String, String) : String
	public String concat(String s1, String s2) {
		return s1+s2;

	}
	
	
	
	
}



