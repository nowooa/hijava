package kh.java.oop.encapsulation;

public class StaticMethod02 {

		/*
		 * 1. ������ ���ڿ��� ��� �빮�ڷ� �ٲٴ� static �޼ҵ�
		 * @param value
		 */
		public static String toUpper(String s){
			return s.toUpperCase();
		}
		
		/*
		 * 2. ���ڿ�(1)���� ���޹��� �ε���(2)�� ���ڸ� ���޹��� ����(3)�� �����ϴ� static �޼ҵ�
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
			
			// ���ڴ�ü
			arr[index] = ch;
			System.out.println(arr);
			// ���ڹ迭 -> ���ڿ�
			return new String(arr); /*String Ŭ���� �ҽ��ڵ�����*/
		}
		
		public static String setChar__(String str, int index, char ch){
			String strBefore = str.substring(0, index);
			String strAfter = str.substring(index + 1);
			System.out.printf("[%s][%c][%s]%n", strBefore, ch, strAfter);
			return strBefore + ch + strAfter;
		}
		
		/**
		 * 
		 * @author ������
		 * @param str
		 * @param index
		 * @param c
		 * @return
		 */
		public static String setChar(String str, int index, char c) {
			return str.replace(str.charAt(index), c);
		}
		
		/**
		 * 3. ������ ���ڿ����� �������� ������ �����ϴ� static �޼ҵ�
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
		 * 4. ������ ���ڿ����� �ϳ��� ���ļ� ���� 
		 * 
		 * @param str
		 * @return
		 */
		public static String concat(String s1, String s2){
			return s1 + s2;
		}

}
