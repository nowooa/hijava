package kh.java.oop.encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
//		System.out.print("정수입력 : ");
//		new Scanner(System.in).next();
		Sample sample = new Sample();
		System.out.println(sample.a);
		System.out.println(Arrays.toString(sample.arr));
		System.out.println(Sample.s);
	}

}

