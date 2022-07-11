package kh.java.oop.encapsulation;

public class StaticMethod02 {

		/*
		 * 1. 전달한 문자열을 모두 대문자로 바꾸는 static 메소드
		 * @param value
		 */
		public static String toUpper(String s){
			return s.toUpperCase();
		}
		
		/*
		 * 2. 문자열(1)에서 전달받은 인덱스(2)의 문자를 전달받은 문자(3)로 변경하는 static 메소드
		 * @param str
		 * @param index
		 * @param ch
		 * @return
		 */
		public static String setChar_(String str, int index, char ch){
//			char[] arr = str.toCharArray();
			char[] arr = new char[str.length()];
			for(int i = 0; i < arr.length; i++)
				arr[i] = str.charAt(i);
			
			// 문자대체
			arr[index] = ch;
			System.out.println(arr);
			// 문자배열 -> 문자열
			return new String(arr); /*String 클래스 소스코드참조*/
		}
		
		public static String setChar__(String str, int index, char ch){
			String strBefore = str.substring(0, index);
			String strAfter = str.substring(index + 1);
			System.out.printf("[%s][%c][%s]%n", strBefore, ch, strAfter);
			return strBefore + ch + strAfter;
		}
		
		/**
		 * 
		 * @author 염지영
		 * @param str
		 * @param index
		 * @param c
		 * @return
		 */
		public static String setChar(String str, int index, char c) {
			return str.replace(str.charAt(index), c);
		}
		
		/**
		 * 3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
		 *
		 */
		public static int getAlphabetLength(String s){
			if(s == null)
				return 0;
			
			int cnt = 0;
			for(int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(Character.isUpperCase(ch) || Character.isLowerCase(ch))
					cnt++;
			}
			return cnt; 
		}
		
		
		/**
		 * 4. 전달한 문자열값을 하나로 합쳐서 리턴 
		 * 
		 * @param str
		 * @return
		 */
		public static String concat(String s1, String s2){
			return s1 + s2;
		}

}
